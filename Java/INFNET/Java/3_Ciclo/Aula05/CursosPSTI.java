
public enum CursosPSTI {

	GADS("Graduação em Análise e desenvolvimento de Sistemas"),
	GES("Graduação GES"),
	GEC("Graduação GEC"),
	GRC("Graduação GRC"),
	GTI("Graduação GTI"),
	CBD("Graduação CBD");

	private final String nome;

	// Construtor
	private CursosPSTI(String nome) {
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

}
