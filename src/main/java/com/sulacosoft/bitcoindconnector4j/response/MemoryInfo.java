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
public class MemoryInfo {
    
    private Locked locked;

    public Locked getLocked() {
        return locked;
    }

    public void setLocked(Locked locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "MemoryInfo [locked=" + locked + "]";
    }

    class Locked {
        
        private Integer used;
        private Integer free;
        private Integer total;
        private Integer locked;
        private Integer chunks_used;
        private Integer chunks_free;
        public Integer getUsed() {
            return used;
        }
        public void setUsed(Integer used) {
            this.used = used;
        }

        public Integer getFree() {
            return free;
        }

        public void setFree(Integer free) {
            this.free = free;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getLocked() {
            return locked;
        }

        public void setLocked(Integer locked) {
            this.locked = locked;
        }

        public Integer getChunks_used() {
            return chunks_used;
        }

        public void setChunks_used(Integer chunks_used) {
            this.chunks_used = chunks_used;
        }

        public Integer getChunks_free() {
            return chunks_free;
        }

        public void setChunks_free(Integer chunks_free) {
            this.chunks_free = chunks_free;
        }
        
        @Override
        public String toString() {
            return "Locked [used=" + used + ", free=" + free + ", total=" + total + ", locked=" + locked
                    + ", chunks_used=" + chunks_used + ", chunks_free=" + chunks_free + "]";
        }
    }
}
