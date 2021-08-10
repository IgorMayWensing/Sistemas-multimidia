import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AtomicCountRemote extends Remote {

	public int getCount() throws RemoteException;

}
