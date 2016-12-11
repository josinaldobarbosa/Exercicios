import java.util.ArrayList;

public class Cliente {
	private String nome;
	private int telefone;
	private int idade;
	private Conta conta;

	// 1º Construtor
	public Cliente(String nome, int telefone, int idade, Conta conta) {
		this(nome, conta); // Chama segundo construtor
		this.telefone = telefone;
		this.idade = idade;
	}

	// 2º Construtor
	public Cliente(String nome, Conta conta) {
		this.nome = nome;
		this.conta = conta;
	}

	// Compara
	public boolean equals(Object obj) {
		if (obj instanceof Cliente) {
			Cliente cli = (Cliente) obj;
			return ((cli.nome.equals(this.nome)) && (cli.telefone == this.telefone));
		}
		return false;
	}

	// Exibe nome do cliente mais rico
	public static void exibeNomeMaisRico(ArrayList<Cliente> clientes) {
		Cliente atual = clientes.get(0);
		for (Cliente cli : clientes) {
			if (cli.conta.getSaldo() > atual.conta.getSaldo()) {
				atual = cli;
			}
		}
		
		// Exibe Nome em caixa alta
		String nome = atual.getNome.split(" "); // Separa por espaço
		if (nome.length > 2) {
			System.out.println("Cliente mais rico é " + nome[2].toUpperCase());
		} else if (atual.getNome().split(" ").length > 1) {
			System.out.println("Cliente mais rico é " + nome[1].toUpperCase());
		}
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", idade="
				+ idade + ", conta=" + conta + "]";
	}

}
