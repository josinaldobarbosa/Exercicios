package exercicio3;

public class BuscaValor extends Thread {
	
	private int valor;
	private int[] vetor;
	
	public BuscaValor(int valor, int[] vetor) {
		this.valor = valor;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		int resultado = -1;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valor) {
				resultado = vetor[i];
				break;
			}
		}
		System.out.println(this.getName() + ", resultado: " + resultado);
	}
	
}
