package remoteInterface;


import java.rmi.*;

import remoteInterface.IClient;
import remoteInterface.IExemplaire;

public interface IBiblio extends Remote{
	IExemplaire emprunter(IClient ic, int idLivre) throws RemoteException;
	int chercheLivre(String titre, String auteur) throws RemoteException;
	void addLivre(String titre, String auteur) throws RemoteException;
	IExemplaire mettreEnPanier(int idLivre) throws RemoteException;

}
