package edu.kh.network.server.run;

import edu.kh.network.server.model.service.ServerService;

public class ServerRun {

	public static void main(String[] args) {

		ServerService service = new ServerService();
		// service.serverStart();
		
		String str = "hello";
		System.out.println(Integer.toHexString(System.identityHashCode(str)));

		str = "world";
		System.out.println(Integer.toHexString(System.identityHashCode(str)));

		
		
	}

}

