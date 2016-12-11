package exercicio3;

import java.util.Arrays;
import java.util.Random;

/*
 3. Faça um programa em Java que utilize Threads para fazer uma busca em um vetor.
 Inicie o vetor com valores aleatórios e utilize 4 Threads para fazer a busca (a Thread 1
 busca no primeiro quarto do vetor, a Thread 2 no segundo quarto e assim em diante).
 Cada Thread deve retornar -1 se não encontrar o valor ou sua posição no vetor, caso seja
 encontrado. O vetor pode conter valores repetidos e o resultado pode ser a posição do
 primeiro valor encontrado em cada Thread.
*/
public class Principal {
	
	private static int[] VETOR;
	private static final int TAMANHO_VETOR = 500;
	private static final int VALOR_MAXIMO = 100;
	private static final int TOTAL_THREADS = 4;
	private static final int VALOR_BUSCADO = 25;

	public static void main(String[] args) {
		preencheVetor();
		
		int lotesVetor = VETOR.length / TOTAL_THREADS;
		int primeiraPosicao = 0;
		
		for (int i = 0; i < TOTAL_THREADS; i++) {
			int ultimaPosicao = lotesVetor * (i + 1);
			int[] rageVetor = Arrays.copyOfRange(VETOR, primeiraPosicao, ultimaPosicao);
			
			BuscaValor threadBV = new BuscaValor(VALOR_BUSCADO, rageVetor);
			threadBV.setName("Thread " + (i + 1));
			threadBV.start();
			
			primeiraPosicao = ultimaPosicao;
		}
		
	}
	
	private static void preencheVetor() {
		Random r = new Random();
		
		VETOR = new int [TAMANHO_VETOR];
		for (int i = 0; i < TAMANHO_VETOR; i++) {
			VETOR[i] = (r.nextInt(VALOR_MAXIMO) + 1);
		}
	}
	
}
