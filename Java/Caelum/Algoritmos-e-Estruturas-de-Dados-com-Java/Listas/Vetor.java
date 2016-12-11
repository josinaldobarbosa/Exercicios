public class Vetor {

	// Declarando e Inicializando um array de Aluno com capacidade 100.
	private Object[] objetos = new Object[100]; // Default inicia com 10

	// Armazena a quantidade de alunos (Consumo constante)
	private int totalDeObjetos = 0;

	// Adiciona na ultima posição do vetor(null)
	public void adiciona(Object objeto) {
		this.garantaEspaco();
		this.objetos[this.totalDeObjetos] = objeto;
		this.totalDeObjetos++;
	}

	// Adiciona aluno com posição
	public void adiciona(int posicao, Aluno aluno) {
		this.garantaEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		for (int i = this.totalDeObjetos - 1; i >= posicao; i--) {
			this.objetos[i + 1] = this.objetos[i];
		}

		this.objetos[posicao] = aluno;
		this.totalDeObjetos++;
	}

	// Verifica posição
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeObjetos; 
	}

	// Pega aluno por posição
	public Object pega(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.objetos[posicao];
	}

	// Verifica se a posição está ocupada
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeObjetos;
	}

	// Remove aluno por posição
	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.totalDeObjetos - 1; i++) {
			this.objetos[i] = this.objetos[i + 1];
		}
		this.totalDeObjetos--;
	}

	// Verifica se contem aluno
	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalDeObjetos; i++) {
			if (aluno.equals(this.objetos[i])) {
				return true;
			}
		}
		return false;
	}

	// Retorna total de alunos
	public int tamanho() {
		return this.totalDeObjetos;
	}

	// Caso o vetor esteja cheio
	private void garantaEspaco() {
		if (this.totalDeObjetos == this.objetos.length) {
			Object[] novaArray = new Object[this.objetos.length * 2];
			for (int i = 0; i < this.objetos.length; i++) {
				novaArray[i] = this.objetos[i];
			}
			this.objetos = novaArray;
		}
	}

	// Apaga todo o vetor
	public void clear() {
		for(int i = 0; i < this.objetos.length; i++){
			this.objetos[i] = null;
		}
	}

	// Sobrescreve toString
	public String toString() {
		if (this.totalDeObjetos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();
		builder.append("[");

		for (int i = 0; i < this.totalDeObjetos - 1; i++) {
			builder.append(this.objetos[i]);
			builder.append(", ");
		}

		builder.append(this.objetos[this.totalDeObjetos - 1]);
		builder.append("]");

		return builder.toString();
	}

}
