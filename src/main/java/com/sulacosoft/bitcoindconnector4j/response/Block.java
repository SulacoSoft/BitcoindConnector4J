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
 *  @author Sebastian Dziak <sebastian.dziak@sulacosoft.com>
 */
public class Block {

	private String bits;
	private String chainwork;
	private long confirmations;
	private Double difficulty;
	private String hash;
	private long height;
	private String merkleroot;
	private String nextblockhash;
	private long nonce;
	private String previousblockhash;
	private long size;
	private long time;
	private List<String> tx;
	private long version;

	public String getBits() {
		return bits;
	}

	public void setBits(String bits) {
		this.bits = bits;
	}

	public String getChainwork() {
		return chainwork;
	}

	public void setChainwork(String chainwork) {
		this.chainwork = chainwork;
	}

	public long getConfirmations() {
		return confirmations;
	}

	public void setConfirmations(long confirmations) {
		this.confirmations = confirmations;
	}

	public Double getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Double difficulty) {
		this.difficulty = difficulty;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public long getHeight() {
		return height;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public String getMerkleroot() {
		return merkleroot;
	}

	public void setMerkleroot(String merkleroot) {
		this.merkleroot = merkleroot;
	}

	public String getNextblockhash() {
		return nextblockhash;
	}

	public void setNextblockhash(String nextblockhash) {
		this.nextblockhash = nextblockhash;
	}

	public long getNonce() {
		return nonce;
	}

	public void setNonce(long nonce) {
		this.nonce = nonce;
	}

	public String getPreviousblockhash() {
		return previousblockhash;
	}

	public void setPreviousblockhash(String previousblockhash) {
		this.previousblockhash = previousblockhash;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public List<String> getTx() {
		return tx;
	}

	public void setTx(List<String> tx) {
		this.tx = tx;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Block [bits=" + bits + ", chainwork=" + chainwork + ", confirmations=" + confirmations + ", difficulty="
				+ difficulty + ", hash=" + hash + ", height=" + height + ", merkleroot=" + merkleroot
				+ ", nextblockhash=" + nextblockhash + ", nonce=" + nonce + ", previousblockhash=" + previousblockhash
				+ ", size=" + size + ", time=" + time + ", tx=" + tx + ", version=" + version + "]";
	}

}
