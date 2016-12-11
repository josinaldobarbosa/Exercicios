public class Humano implements Animal {

	private String nome;

	public Humano(String nome) {
		this.nome = nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return "humano - " + this.nome;
	}

}
