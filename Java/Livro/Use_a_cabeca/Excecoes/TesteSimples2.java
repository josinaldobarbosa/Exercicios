package excecoes;

public class TesteSimples2 {

	// Método Sacar
	static void saca(double saldo, double valor) {
		if (saldo < valor) {
			throw new IllegalArgumentException("Saldo insuficiente");
		} else {
			saldo-=valor; 
		}
	}

	public static void main(String[] args) {
		double saldo = 100;
		
		// Trata a exeção do método
		try {
			saca(saldo, 101);
		} catch (IllegalArgumentException e) {
			System.out.println("Saldo Insuficiente");
		}

	}

}
