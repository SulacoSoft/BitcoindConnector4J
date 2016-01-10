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
public class TransactionDetails {

	private Double amount;
	private String blockhash;
	private long blockindex;
	private long blocktime;
	private long confirmations;
	private String hex;
	private long time;
	private long timereceived;
	private String txid;
	private List<String> walletconflicts;
	public List<TransactionDetails> details;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getBlockhash() {
		return blockhash;
	}

	public void setBlockhash(String blockhash) {
		this.blockhash = blockhash;
	}

	public long getBlockindex() {
		return blockindex;
	}

	public void setBlockindex(long blockindex) {
		this.blockindex = blockindex;
	}

	public long getBlocktime() {
		return blocktime;
	}

	public void setBlocktime(long blocktime) {
		this.blocktime = blocktime;
	}

	public long getConfirmations() {
		return confirmations;
	}

	public void setConfirmations(long confirmations) {
		this.confirmations = confirmations;
	}

	public String getHex() {
		return hex;
	}

	public void setHex(String hex) {
		this.hex = hex;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public long getTimereceived() {
		return timereceived;
	}

	public void setTimereceived(long timereceived) {
		this.timereceived = timereceived;
	}

	public String getTxid() {
		return txid;
	}

	public void setTxid(String txid) {
		this.txid = txid;
	}

	public List<String> getWalletconflicts() {
		return walletconflicts;
	}

	public void setWalletconflicts(List<String> walletconflicts) {
		this.walletconflicts = walletconflicts;
	}

	public List<TransactionDetails> getDetails() {
		return details;
	}

	public void setDetails(List<TransactionDetails> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "TransactionDetails [amount=" + amount + ", blockhash=" + blockhash + ", blockindex=" + blockindex
				+ ", blocktime=" + blocktime + ", confirmations=" + confirmations + ", hex=" + hex + ", time=" + time
				+ ", timereceived=" + timereceived + ", txid=" + txid + ", walletconflicts=" + walletconflicts
				+ ", details=" + details + "]";
	}

}
