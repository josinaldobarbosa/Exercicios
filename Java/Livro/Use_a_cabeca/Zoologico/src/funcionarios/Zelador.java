package funcionarios;

public class Zelador extends Funcionarios {

	// Recebe salario + 25
	@Override
	public float getSalario(){
		return this.salario + 25;
	}

}
