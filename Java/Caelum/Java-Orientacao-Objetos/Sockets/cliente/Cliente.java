import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	private final static String IP = "127.0.0.1"; // IP do servidor
	private final static int PORTA = 12345; // Porta do servidor

	public static void main(String[] args) throws UnknownHostException,
			IOException {
		// dispara cliente
		executa();
	}

	public static void executa() throws UnknownHostException, IOException {
		Socket cliente = new Socket(IP, PORTA);
		System.out.println("O cliente se conectou ao servidor!");

		// thread para receber mensagens do servidor
		Recebedor r = new Recebedor(cliente.getInputStream());
		new Thread(r).start();

		// lê msgs do teclado e manda pro servidor
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		while (teclado.hasNextLine()) {
			saida.println(teclado.nextLine());
		}

		saida.close();
		teclado.close();
		cliente.close();
	}
}
