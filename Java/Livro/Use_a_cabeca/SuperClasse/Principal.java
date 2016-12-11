package superclasse;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();

		nomes.add("João");
		nomes.add("Fernando");

		// Exibe tudo do ArrayList
		for(int i=0;i < nomes.size();i++){
			System.out.println(nomes.get(i));
		}
		
		// Carro c = new Carro(); // Errado!, Carro é abstract
		
		Carro f = new Fusca(); // Correto!
		f.nome = "Outro carro";
		f.teste1();
		
		Fusca a = new Fusca(); // Correto!
		a.nome = "Fuscão preto";
		a.teste1();
		a.ano = "1993";
	}

}
