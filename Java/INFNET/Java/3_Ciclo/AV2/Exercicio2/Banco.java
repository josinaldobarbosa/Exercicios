import java.util.ArrayList;

public class Banco {
	private String nome;
	private ArrayList<Cliente> clientes;

	// Construtor
	public Banco(String nome, ArrayList<Cliente> clientes) {
		this.nome = nome;
		this.clientes = clientes;
	}

	// Exibe todos os clientes
	public void exibeClientes() {
		for (Cliente cli : clientes) {
			System.out.println(cli);
		}
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

}
