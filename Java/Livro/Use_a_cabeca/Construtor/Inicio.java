public class Inicio {

	public static void main(String[] args) {
		
		// Cria o objeto Pessoa já preenchido com o construtor
		Pessoa voce = new Pessoa("Selvagem", 01, "Seu nome", 20, "Seu endereço");
		
		// Exibe
		System.out.println("Reino: "    + voce.getReino());
		System.out.println("Valor: "    + voce.getValor());
		System.out.println("Nome: " 	+ voce.getNome());
		System.out.println("Idade: "  	+ voce.getIdade());
		System.out.println("Endereço: " + voce.getEndereco());
		
	}

}
