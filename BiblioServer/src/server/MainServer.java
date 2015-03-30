package server;


import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

import remoteInterface.IBiblio;

public class MainServer {

	public static void main(String[] args) {
		try {
		
			System.setProperty("java.rmi.server.ignoreStubClasses", "false");
			LocateRegistry.createRegistry(1099);
			IBiblio bib = new Biblio();
			Naming.rebind("rmi://localhost:1099/BibService", bib);
		}
		catch (Exception e) {
			System.out.println("Trouble: " + e);
		}

	}

}
