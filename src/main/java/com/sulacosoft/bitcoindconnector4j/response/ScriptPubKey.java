package com.sulacosoft.bitcoindconnector4j.response;

import java.util.List;

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