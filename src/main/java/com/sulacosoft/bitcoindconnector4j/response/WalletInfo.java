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
 * @author Nicola Atzei {@literal (atzeinicola@gmail.com)}
 */
public class WalletInfo {

    private String walletname;
    private Integer walletversion;
    private Double balance;
    private Double unconfirmed_balance;
    private Double immature_balance;
    private Integer txcount;
    private Integer keypoololdest;
    private Integer keypoolsize;
    private Double ipaytxfee;
    private String hdmasterkeyid;

    public String getWalletname() {
        return walletname;
    }

    public void setWalletname(String walletname) {
        this.walletname = walletname;
    }

    public Integer getWalletversion() {
        return walletversion;
    }

    public void setWalletversion(Integer walletversion) {
        this.walletversion = walletversion;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getUnconfirmed_balance() {
        return unconfirmed_balance;
    }

    public void setUnconfirmed_balance(Double unconfirmed_balance) {
        this.unconfirmed_balance = unconfirmed_balance;
    }

    public Double getImmature_balance() {
        return immature_balance;
    }

    public void setImmature_balance(Double immature_balance) {
        this.immature_balance = immature_balance;
    }

    public Integer getTxcount() {
        return txcount;
    }

    public void setTxcount(Integer txcount) {
        this.txcount = txcount;
    }

    public Integer getKeypoololdest() {
        return keypoololdest;
    }

    public void setKeypoololdest(Integer keypoololdest) {
        this.keypoololdest = keypoololdest;
    }

    public Integer getKeypoolsize() {
        return keypoolsize;
    }

    public void setKeypoolsize(Integer keypoolsize) {
        this.keypoolsize = keypoolsize;
    }

    public Double getIpaytxfee() {
        return ipaytxfee;
    }

    public void setIpaytxfee(Double ipaytxfee) {
        this.ipaytxfee = ipaytxfee;
    }

    public String getHdmasterkeyid() {
        return hdmasterkeyid;
    }

    public void setHdmasterkeyid(String hdmasterkeyid) {
        this.hdmasterkeyid = hdmasterkeyid;
    }

    @Override
    public String toString() {
        return "WalletInfo [walletname=" + walletname + ", walletversion=" + walletversion + ", balance=" + balance
                + ", unconfirmed_balance=" + unconfirmed_balance + ", immature_balance=" + immature_balance
                + ", txcount=" + txcount + ", keypoololdest=" + keypoololdest + ", keypoolsize=" + keypoolsize
                + ", ipaytxfee=" + ipaytxfee + ", hdmasterkeyid=" + hdmasterkeyid + "]";
    }
}
