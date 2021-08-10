import java.rmi.Naming;

public class AtomicCountServer {

	public static void main(final String[] args) {
		try {
			Naming.rebind("rmi://localhost/AtomicCountServer", new AtomicCountRemoteImpl());
            displayInitialMessage();
		} catch (final Exception e) {
			System.out.println(e.getMessage());
            displayRMIRegistryMessage();
		}
	}

    public static void displayInitialMessage() {
        System.out.println("Servidor inicializado");
    }

    public static void displayRMIRegistryMessage() {
        System.out.println("Verifique se antes de voce inicializar o servidor, digitou no seu terminal \"make rmi\"");
    }

}
