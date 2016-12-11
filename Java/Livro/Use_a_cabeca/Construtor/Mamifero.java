abstract public class Mamifero {
	protected String reino;
	protected int	 valor;

	// 1º Construtor
	public Mamifero(){
		this("Sem reino", 0); // Utilizando o this primeiro, reutilizando o código de outro construtor
		System.out.println("Mamifero criado...");
	}

	// 2º Construtor
	public Mamifero(String reino, int valor){
		System.out.println("Mamifero criado...");
		this.setReino(reino);
		this.setValor(valor);
	}

	// 3º Construtor
	public Mamifero(String reino, String frase){
		this.reino = reino;
		System.out.println("Frase: " + frase);
		System.out.println("Mamifero criado...");
	}

	// Get's e Set's
	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
