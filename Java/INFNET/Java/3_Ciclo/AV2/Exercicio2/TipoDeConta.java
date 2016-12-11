public enum TipoDeConta {

	CC("Conta corrente"), CP("Conta poupança"), CS("Conta salário");

	private String texto;

	// Construtor
	private TipoDeConta(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

}
