public enum TipoBiscoito {

	DOCE("Biscoito doce"), SALGADO("Biscoito salgado");

	private String sabor;

	private TipoBiscoito(String sabor) {
		this.sabor = sabor;
	}

	public String getSabor() {
		return this.sabor;
	}

}

