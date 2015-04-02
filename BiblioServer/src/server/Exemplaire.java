package server;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import remoteInterface.IClient;
import remoteInterface.IExemplaire;

public class Exemplaire extends UnicastRemoteObject implements IExemplaire{

	static int idExemplaire=1;
	int id;
	Livre l;
	IClient emprunteur;
	boolean enPanier;
	
	public Exemplaire() throws RemoteException{}
	
	public Exemplaire(Livre l) throws RemoteException{
		id=idExemplaire++;
		this.l=l;
		emprunteur=null;
	}
	
	public Livre getL() {
		return l;
	}

	public void setL(Livre l) {
		this.l = l;
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

	@Override
	public void ajoutCommentaire(String commentaire) throws RemoteException {
		l.getCommentaires().add(commentaire);
		
	}

	@Override
	public double getPrix() throws RemoteException {
		return l.getPrix();
	}

	public boolean isEnPanier() {
		return enPanier;
	}

	public void setEnPanier(boolean enPanier) {
		this.enPanier = enPanier;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
