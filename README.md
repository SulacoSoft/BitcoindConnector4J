## Introduction

BitcoindConnector4J is a Java library to call the JSON-RPC API of the Bitcoind server.

	                                           +------------------------------------------+
	                                           | JVM                                      |
	                     +----------+          +---------------------+      +----------+  |
	                     |          | JSON-RPC |                     |      |          |  |
	Bitcoin P2P net <--> | Bitcoind | <------> | BitcoindConnector4J | <--> | Java App |  |
	                     |          |          |                     |      |          |  |
	                     +----------+          +---------------------+      +----------+  |
	                                           |                                          |
	                                           +------------------------------------------+

## Code Example

Example how to connect and call methods:

	import java.util.Map;
	
	import com.sulacosoft.bitcoindconnector4j.BitcoindApi;
	import com.sulacosoft.bitcoindconnector4j.BitcoindApiFactory;
	import com.sulacosoft.bitcoindconnector4j.core.BitcoindConnector4JException;
	import com.sulacosoft.bitcoindconnector4j.response.Info;
	
	public class ExampleMain {
	
		public static void main(String[] args) throws BitcoindConnector4JException {
	
			// bitcoind server connection parameters
			String address = "127.0.0.1";
			int port = 8333;
			String protocol = "http";
			String user = "bitcoind_user";
			String password = "bitcoind_password";
	
			// create api
			BitcoindApi api = BitcoindApiFactory.createConnection(address, port, protocol, user, password);
	
			// call getinfo
			Info info = api.getinfo();
			System.out.println("Protocol version: " + info.getProtocolversion());
			System.out.println("Total balance : " + info.getBalance());
	
			// call listaccounts
			Map<String, Double> accounts = api.listaccounts();
			accounts.forEach((k, v) -> System.out.println(String.format("account %s balance : %s", k, v)));
		}
	
	}

## How to build

For compilation we need JDK 8 and Gradle 2.x.
The following commands build jar:

	$ gradle build

## Installation

Provide code examples and explanations of how to get the project.

## API Reference

Complete bitcoin API command list are available on page [link](https://en.bitcoin.it/wiki/Original_Bitcoin_client/API_calls_list)

Currently connector implemented methods:
* getaccount
* getaccountaddress
* getaddressesbyaccount
* getconnectioncount
* getnewaddress
* getbalance
* getbestblockhash
* getblock
* getdifficulty
* getgenerate
* gethashespersec
* getinfo
* gettransaction
* listaccounts
* listreceivedbyaccount
* getreceivedbyaddress
* listtransactions
* listsinceblock
* getreceivedbyaddress
* move
* sendfrom
* validateaddress

## Contributors

Sebastian Dziak (sebastian.dziak@sulacosoft.com)

## License

BitcoindConnector4J is distributed under the Apache License 2.0.
