
public class Ordenador {
	public static int[] ordenarVetor(int vetor[]){
		
		// Variável auxiliar
		int temp = 0;
		
		// Ordena o vetor
		for(int i = 0 ; i < vetor.length; i++){
			for(int j = 0; j < vetor.length ; j++){
				if(vetor[i] < vetor[j]){
					temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
			}
		}
		return vetor;
	}

}
