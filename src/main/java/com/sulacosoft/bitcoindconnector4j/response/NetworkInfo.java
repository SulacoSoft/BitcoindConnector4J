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
 * @author Nicola Atzei {@literal (atzeinicola@gmail.com)}
 */
public class NetworkInfo {

    private Integer version;
    private String subversion;
    private Integer protocolversion;
    private String localservices;
    private Boolean localrelay;  
    private Integer timeoffset;
    private Boolean networkactive;  
    private Integer connections;
    private List<Network> networks;
    private Double relayfee;  
    private Double incrementalfee;  
    private List<Address> localaddresses;
    private String warnings;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getSubversion() {
        return subversion;
    }

    public void setSubversion(String subversion) {
        this.subversion = subversion;
    }

    public Integer getProtocolversion() {
        return protocolversion;
    }

    public void setProtocolversion(Integer protocolversion) {
        this.protocolversion = protocolversion;
    }

    public String getLocalservices() {
        return localservices;
    }

    public void setLocalservices(String localservices) {
        this.localservices = localservices;
    }

    public Boolean getLocalrelay() {
        return localrelay;
    }

    public void setLocalrelay(Boolean localrelay) {
        this.localrelay = localrelay;
    }

    public Integer getTimeoffset() {
        return timeoffset;
    }

    public void setTimeoffset(Integer timeoffset) {
        this.timeoffset = timeoffset;
    }

    public Boolean getNetworkactive() {
        return networkactive;
    }

    public void setNetworkactive(Boolean networkactive) {
        this.networkactive = networkactive;
    }

    public Integer getConnections() {
        return connections;
    }

    public void setConnections(Integer connections) {
        this.connections = connections;
    }

    public List<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(List<Network> networks) {
        this.networks = networks;
    }

    public Double getRelayfee() {
        return relayfee;
    }

    public void setRelayfee(Double relayfee) {
        this.relayfee = relayfee;
    }

    public Double getIncrementalfee() {
        return incrementalfee;
    }

    public void setIncrementalfee(Double incrementalfee) {
        this.incrementalfee = incrementalfee;
    }

    public List<Address> getLocaladdresses() {
        return localaddresses;
    }

    public void setLocaladdresses(List<Address> localaddresses) {
        this.localaddresses = localaddresses;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    @Override
    public String toString() {
        return "NetworkInfo [version=" + version + ", subversion=" + subversion + ", protocolversion=" + protocolversion
                + ", localservices=" + localservices + ", localrelay=" + localrelay + ", timeoffset=" + timeoffset
                + ", networkactive=" + networkactive + ", connections=" + connections + ", networks=" + networks
                + ", relayfee=" + relayfee + ", incrementalfee=" + incrementalfee + ", localaddresses=" + localaddresses
                + ", warnings=" + warnings + "]";
    }

    public class Network {
        private String name;
        private Boolean limited;
        private Boolean reachable;
        private String proxy;
        private Boolean proxy_randomize_credentials;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getLimited() {
            return limited;
        }

        public void setLimited(Boolean limited) {
            this.limited = limited;
        }

        public Boolean getReachable() {
            return reachable;
        }

        public void setReachable(Boolean reachable) {
            this.reachable = reachable;
        }

        public String getProxy() {
            return proxy;
        }

        public void setProxy(String proxy) {
            this.proxy = proxy;
        }

        public Boolean getProxy_randomize_credentials() {
            return proxy_randomize_credentials;
        }

        public void setProxy_randomize_credentials(Boolean proxy_randomize_credentials) {
            this.proxy_randomize_credentials = proxy_randomize_credentials;
        }

        @Override
        public String toString() {
            return "Network [name=" + name + ", limited=" + limited + ", reachable=" + reachable + ", proxy=" + proxy
                    + ", proxy_randomize_credentials=" + proxy_randomize_credentials + "]";
        }
    }

    public class Address {
        private String address;
        private Integer port;
        private Integer score;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Address [address=" + address + ", port=" + port + ", score=" + score + "]";
        }
    }
}
