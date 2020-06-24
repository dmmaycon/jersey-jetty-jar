package main;

import org.eclipse.jetty.server.Server;

import server.JettyServer;

public class Main {

	public static void main(String[] args) {
		
		Server server = JettyServer.createServer();
		
		try {
			server.start();
			server.join();
		} catch (Exception e) {
			server.destroy();			
		}
		
	}

}
