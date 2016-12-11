public class Contato {
	private String nome;
	private int codigoArea;
	private int telefone;
	private TipoTelefone tipo;

	// Construtor
	public Contato(String nome, int codigoArea, int telefone, TipoTelefone tipo) {
		this.nome = nome;
		this.codigoArea = codigoArea;
		this.telefone = telefone;
		this.tipo = tipo;
	}

	// Get's
	public String getNome() {
		return nome;
	}

	public int getCodigoArea() {
		return codigoArea;
	}

	public int getTelefone() {
		return telefone;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	@Override
	public boolean equals(Object obj) {
		// instanceof serve para verificar se dois objetos são do mesmo tipo
		if (obj instanceof Contato) {
			Contato contato = (Contato) obj;
			return (this.nome.equals(contato.getNome()));
		}
		return false;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", codigoArea=" + codigoArea
				+ ", telefone=" + telefone + ", tipo=" + tipo + "]";
	}

}
