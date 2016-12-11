package superclasse;

public class Fusca extends Carro {
	String ano;
	
	@Override
	// Sobrescrevendo o método da classe mãe ou superclasse(Carro)
	public void teste1(){
		super.teste1();
		System.out.println("Original + sobrescrito!");
	}
}
