public class Caixa {
	private int    altura;
	private int    largura;
	private int    profundidade;
	private String cor;
	private String material;

	// Construtor default
	public Caixa(){
		this("Vermelho", "Papel"); // <- Utilizando código do 2º construtor
	}

	// Construtor(tudo)
	public Caixa(int altura, int largura, int profundidade, String cor){
		this.setAltura(altura);
		this.setLargura(largura);
		this.setProfundidade(profundidade);
		this.setCor(cor);
	}

	// Construtor(menos material)
	public Caixa(String cor, String material){
		this.setCor(cor);
		this.setMaterial(material);
	}

	// Get's e Set's
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

	public String toString() {
		return "Caixa [altura=" + altura + ", largura=" + largura
				+ ", profundidade=" + profundidade + ", cor=" + cor
				+ ", material=" + material + "]";
	}

}
