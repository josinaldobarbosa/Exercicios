import java.util.Random;


public class Gerador {

	// Instancia gerador
	private static Random gerador = new Random();
	
	// Método para gerar número aleatório
	private static int numeroAleatorio(){
		int n = gerador.nextInt();
		return n;
	}
	
	// Método para cria um vetor de inteiros aleatórios
	public static int[] gerarVetor(int tamanhoVetor){

		// Cria vetor com o tamanho digitado
		int vetor[] = new int [tamanhoVetor];
		
		// Gera números aleatórios para o vetor
		for(int i = 0; i < vetor.length; i++){
			vetor[i] = numeroAleatorio();
		}
		
		return vetor;
	}

	// Método para cria um vetor ordenado de inteiros aleatórios
	public static int[] gerarVetorOrdenado(int tamanhoVetor){

		// Cria vetor com o tamanho digitado
		int vetor[] = new int [tamanhoVetor];
		
		// Gera números aleatórios para o vetor
		for(int i = 0; i < vetor.length; i++){
			vetor[i] = numeroAleatorio();
		}
		
		// Ordena o vetor pela classe Ordenador
		Ordenador.ordenarVetor(vetor);
		
		return vetor;
	}

}
