package json3;

public class Site {

	private String bairro;
	private String estacao;
	private double codigo;
	private String endereco;
	private String numero;
	private String latitude;
	private String longitude;

	@Override
	public String toString() {
		return "> [Bairro: " + bairro + ", Estacao: " + estacao + ", Codigo: "
				+ codigo + ", Endereco: " + endereco + ", Numero: " + numero
				+ ", La: " + latitude + ", Lo: " + longitude + "]";
	}

	// Get's e Set's
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstacao() {
		return estacao;
	}

	public void setEstacao(String estacao) {
		this.estacao = estacao;
	}

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
