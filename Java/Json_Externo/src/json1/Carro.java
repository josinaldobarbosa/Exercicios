package json1;

public class Carro {

	private Long id;
	private String modelo;
	private String placa;
	
	// Get's, Set's e toString
 	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo; 
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", modelo=" + modelo + ", placa=" + placa + "]";
	}

}
