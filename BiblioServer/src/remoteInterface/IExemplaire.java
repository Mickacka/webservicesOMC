package remoteInterface;


import java.rmi.*;

public interface IExemplaire extends Remote {
	public void retourner() throws RemoteException;
}
