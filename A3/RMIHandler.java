import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIHandler extends Remote {
    public long getCount() throws RemoteException;
}
