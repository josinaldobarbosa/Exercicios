public class Person {

	private String nome;
	private int cpf;

	public Person(String nome, int cpf) {
		setNome(nome);
		setCpf(cpf);
	}

	// gets / sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	// 1º equals
	/*
	@Override
	public boolean equals(Object a) {
		return (this == a);
	 // 1. Compara as referências dos objetos
	 // 2. Compara o tipo do parâmetro passado para o método
	 // 3. Compara o tamanho das Strings
	 // 4. Compara individualmente os caracteres
	}
	 */

	// 2º equals
	@Override
	public boolean equals(Object obj) {
		// instanceof serve para verificar se dois objetos são do mesmo tipo
		if(obj instanceof Person) {
			Person pessoa = (Person) obj;
			return (this.nome.equals(pessoa.getNome()) && this.cpf == pessoa.getCpf());
		}
		return false;
	}

	// 3º Equals gerado pelo Eclipse
	/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // verifica se aponta pro mesmo objeto
			return true;
		if (obj == null) // verifica se aponta pra lugar nenhum
			return false;
		if (getClass() != obj.getClass()) // Verifica se é do mesmo tipo(classe)
			return false;
		Person other = (Person) obj; // Como é do mesmo tipo, converte o objeto passado no parametro(cast)
		if (cpf != other.cpf) // Verifica se é o mesmo cpf
			return false;
		if (nome == null) { // Verifica se nome da classe "local" é null
			if (other.nome != null) // Verifica se o nome da classe comparada é diferente de null
				return false;
		} else if (!nome.equals(other.nome)) // Usa o equals comparando a String da classe "local" com a classe comparada
			return false;
		return true;
	}
	 */

	// toString
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
	}

}
