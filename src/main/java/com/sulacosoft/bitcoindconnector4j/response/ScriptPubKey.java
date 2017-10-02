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

package com.sulacosoft.bitcoindconnector4j.response;

import java.util.List;

/**
 * @author Nicola Atzei
 */
public class ScriptPubKey {
	private String asm;
	private String hex;
	private int reqSigs;
	private String type;
	private List<String> addresses;

	public String getAsm() {
		return asm;
	}

	public void setAsm(String asm) {
		this.asm = asm;
	}

	public String getHex() {
		return hex;
	}

	public void setHex(String hex) {
		this.hex = hex;
	}

	public int getReqSigs() {
		return reqSigs;
	}

	public void setReqSigs(int reqSigs) {
		this.reqSigs = reqSigs;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "ScriptPubKey [asm=" + asm + ", hex=" + hex + ", reqSigs=" + reqSigs + ", type=" + type
				+ ", addresses=" + addresses + "]";
	}

}