import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AtomicCountRemoteImpl extends UnicastRemoteObject implements AtomicCountRemote {

	private int count;

	public AtomicCountRemoteImpl() throws RemoteException {
		count = 1;
	}


	@Override
	public synchronized int getCount() throws RemoteException {
		return count++;
	}

}
