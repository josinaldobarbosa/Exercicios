public enum TipoTelefone {

	RESIDENCIAL("Telefone Residencial"), COMERCIAL("Telefone Comercial"), CELULAR("Telefone Celular"), FAX("Fax");

	private String nome;

	// Construtor
	private TipoTelefone(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

}
