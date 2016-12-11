import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {

		// Cria ArrayList de string
		ArrayList<String> nome = new ArrayList<String>();

		/* OPÇÕES */

		// Adicionando
		nome.add("First");
		nome.add("Segundo");
		System.out.println("1: " + nome);

		// Adicionando com indice(não apaga o valor, 'desce' para o proximo indice)
		nome.add(1, "Meio");
		System.out.println("2: " + nome);

		// Adicionando com indice e apagando quem estiver lá
		nome.set(0, "Morreu");
		System.out.println("3: " + nome);

		// Tamanho do Array
		System.out.println("4: " + nome.size() + " elementos");

		// Pega elemento por indice
		System.out.println("5: " + nome.get(1));

		// Verifica se contem um elemento
		System.out.println("6: " + nome.contains("Meio"));

		// Retorna a posição da primeira ocorrência do elemento especificado na lista(-1 não encontrado)
		System.out.println("7: " + nome.indexOf("Morreu"));

		// Retorna a posição da última ocorrência do elemento especificado na lista(-1 não encontrado)
		System.out.println("8: " + nome.lastIndexOf("Meio"));

		// Retorna verdadeiro se a lista estiver vazia e falso caso contrário
		System.out.println("9: " + nome.isEmpty());

		// Remove elemento por indice
		nome.remove(2);
		System.out.println("10: " + nome);
		
		// Remove primeiro elemento comparado
		nome.remove("Morreu");
		System.out.println("11: " + nome);
		
		// Remove caso fose do tipo Integer(int primitivo 10 seria passado como índice e não uma comparação da lista)
		// Integer valor = 10;
		// idade.remove(valor);

		// Apaga tudo
		nome.clear();
		System.out.println("Apaga tudo: " + nome);

	}

}
