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
public class MiningInfo {

    private Integer blocks;
    private Integer currentblockweight;
    private Integer currentblocktx;
    private Integer difficulty;
    private Double networkhashps;
    private Integer pooledtx;
    private String chain;
    private String warnings;

    public Integer getBlocks() {
        return blocks;
    }

    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    public Integer getCurrentblockweight() {
        return currentblockweight;
    }

    public void setCurrentblockweight(Integer currentblockweight) {
        this.currentblockweight = currentblockweight;
    }

    public Integer getCurrentblocktx() {
        return currentblocktx;
    }

    public void setCurrentblocktx(Integer currentblocktx) {
        this.currentblocktx = currentblocktx;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Double getNetworkhashps() {
        return networkhashps;
    }

    public void setNetworkhashps(Double networkhashps) {
        this.networkhashps = networkhashps;
    }

    public Integer getPooledtx() {
        return pooledtx;
    }

    public void setPooledtx(Integer pooledtx) {
        this.pooledtx = pooledtx;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    @Override
    public String toString() {
        return "MiningInfo [blocks=" + blocks + ", currentblockweight=" + currentblockweight + ", currentblocktx="
                + currentblocktx + ", difficulty=" + difficulty + ", networkhashps=" + networkhashps + ", pooledtx="
                + pooledtx + ", chain=" + chain + ", warnings=" + warnings + "]";
    }
}
