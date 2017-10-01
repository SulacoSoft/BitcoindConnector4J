package com.sulacosoft.bitcoindconnector4j.response;

public class TransactionOutput {

	private String bestblock;
	private int confirmations;
	private int value;
	private ScriptPubKey scriptPubKey;
	private int version;
	private boolean coinbase;
	
	public String getBestblock() {
		return bestblock;
	}
	
	public void setBestblock(String bestblock) {
		this.bestblock = bestblock;
	}
	
	public int getConfirmations() {
		return confirmations;
	}
	
	public void setConfirmations(int confirmations) {
		this.confirmations = confirmations;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public ScriptPubKey getScriptPubKey() {
		return scriptPubKey;
	}
	
	public void setScriptPubKey(ScriptPubKey scriptPubKey) {
		this.scriptPubKey = scriptPubKey;
	}
	
	public int getVersion() {
		return version;
	}
	
	public void setVersion(int version) {
		this.version = version;
	}
	
	public boolean isCoinbase() {
		return coinbase;
	}
	
	public void setCoinbase(boolean coinbase) {
		this.coinbase = coinbase;
	}

	@Override
	public String toString() {
		return "TransactionOutput [bestblock=" + bestblock + ", confirmations=" + confirmations + ", value=" + value
				+ ", scriptPubKey=" + scriptPubKey + ", version=" + version + ", coinbase=" + coinbase + "]";
	}
}
