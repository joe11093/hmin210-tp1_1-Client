package p1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientIdentificationImpl extends UnicastRemoteObject implements ClientIdentification{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected ClientIdentificationImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getNotification(String notification) {
		// TODO Auto-generated method stub
		System.out.println(notification);
		
	}

}
