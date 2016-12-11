package json2;

public class Site {

	private String id;
	private String capa;
	private String link;
	private String nome;

	// Get's, Set's e toString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "\nResultado: \n" + "id = " + id + "\nnome = " + nome + "\nlink = " + link + "\ncapa = " + capa;
	}

}
