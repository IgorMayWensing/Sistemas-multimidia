import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;

public class Client {

    RMIHandler counter;

    public Client() {
        if(System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }

        try {
            counter =(RMIHandler) Naming.lookup("rmi://127.0.0.1/Counter");
        } catch(RemoteException | NotBoundException | MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void execute() {
        try {
            System.out.println(counter.getCount());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.execute();
    }

}
