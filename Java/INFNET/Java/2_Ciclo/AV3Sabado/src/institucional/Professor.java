package br.com.infnet.institucional;

public class Professor {
	private String	nome;
	private String	especialidade;
	private int		maldade;

	// Cria professor
	public static Professor criaProfessor(String nome, String especialidade, int maldade){
		// instancia
		Professor prof = new Professor();
		prof.setNome(nome);
		prof.setEspecialidade(especialidade);
		prof.setMaldade(maldade);
		return prof;
	}

	// Aumenta maldade em 50%
	public int aumentaMaldade50(int maldade){
		int mal = maldade + (maldade / 2);
		if(mal > 100){
			mal = 100;
		}
		return mal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getMaldade() {
		return maldade;
	}

	public void setMaldade(int maldade) {
		this.maldade = maldade;
	}

}
