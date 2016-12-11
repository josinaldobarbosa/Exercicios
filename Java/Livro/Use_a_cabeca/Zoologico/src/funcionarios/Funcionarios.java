package funcionarios;

abstract public class Funcionarios {
	// Variáveis de instância
	protected String nome;
	protected String endereco;
	protected String email;
	protected float	 salario;

	// Método abstrato(obrigatório sua sobrescrita nas subclasses)
	abstract public float getSalario();

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
