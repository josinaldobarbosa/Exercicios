public class Cachorro implements Animal {

	private String nome;

	public Cachorro(String nome) {
		this.nome = nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return "cachorro - " + this.nome;
	}

}
