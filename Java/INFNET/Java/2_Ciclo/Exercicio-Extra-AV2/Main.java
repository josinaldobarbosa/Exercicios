import java.util.Scanner;


public class Main {

	/**
	 * @author Josinaldo Albuquerque Barbosa
	 */
	public static void main(String[] args) {
		
		// Instancia Scanner 
		Scanner input = new Scanner(System.in);
		
		// Pede o tamanho do vetor e armazena
		System.out.print("Por favor, digite o tamanho do vetor: ");
		int tamanhoVetor = input.nextInt();
		
		/* [Opções] - Retire as barras(//) da opção que você quer testar */
		
		// --> Gera vetor com valores aleatórios da classe Gerador (NÃO ORDENADOS)
		// int[] vetor = Gerador.gerarVetor(tamanhoVetor);
		
		// --> Gera vetor com valores aleatórios da classe Gerador (ORDENADOS - ORDEM CRESCENTE)
		// int[] vetor = Gerador.gerarVetorOrdenado(tamanhoVetor);
		
		// --> Ordena o vetor(Descomentar o primeiro para ser ordenado :P)
		// vetor = Ordenador.ordenarVetor(vetor);
		
		// Exibe a opção escolhida:
		for(int i : vetor){
		System.out.println(i);
		}
		
	}

}
