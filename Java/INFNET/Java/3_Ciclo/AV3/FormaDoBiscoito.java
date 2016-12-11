public enum FormaDoBiscoito {

	A("Redondo"), B("Retangular"), C("Oval"), D("Quadrado");

	private String formato;

	private FormaDoBiscoito(String formato) {
		this.formato = formato;
	}

	public String getFormato() {
		return this.formato;
	}

}
