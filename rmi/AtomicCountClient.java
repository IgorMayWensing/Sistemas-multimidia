import java.rmi.Naming;
import java.util.Scanner;

public class AtomicCountClient {

	static final String NAME = "rmi://localhost/AtomicCountServer";

	static AtomicCountRemote atomicCount;

	static Scanner scanner = new Scanner(System.in);

	static String input;

	public static void main(final String[] args) {
		try {
			atomicCount = (AtomicCountRemote) Naming.lookup(NAME);
			displayInitialMessage();
			while (true) {
				input = scanner.next();
				if (input.contentEquals("get")) {
					final int count = atomicCount.getCount();
					displayCountValue(count);
				} else if (input.contentEquals("exit")) {
                    displayClientDisconnected();
					System.exit(0);
				} else {
					displayUsageCommands();
				}
			}
		} catch (final Exception e) {
			System.out.println(e.getMessage());
		}
	}


	private static void displayInitialMessage() {
		System.out.println("Digite \"get\" para ler o contador quantas vezes quiser, ou, \"exit\" para sair");
	}


	private static void displayCountValue(final int count) {
		System.out.println("O valor do contador eh: " + count);
	}

    private static void displayUsageCommands() {
		System.out.println("Voce deve digitar apenas \"get\" ou \"exit\"");
	}

    private static void displayClientDisconnected() {
		System.out.println("Cliente desconectado");
	}
}

