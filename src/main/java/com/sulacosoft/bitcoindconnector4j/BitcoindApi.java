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

import java.util.List;
import java.util.Map;

import com.sulacosoft.bitcoindconnector4j.response.BitcoinAddress;
import com.sulacosoft.bitcoindconnector4j.response.Block;
import com.sulacosoft.bitcoindconnector4j.response.Info;
import com.sulacosoft.bitcoindconnector4j.response.ReceivedByAccount;
import com.sulacosoft.bitcoindconnector4j.response.ReceivedByAddress;
import com.sulacosoft.bitcoindconnector4j.response.SinceBlock;
import com.sulacosoft.bitcoindconnector4j.response.Transaction;
import com.sulacosoft.bitcoindconnector4j.response.TransactionDetails;

/**
 * @author Sebastian Dziak {@literal (sebastian.dziak@sulacosoft.com)}
 */
public interface BitcoindApi {

	int getblockcount();

	String getaccount(String bitcoinAddress);

	String getaccountaddress(String account);

	List<String> getaddressesbyaccount(String account);

	int getconnectioncount();

	String getnewaddress(String account);

	Double getbalance();

	Double getbalance(String account);

	Double getbalance(String account, long minconf);

	String getbestblockhash();

	Block getblock(String hash);

	Double getdifficulty();

	boolean getgenerate();

	long gethashespersec();

	Info getinfo();

	TransactionDetails gettransaction(String txid);

	Map<String, Double> listaccounts();

	Map<String, Double> listaccounts(long confirms);

	List<ReceivedByAccount> listreceivedbyaccount();

	List<ReceivedByAccount> listreceivedbyaccount(long confirms);

	List<ReceivedByAccount> listreceivedbyaccount(long confirms, boolean includeEmpty);

	List<ReceivedByAddress> listreceivedbyaddress();

	List<ReceivedByAddress> listreceivedbyaddress(long confirms);

	List<ReceivedByAddress> listreceivedbyaddress(long confirms, boolean includeEmpty);

	List<Transaction> listtransactions();

	List<Transaction> listtransactions(String account);

	List<Transaction> listtransactions(String account, long count);

	List<Transaction> listtransactions(String account, long count, long from);

	SinceBlock listsinceblock();

	SinceBlock listsinceblock(String blockhash);

	SinceBlock listsinceblock(String blockhash, long targetConfirmations);

	Double getreceivedbyaddress(String address);

	Double getreceivedbyaddress(String address, long confirms);

	boolean move(String fromaccount, String toaccount, Double amount);

	boolean move(String fromaccount, String toaccount, Double amount, long minconf);

	boolean move(String fromaccount, String toaccount, Double amount, long minconf, String comment);

	String sendfrom(String fromaccount, String tobitcoinaddress, Double amount);

	String sendfrom(String fromaccount, String tobitcoinaddress, Double amount, long minconf);

	String sendfrom(String fromaccount, String tobitcoinaddress, Double amount, long minconf, String comment);

	String sendfrom(String fromaccount, String tobitcoinaddress, Double amount, long minconf, String comment,
			String commentto);

	BitcoinAddress validateaddress(String address);

}
