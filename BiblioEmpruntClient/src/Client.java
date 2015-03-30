

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import remoteInterface.IClient;
import remoteInterface.IExemplaire;

public class Client extends UnicastRemoteObject implements IClient {
	protected Client() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	ArrayList<IExemplaire> exemplaire;

	@Override
	public void notif() throws RemoteException {
		System.out.println("TOUDOUDOUDO");
		// TODO Auto-generated method stub
		
	}
}
