
public class Jogador {
	private String nome;
	private int    valor;
	
	// Cria jogador
	public static Jogador criaJogador(String nome, int valor){
		Jogador jogador = new Jogador();
		jogador.setNome(nome);
		jogador.setValor(valor);
		return jogador;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}

}
