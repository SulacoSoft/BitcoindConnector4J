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
public class BlockchainInfo {
    
    private String chain;
    private Integer blocks;
    private Integer headers;
    private String bestblockhash;
    private Integer difficulty;
    private Integer mediantime;
    private Double verificationprogress;
    private String chainwork;
    private Long size_on_disk;
    private Boolean pruned;
    private Object softforks;
    private Object bip9_softforks;
    private String warnings;

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public Integer getBlocks() {
        return blocks;
    }

    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    public Integer getHeaders() {
        return headers;
    }

    public void setHeaders(Integer headers) {
        this.headers = headers;
    }

    public String getBestblockhash() {
        return bestblockhash;
    }

    public void setBestblockhash(String bestblockhash) {
        this.bestblockhash = bestblockhash;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getMediantime() {
        return mediantime;
    }

    public void setMediantime(Integer mediantime) {
        this.mediantime = mediantime;
    }

    public Double getVerificationprogress() {
        return verificationprogress;
    }

    public void setVerificationprogress(Double verificationprogress) {
        this.verificationprogress = verificationprogress;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public Long getSize_on_disk() {
        return size_on_disk;
    }

    public void setSize_on_disk(Long size_on_disk) {
        this.size_on_disk = size_on_disk;
    }

    public Boolean getPruned() {
        return pruned;
    }

    public void setPruned(Boolean pruned) {
        this.pruned = pruned;
    }

    public Object getSoftforks() {
        return softforks;
    }

    public void setSoftforks(Object softworks) {
        this.softforks = softworks;
    }

    public Object getBip9_softforks() {
        return bip9_softforks;
    }

    public void setBip9_softforks(Object bip9_softworks) {
        this.bip9_softforks = bip9_softworks;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    @Override
    public String toString() {
        return "BlockchainInfo [chain=" + chain + ", blocks=" + blocks + ", headers=" + headers + ", bestblockhash="
                + bestblockhash + ", difficulty=" + difficulty + ", mediantime=" + mediantime
                + ", verificationprogress=" + verificationprogress + ", chainwork=" + chainwork + ", size_on_disk="
                + size_on_disk + ", pruned=" + pruned + ", softworks=" + softforks + ", bip9_softworks="
                + bip9_softforks + ", warnings=" + warnings + "]";
    }
}
