package test;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import remoteInterface.IClient;
import remoteInterface.IExemplaire;
import server.Biblio;
import server.Exemplaire;

public class BiblioTest {

	@Test
	public void test() throws RemoteException {
		IClient c1 = null;
		Biblio c=new Biblio();
		c.addLivre("Harry Potter 1", "JK.ROWLING");
		int d=c.chercheLivre("Harry Potter 1", "JK.ROWLING");
		IExemplaire a = c.emprunter(c1, d);
		a.retourner();
		
	}
	
	
	@Test
	public void testCommentaire() throws RemoteException {
		IClient c1 = null;
		Biblio c=new Biblio();
		c.addLivre("Harry Potter 1", "JK.ROWLING");
		int d=c.chercheLivre("Harry Potter 1", "JK.ROWLING");
		IExemplaire a = c.emprunter(c1, d);
		a.ajoutCommentaire("COUCOU");
		Exemplaire abc=(Exemplaire) a;
		assertEquals("COUCOU",abc.getL().getCommentaires().get(0));
		
	}

}
