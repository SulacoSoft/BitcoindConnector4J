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

import com.sulacosoft.bitcoindconnector4j.core.BitcoindConnector4JException;
import com.sulacosoft.bitcoindconnector4j.response.BitcoinAddress;
import com.sulacosoft.bitcoindconnector4j.response.Transaction;
import com.sulacosoft.bitcoindconnector4j.response.Block;
import com.sulacosoft.bitcoindconnector4j.response.Info;
import com.sulacosoft.bitcoindconnector4j.response.ReceivedByAccount;
import com.sulacosoft.bitcoindconnector4j.response.SinceBlock;
import com.sulacosoft.bitcoindconnector4j.response.TransactionDetails;

/**
 *  @author Sebastian Dziak <sebastian.dziak@sulacosoft.com>
 */
public interface BitcoindApi {

	String getaccount(String bitcoinAddress) throws BitcoindConnector4JException;

	String getaccountaddress(String account) throws BitcoindConnector4JException;

	List<String> getaddressesbyaccount(String account) throws BitcoindConnector4JException;

	int getconnectioncount() throws BitcoindConnector4JException;

	String getnewaddress(String account) throws BitcoindConnector4JException;

	Double getbalance() throws BitcoindConnector4JException;

	Double getbalance(String account) throws BitcoindConnector4JException;

	Double getbalance(String account, long minconf) throws BitcoindConnector4JException;

	String getbestblockhash() throws BitcoindConnector4JException;

	Block getblock(String hash) throws BitcoindConnector4JException;

	Double getdifficulty() throws BitcoindConnector4JException;

	boolean getgenerate() throws BitcoindConnector4JException;

	long gethashespersec() throws BitcoindConnector4JException;

	Info getinfo() throws BitcoindConnector4JException;

	TransactionDetails gettransaction(String txid);

	Map<String, Double> listaccounts() throws BitcoindConnector4JException;

	Map<String, Double> listaccounts(long confirms) throws BitcoindConnector4JException;

	List<ReceivedByAccount> listreceivedbyaccount() throws BitcoindConnector4JException;

	List<ReceivedByAccount> listreceivedbyaccount(long confirms) throws BitcoindConnector4JException;

	List<ReceivedByAccount> listreceivedbyaccount(long confirms, boolean includeEmpty)
			throws BitcoindConnector4JException;

	List<Transaction> listtransactions();

	List<Transaction> listtransactions(String account);

	List<Transaction> listtransactions(String account, long count);

	List<Transaction> listtransactions(String account, long count, long from);

	SinceBlock listsinceblock();

	SinceBlock listsinceblock(String blockhash);

	SinceBlock listsinceblock(String blockhash, long targetConfirmations);

	Double getreceivedbyaddress(String address) throws BitcoindConnector4JException;

	Double getreceivedbyaddress(String address, long confirms) throws BitcoindConnector4JException;

	boolean move(String fromaccount, String toaccount, Double amount);

	boolean move(String fromaccount, String toaccount, Double amount, long minconf);

	boolean move(String fromaccount, String toaccount, Double amount, long minconf, String comment);

	String sendfrom(String fromaccount, String tobitcoinaddress, Double amount) throws BitcoindConnector4JException;

	String sendfrom(String fromaccount, String tobitcoinaddress, Double amount, long minconf)
			throws BitcoindConnector4JException;

	String sendfrom(String fromaccount, String tobitcoinaddress, Double amount, long minconf, String comment)
			throws BitcoindConnector4JException;

	String sendfrom(String fromaccount, String tobitcoinaddress, Double amount, long minconf, String comment,
			String commentto) throws BitcoindConnector4JException;

	BitcoinAddress validateaddress(String address) throws BitcoindConnector4JException;

}
