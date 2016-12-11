public class Aluno {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return this.nome;
	}

	// Compara dois objetos do tipo Aluno, o critério de comparação é os nomes dos alunos.
	public boolean equals(Object o) {
		Aluno outro = (Aluno)o;
		return this.nome.equals(outro.nome);
	}

}
