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

/**
 *  @author Sebastian Dziak <sebastian.dziak@sulacosoft.com>
 */
public class BitcoinAddress {

	private String account;
	private String address;
	private boolean iscompressed;
	private boolean ismine;
	private boolean isscript;
	private boolean isvalid;
	private boolean iswatchonly;
	private String pubkey;
	private String scriptPubKey;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isIscompressed() {
		return iscompressed;
	}

	public void setIscompressed(boolean iscompressed) {
		this.iscompressed = iscompressed;
	}

	public boolean isIsmine() {
		return ismine;
	}

	public void setIsmine(boolean ismine) {
		this.ismine = ismine;
	}

	public boolean isIsscript() {
		return isscript;
	}

	public void setIsscript(boolean isscript) {
		this.isscript = isscript;
	}

	public boolean isIsvalid() {
		return isvalid;
	}

	public void setIsvalid(boolean isvalid) {
		this.isvalid = isvalid;
	}

	public boolean isIswatchonly() {
		return iswatchonly;
	}

	public void setIswatchonly(boolean iswatchonly) {
		this.iswatchonly = iswatchonly;
	}

	public String getPubkey() {
		return pubkey;
	}

	public void setPubkey(String pubkey) {
		this.pubkey = pubkey;
	}

	public String getScriptPubKey() {
		return scriptPubKey;
	}

	public void setScriptPubKey(String scriptPubKey) {
		this.scriptPubKey = scriptPubKey;
	}

	@Override
	public String toString() {
		return "BitcoinAddress [account=" + account + ", address=" + address + ", iscompressed=" + iscompressed
				+ ", ismine=" + ismine + ", isscript=" + isscript + ", isvalid=" + isvalid + ", iswatchonly="
				+ iswatchonly + ", pubkey=" + pubkey + ", scriptPubKey=" + scriptPubKey + "]";
	}

}
