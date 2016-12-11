package ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		/* ArrayList Adiciona a ultima posição */
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("David");
		nomes.add("Carla");
		nomes.add("Yasmim");
		nomes.add("Borges");
		nomes.add("Amanda");
		System.out.print(nomes);
		
		System.out.println(); // Quebra linha
		
		/* Adiciona em ordem alfabética e ignora duplicados */
		TreeSet<String> nomesOrdenado = new TreeSet<String>();
		nomesOrdenado.add("David");
		nomesOrdenado.add("David");
		nomesOrdenado.add("Carla");
		nomesOrdenado.add("Yasmim");
		nomesOrdenado.add("Borges");
		nomesOrdenado.add("Amanda");
		System.out.print(nomesOrdenado);
		
		System.out.println(); // Quebra linha
		
		/* Ordena Lista de Strings */
		Collections.sort(nomes);
		System.out.println(nomes);
		
	}

}
