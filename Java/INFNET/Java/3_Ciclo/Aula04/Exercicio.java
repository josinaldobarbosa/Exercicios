import java.util.ArrayList;

public class Exercicio {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<String>();

		nomes.add("Guilherme Silva");
		nomes.add("Osvaldo Pereira");
		nomes.add("Vinicius Osvaldo");
		nomes.add("Aernardo Fervaldo");
		nomes.add("José-naudo Costa");
		nomes.add("Victor Couto");
		nomes.add("Gabriel Guilherme");
		nomes.add("Fernando SilveirA");
		nomes.add("Fernando Aosto");
		nomes.add("Lucife 666");

		System.out.println("----------------- Caixa alta -----------------");
		for(String n : nomes) {
			System.out.println(n.toUpperCase());
		}

		System.out.println("----------------- Caixa baixa -----------------");
		for(String n : nomes) {
			System.out.println(n.toLowerCase());
		}

		System.out.println("----------------- Tamanho -----------------");
		for(String n : nomes) {
			System.out.println(n.length());
		}

		System.out.println("----------------- Concat -----------------");
		for(String n : nomes) {
			String x[] = n.split(" ");
			System.out.println(x[0] + " - ".concat(x[1]));
		}

		System.out.println("----------------- Replace -----------------");
		for(String n : nomes) {
			System.out.println(n.replace("a", "4"));
		}

		System.out.println("----------------- Replace2 -----------------");
		for(String n : nomes) {
			System.out.println(n.replace("an", "JAVA2"));
		}

		System.out.println("----------------- Nomes iniciados em x -----------------");
		for(String n : nomes) {
			if(n.startsWith("A")){
				System.out.println(n);
			}
		}

		System.out.println("----------------- Sobrenomes terminados com x -----------------");
		for(String n : nomes) {
			if(n.split(" ")[1].endsWith("A")){
				System.out.println(n);
			}
		}

		System.out.println("----------------- Sobrenomes iniciados com x -----------------");
		for(String n : nomes) {
			if(n.split(" ")[1].startsWith("A")){
				System.out.println(n);
			}
		}

	}

}
