package funcionarios;

public class Gerente extends Funcionarios {
	private String senha;

	// Pega senha
	private String getSenha() {
		return senha;
	}

	// Grava senha
	public void setSenha(String senha) {
		this.senha = senha;
	}

	// Verifica senha
	public boolean verificaSenha(String senha){
		if(senha.equals(getSenha()) == true){
			return true;
		}else{
			return false;
		}
	}

	// Recebe salario + 100
	@Override
	public float getSalario(){
		return this.salario + 100;
	}

}
