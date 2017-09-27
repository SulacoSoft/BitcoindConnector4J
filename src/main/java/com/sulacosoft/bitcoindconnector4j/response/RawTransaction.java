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

import java.math.BigDecimal;
import java.util.List;

import com.sulacosoft.bitcoindconnector4j.response.RawTransaction.Vin.Vout;

/**
 * @author Sebastian Dziak {@literal (sebastian.dziak@sulacosoft.com)}
 */
public class RawTransaction {

	private String hex;
	private String txid;
	private String hash;
	private int size;
	private int vsize;
	private int version;
	private int locktime;
	private String blockhash;
	private int confirmations;
	private long time;
	private long blocktime;
	private List<Vin> vin;
	private List<Vout> vout;

	public String getHex() {
		return hex;
	}

	public void setHex(String hex) {
		this.hex = hex;
	}

	public String getTxid() {
		return txid;
	}

	public void setTxid(String txid) {
		this.txid = txid;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getVsize() {
		return vsize;
	}

	public void setVsize(int vsize) {
		this.vsize = vsize;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getLocktime() {
		return locktime;
	}

	public void setLocktime(int locktime) {
		this.locktime = locktime;
	}

	public String getBlockhash() {
		return blockhash;
	}

	public void setBlockhash(String blockhash) {
		this.blockhash = blockhash;
	}

	public int getConfirmations() {
		return confirmations;
	}

	public void setConfirmations(int confirmations) {
		this.confirmations = confirmations;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public long getBlocktime() {
		return blocktime;
	}

	public void setBlocktime(long blocktime) {
		this.blocktime = blocktime;
	}

	public List<Vin> getVin() {
		return vin;
	}

	public void setVin(List<Vin> vin) {
		this.vin = vin;
	}

	public List<Vout> getVout() {
		return vout;
	}

	public void setVout(List<Vout> vout) {
		this.vout = vout;
	}

	@Override
	public String toString() {
		return "RawTransaction [hex=" + hex + ", txid=" + txid + ", hash=" + hash + ", size=" + size + ", vsize="
				+ vsize + ", version=" + version + ", locktime=" + locktime + ", blockhash=" + blockhash
				+ ", confirmations=" + confirmations + ", time=" + time + ", blocktime=" + blocktime + ", vin=" + vin
				+ ", vout=" + vout + "]";
	}

	public class Vin {
		private String txid;
		private int vout;
		private long sequence;
		private ScriptSig scriptSig;

		public String getTxid() {
			return txid;
		}

		public void setTxid(String txid) {
			this.txid = txid;
		}

		public int getVout() {
			return vout;
		}

		public void setVout(int vout) {
			this.vout = vout;
		}

		public long getSequence() {
			return sequence;
		}

		public void setSequence(long sequence) {
			this.sequence = sequence;
		}

		public ScriptSig getScriptSig() {
			return scriptSig;
		}

		public void setScriptSig(ScriptSig scriptSig) {
			this.scriptSig = scriptSig;
		}

		@Override
		public String toString() {
			return "Vin [txid=" + txid + ", vout=" + vout + ", sequence=" + sequence + ", scriptSig=" + scriptSig + "]";
		}

		class ScriptSig {
			private String asm;
			private String hex;

			public String getAsm() {
				return asm;
			}

			public void setAsm(String asm) {
				this.asm = asm;
			}

			public String getHex() {
				return hex;
			}

			public void setHex(String hex) {
				this.hex = hex;
			}

			@Override
			public String toString() {
				return "ScriptSig [asm=" + asm + ", hex=" + hex + "]";
			}

		}

		public class Vout {
			private BigDecimal value;
			private int n;
			private ScriptPubKey scriptPubKey;

			public BigDecimal getValue() {
				return value;
			}

			public void setValue(BigDecimal value) {
				this.value = value;
			}

			public int getN() {
				return n;
			}

			public void setN(int n) {
				this.n = n;
			}

			public ScriptPubKey getScriptPubKey() {
				return scriptPubKey;
			}

			public void setScriptPubKey(ScriptPubKey scriptPubKey) {
				this.scriptPubKey = scriptPubKey;
			}

			@Override
			public String toString() {
				return "Vout [value=" + value + ", n=" + n + ", scriptPubKey=" + scriptPubKey + "]";
			}

			class ScriptPubKey {
				private String asm;
				private String hex;
				private int reqSigs;
				private String type;
				private List<String> addresses;

				public String getAsm() {
					return asm;
				}

				public void setAsm(String asm) {
					this.asm = asm;
				}

				public String getHex() {
					return hex;
				}

				public void setHex(String hex) {
					this.hex = hex;
				}

				public int getReqSigs() {
					return reqSigs;
				}

				public void setReqSigs(int reqSigs) {
					this.reqSigs = reqSigs;
				}

				public String getType() {
					return type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public List<String> getAddresses() {
					return addresses;
				}

				public void setAddresses(List<String> addresses) {
					this.addresses = addresses;
				}

				@Override
				public String toString() {
					return "ScriptPubKey [asm=" + asm + ", hex=" + hex + ", reqSigs=" + reqSigs + ", type=" + type
							+ ", addresses=" + addresses + "]";
				}

			}
		}
	}
}
