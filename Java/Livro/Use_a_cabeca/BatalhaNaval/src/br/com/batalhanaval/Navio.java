package br.com.batalhanaval;

public class Navio {
	private String desenho;
	private int tamanho = 10;
	
	public static Navio criaNavio(String desenho, int tamanho){
		Navio navio = new Navio();
		navio.setDesenho(desenho);
		navio.setTamanho(tamanho);
		return navio;
	}

	public String getDesenho() {
		return desenho;
	}

	public void setDesenho(String desenho) {
		this.desenho = desenho;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
