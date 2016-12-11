package exercicio2;

public class SomaMatriz extends Thread {
	
	private SomaListener somaListener;
	private int linha;
	private long[][] matriz1;
	private long[][] matriz2;
	
	public SomaMatriz(int linha, long matriz1[][], long[][] matriz2, SomaListener somaListener) {
		this.somaListener = somaListener;
		this.linha = linha;
		this.matriz1 = matriz1;
		this.matriz2 = matriz2;
	}
	
	@Override
	public void run() {
		for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
			long n1 = matriz1[linha][coluna];
			long n2 = matriz2[linha][coluna];
			
			somaListener.soma(n1 + n2);
		}
	}

}
