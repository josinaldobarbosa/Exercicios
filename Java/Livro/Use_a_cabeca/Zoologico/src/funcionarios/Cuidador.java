package funcionarios;

public class Cuidador extends Funcionarios {

	// Recebe salario + 50
	@Override
	public float getSalario(){
		return this.salario + 50;
	}

}
