package p1;

import java.rmi.Remote;

public interface ClientIdentification extends Remote {
	void getNotification(String notification);
}
