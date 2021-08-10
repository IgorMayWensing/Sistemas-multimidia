import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Counter extends UnicastRemoteObject implements RMIHandler {

    private long counter;

    public Counter() throws RemoteException {
        counter = 0L;
    }

    @Override
    public synchronized long getCount() throws RemoteException {
        if (counter == 9223372036854775807L) {
            System.out.println("Overflow! Resetando contador.");
            counter = 0L;
        }
        return ++counter;
    }

}
