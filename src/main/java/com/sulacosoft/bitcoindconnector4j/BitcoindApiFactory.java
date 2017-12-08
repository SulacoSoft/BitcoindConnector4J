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

import java.lang.reflect.Proxy;
import java.util.concurrent.TimeUnit;

import com.sulacosoft.bitcoindconnector4j.core.BitcoindConnector4JException;

/**
 *  @author Sebastian Dziak {@literal (sebastian.dziak@sulacosoft.com)}
 */
public class BitcoindApiFactory {

	public static BitcoindApi createConnection(String host, int port, String protocol, String username, String password)
			throws BitcoindConnector4JException {
		return createConnection(host, port, protocol, "/", username, password);
	}

	public static BitcoindApi createConnection(String host, int port, String protocol, String uri, String username,
			String password) throws BitcoindConnector4JException {
		return createConnection(host, port, protocol, uri, username, password, -1, TimeUnit.MILLISECONDS);
	}
	
	public static BitcoindApi createConnection(String host, int port, String protocol, String uri, String username,
			String password, int timeout, TimeUnit unit) throws BitcoindConnector4JException {
		BitcoindApiHandler handler = new BitcoindApiHandler(host, port, protocol, uri, username, password);
		handler.setTimeout(timeout, unit);
		
		BitcoindApi api = (BitcoindApi) Proxy.newProxyInstance(BitcoindApi.class.getClassLoader(),
				new Class[] { BitcoindApi.class }, handler);

		// test connection to bitcoind
		api.getinfo();

		return api;
	}

}
