package remoteInterface;


import java.rmi.*;

public interface IExemplaire extends Remote {
	public void retourner() throws RemoteException;
	public void ajoutCommentaire(String commentaire) throws RemoteException;
	public double getPrix() throws RemoteException;
}
