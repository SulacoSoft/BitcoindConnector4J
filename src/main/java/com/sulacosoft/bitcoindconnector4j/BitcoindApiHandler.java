/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sulacosoft.bitcoindconnector4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.sulacosoft.bitcoindconnector4j.core.BitcoindException;
import com.sulacosoft.bitcoindconnector4j.core.HttpException;

import net.sf.ezmorph.bean.MorphDynaBean;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

/**
 *  @author Sebastian Dziak {@literal (sebastian.dziak@sulacosoft.com)}
 */
public class BitcoindApiHandler implements InvocationHandler {

	private static final String CHARACTER_ENCODING = "UTF-8";

	private String uri;
	private CloseableHttpClient httpClient;
	private HttpHost targetHost;
	private HttpClientContext context;
	private AtomicLong id = new AtomicLong(1L);

	public BitcoindApiHandler(String host, int port, String protocol, String uri, String username, String password) {
		this.uri = uri;

		httpClient = HttpClients.createDefault();
		targetHost = new HttpHost(host, port, protocol);
		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		credsProvider.setCredentials(new AuthScope(targetHost.getHostName(), targetHost.getPort()),
				new UsernamePasswordCredentials(username, password));

		AuthCache authCache = new BasicAuthCache();
		BasicScheme basicAuth = new BasicScheme();
		authCache.put(targetHost, basicAuth);

		context = HttpClientContext.create();
		context.setCredentialsProvider(credsProvider);
		context.setAuthCache(authCache);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String jsonRequest = String.format("{\"jsonrpc\": \"2.0\", \"method\": \"%s\", \"params\": [%s], \"id\": %s}",
				method.getName(), buildParamsString(args), id.getAndIncrement());

		HttpPost httpPost = new HttpPost(uri);
		httpPost.setEntity(new ByteArrayEntity(jsonRequest.getBytes(CHARACTER_ENCODING)));
		CloseableHttpResponse response = httpClient.execute(targetHost, httpPost, context);
		try {

			checkHttpErrors(response.getStatusLine().getStatusCode());

			String jsonResponse = IOUtils.toString(response.getEntity().getContent(), CHARACTER_ENCODING);
			JSONObject jsonObject = JSONObject.fromObject(jsonResponse);
			MorphDynaBean baseResponse = (MorphDynaBean) JSONObject.toBean(jsonObject);

			checkBitcoindErrors((MorphDynaBean) baseResponse.get("error"));

			return deserializeResult(method, baseResponse.get("result"));

		} finally {
			response.close();
		}
	}

	private String buildParamsString(Object[] args) {
		StringBuilder params = new StringBuilder();
		if (args != null && args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				if (i > 0)
					params.append(",");
				Object arg = args[i];
				if (arg instanceof String)
					params.append(String.format("\"%s\"", arg));
				else
					params.append(String.format("%s", arg));
			}
		}
		return params.toString();
	}

	private void checkHttpErrors(int statusCode) throws HttpException {
		if (statusCode != HttpStatus.SC_OK && statusCode != HttpStatus.SC_INTERNAL_SERVER_ERROR) {
			if (statusCode == HttpStatus.SC_UNAUTHORIZED)
				throw new HttpException(String.format(
						"Bitcoind JSON-RPC HTTP error (Probably an incorrect username or password). HTTP Status-Code %s",
						statusCode), statusCode);
			else
				throw new HttpException(String.format("Bitcoind JSON-RPC HTTP error. HTTP Status-Code %s", statusCode),
						statusCode);
		}
	}

	private void checkBitcoindErrors(MorphDynaBean jsonError) throws BitcoindException {
		if (jsonError != null) {
			com.sulacosoft.bitcoindconnector4j.response.Error error = (com.sulacosoft.bitcoindconnector4j.response.Error) JSONObject
					.toBean(JSONObject.fromObject(jsonError), com.sulacosoft.bitcoindconnector4j.response.Error.class);
			throw new BitcoindException(error.getMessage(), error.getCode());
		}
	}

	private Object deserializeResult(Method method, Object result) {
		if (result instanceof MorphDynaBean) {
			return JSONObject.toBean(JSONObject.fromObject(JSONSerializer.toJSON((MorphDynaBean) result)),
					method.getReturnType());
		} else if (result instanceof List) {
			List<?> incomingList = (List<?>) result;
			if (incomingList.size() == 0)
				return Collections.EMPTY_LIST;

			ParameterizedType type = (ParameterizedType) method.getGenericReturnType(); // method.getGenericType();
			Class<?> clazz = (Class<?>) type.getActualTypeArguments()[0];

			ArrayList<Object> outcomingList = new ArrayList<>();
			if (incomingList.get(0) instanceof MorphDynaBean) {
				for (Object entity : incomingList) {
					Object ent = JSONObject.toBean(JSONObject.fromObject(entity), clazz);
					outcomingList.add(ent);
				}
			} else {
				outcomingList.addAll(incomingList);
			}
			return outcomingList;
		} else {
			return result;
		}
	}

}
