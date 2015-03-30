package server;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import remoteInterface.IClient;
import remoteInterface.IExemplaire;

public class Exemplaire extends UnicastRemoteObject implements IExemplaire{


	Livre l;
	ArrayList<String> commentaires;
	IClient emprunteur;
	
	public Exemplaire() throws RemoteException{}
	
	public Exemplaire(Livre l) throws RemoteException{
		this.l=l;
		commentaires=new ArrayList<String>();
		emprunteur=null;
	}
	
	public Livre getL() {
		return l;
	}

	public void setL(Livre l) {
		this.l = l;
	}

	public ArrayList<String> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(ArrayList<String> commentaires) {
		this.commentaires = commentaires;
	}

	public IClient getEmprunteur() {
		return emprunteur;
	}

	public void setEmprunteur(IClient emprunteur) {
		this.emprunteur = emprunteur;
	}
	public void retourner() throws RemoteException{
		emprunteur=null;
		if(l.getFileAttente().size()!=0){
			IClient first=l.getFileAttente().removeFirst();
			System.out.println("Notify");
			first.notify();
			emprunteur=first;
		}
			
			
	}
}
