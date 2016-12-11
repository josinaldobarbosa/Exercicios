package programa;

import java.util.ArrayList;
import java.util.Scanner;

import funcionarios.Cuidador;
import funcionarios.Funcionarios;
import funcionarios.Gerente;
import funcionarios.Zelador;

public class Inicio {

	public static void main(String[] args) {

		// ArrayList onde ira ficar guardado os funcionários
		ArrayList<Funcionarios> funcionarios = new ArrayList<Funcionarios>();

		/* Funcionários */

		// Cria e cadastra gerente
		Gerente gerente = new Gerente();
		gerente.setNome("Jorge");
		gerente.setEndereco("Rua são jose de queiroz");
		gerente.setEmail("jorge@gmail.com");;
		gerente.setSalario((float) 3001.05);
		funcionarios.add(gerente);
		
		// Cria e cadastra cuidador
		Cuidador cuidador = new Cuidador();
		cuidador.setNome("Fernando");
		cuidador.setEndereco("Rua alfredo fernandes de souza");
		cuidador.setEmail("fernando@gmail.com");;
		cuidador.setSalario((float) 1000.00);
		funcionarios.add(cuidador);

		// Cria e cadastra zelador
		Zelador zelador = new Zelador();
		zelador.setNome("José");
		zelador.setEndereco("Rua gurmão de santomé");
		zelador.setEmail("jose@gmail.com");;
		zelador.setSalario((float) 750.10);
		funcionarios.add(zelador);

		/* Exibe todas as informações */
		for(Funcionarios fu : funcionarios){
			System.out.println("Nome: " + fu.getNome());
			System.out.println("Endereço: " + fu.getEndereco());
			System.out.println("Email: " + fu.getEmail());
			System.out.println("Salário: " + fu.getSalario());
			System.out.print("\n");
		}

		/* Interações do gerente */
		String senha = "1234";
		gerente.setSenha(senha);
		@SuppressWarnings("resource") // So pra tirar o aviso
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a senha do gerente: ");
		senha = entrada.next();
		if(gerente.verificaSenha(senha) == true){
			System.out.println("Senha correta!");
		}else{
			System.out.println("Senha incorreta!");
		}
		
	}

}
