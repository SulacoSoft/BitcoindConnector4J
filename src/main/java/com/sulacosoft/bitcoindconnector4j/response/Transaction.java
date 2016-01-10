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

import java.util.Arrays;

/**
 *  @author Sebastian Dziak <sebastian.dziak@sulacosoft.com>
 */
public class Transaction {

	private String account;
	private String address;
	private Double amount;
	private String blockhash;
	private long blockindex;
	private long blocktime;
	private String category;
	private long confirmations;
	private String comment;
	private Double fee;
	private String otheraccount;
	private long time;
	private long timereceived;
	private String txid;
	private long vout;
	private Object walletconflicts[];

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getConfirmations() {
		return confirmations;
	}

	public void setConfirmations(long confirmations) {
		this.confirmations = confirmations;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public String getOtheraccount() {
		return otheraccount;
	}

	public void setOtheraccount(String otheraccount) {
		this.otheraccount = otheraccount;
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

	public long getVout() {
		return vout;
	}

	public void setVout(long vout) {
		this.vout = vout;
	}

	public Object[] getWalletconflicts() {
		return walletconflicts;
	}

	public void setWalletconflicts(Object[] walletconflicts) {
		this.walletconflicts = walletconflicts;
	}

	@Override
	public String toString() {
		return "Transaction [account=" + account + ", address=" + address + ", amount=" + amount + ", blockhash="
				+ blockhash + ", blockindex=" + blockindex + ", blocktime=" + blocktime + ", category=" + category
				+ ", confirmations=" + confirmations + ", comment=" + comment + ", fee=" + fee + ", otheraccount="
				+ otheraccount + ", time=" + time + ", timereceived=" + timereceived + ", txid=" + txid + ", vout="
				+ vout + ", walletconflicts=" + Arrays.toString(walletconflicts) + "]";
	}

}
