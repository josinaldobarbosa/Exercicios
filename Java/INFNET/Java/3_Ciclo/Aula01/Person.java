
public class Person {
	
	// Construtor default
	public Person(){}

	// Construtor
	public Person(int idade, String nome, int peso, float altura, boolean sexo){
		this.setIdade(idade);
		this.setNome(nome);
		this.setPeso(peso);
		this.setAltura(altura);
		this.setSexo(sexo);
	}

	private int     idade;
	private String  nome;
	private int     peso;
	private float   altura;
	private boolean sexo;

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public boolean getSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		return "Person [idade=" + idade + ", nome=" + nome + ", peso=" + peso
				+ ", altura=" + altura + ", sexo=" + sexo + "]";
	}

}
