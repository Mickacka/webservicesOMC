

import java.net.*;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import remoteInterface.IBiblio;
import remoteInterface.IExemplaire;

public class MainClient {

	public static void main(String[] args) {

		try
		{
			
			System.setProperty("java.rmi.server.codebase", "file:/C:/Users/Michael/Desktop/webservices/BiblioServer/bin/");
			System.setProperty( "java.security.policy", "C:\\Users\\Michael\\Desktop\\webservices\\BiblioEmpruntClient\\src\\policy.txt" );
			//Client c1=new Client();
			System.setSecurityManager(new RMISecurityManager());
			IBiblio c = (IBiblio) Naming.lookup("rmi://localhost:1099/BibService");
			c.addLivre("Harry Potter 1", "JK.ROWLING");
			IExemplaire ie=c.mettreEnPanier(1);
			//int d=c.chercheLivre("Harry Potter 1", "JK.ROWLING");
			//IExemplaire a = c.emprunter(c1, d);
			
			//Client c2=new Client();
			//c.emprunter(c1, d);
			//a.retourner();
		} catch (Exception e)
		{
			System.out.println("Trouble:" + e);
		}
	}

}
