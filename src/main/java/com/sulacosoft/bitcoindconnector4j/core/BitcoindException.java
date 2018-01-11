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

package com.sulacosoft.bitcoindconnector4j.core;

/**
 *  @author Sebastian Dziak {@literal (sebastian.dziak@sulacosoft.com)}
 *  @author Nicola Atzei
 */
public class BitcoindException extends Error {

	private static final long serialVersionUID = 4505365298463956527L;

	private RPCErrorCode code;

	public BitcoindException(String message, RPCErrorCode code) {
		super(message);
		this.code = code;
	}

	public RPCErrorCode getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "BitcoindException [code=" + code + ", message=" + getMessage() + "]";
	}

}
