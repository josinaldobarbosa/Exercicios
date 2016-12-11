import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {

		// Cria contas
		Conta conta1 = new Conta(500, TipoDeConta.CP);
		Conta conta2 = new Conta(200, TipoDeConta.CC);

		// Cria clientes
		Cliente cliente1 = new Cliente("Fulano Roma Sentavos", 123, 15, conta1);
		Cliente cliente2 = new Cliente("Zé Gotinha Silva", 321, 20, conta2);

		// Lista de clientes
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(cliente1);
		clientes.add(cliente2);

		// Cria banco
		Banco banco = new Banco("Banco HueBR", clientes);

		// Exibe clientes
		banco.exibeClientes();

		// Verifica se os clientes são iguais
		ArrayList<Cliente> cli = banco.getClientes();
		if (cli.get(0).equals(cli.get(1))) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}

		// Cliente mais rico
		Cliente.exibeNomeMaisRico(banco.getClientes());

	}

}
