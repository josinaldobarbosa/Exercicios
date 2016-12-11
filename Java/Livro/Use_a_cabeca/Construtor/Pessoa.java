public class Pessoa extends Mamifero {
	private String nome;
	private int    idade;
	private String endereco;
	
	// Preenche diretamente pelo construtor
	public Pessoa(String reino, int valor, String nome, int idade, String endereco){
		// super(); // Ou super é primeiro ou será criado automaticamente(não pode ser chamado depois de algum comando)
		super(reino, valor); // Enviando valores por argumento pro construtor da superclasse
		this.setNome(nome);
		this.setIdade(idade);
		this.setEndereco(endereco);
		System.out.println("Pessoa criada...");
	}
	
	// Construtor "original" caso não queria preencher diretamente
	public Pessoa(){}

	// Get's e Set's
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
