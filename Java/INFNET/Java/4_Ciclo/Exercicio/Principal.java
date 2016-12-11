import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("[ -- Sistema de acompanhamento físico -- ]\n");

		// 1º
		// Pede nome completo
		String nomeCompleto = pedeString("Digite seu nome completo: ", "ERRO: nome inválido.");

		// Pede idade
		limpaBuffer();
		int idade = pedeInt("Digite sua idade: ", "ERRO: idade inválida.");

		// Pede altura
		limpaBuffer();
		float altura = pedeFloat("Digite sua altura(metros): ", "ERRO: altura inválida.");

		// Pede peso
		limpaBuffer();
		float peso = pedeFloat("Digite seu peso(Kg): ", "ERRO: peso inválido.");

		// Exibe
		System.out.println("\n[------------------------------]");
		System.out.println(" Nome: "   + nomeCompleto);
		System.out.println(" Idade: "  + idade);
		System.out.println(" Altura: " + altura + " metros");
		System.out.println(" Peso: "   + peso + " kg");
		System.out.printf(" IMC: %.2f", calculaIMC(peso, altura));
		System.out.println("\n[------------------------------]\n");

		// 2º
		int[] caloriasPorSemana = pedeCalorias();

		// 3º
		for (int caloria : caloriasPorSemana) {
			if(caloria > 0) {
				peso += caloria / 1000; // 1000 cal para cada kg
			} else if(caloria < 0) {
				peso -= caloria / 1000; // TODO wtf pq +1??
			}
		}

		System.out.printf("\nIMC após uma semana: %.2f", calculaIMC(peso, altura));

	}

	// Pede ao usuário uma string
	private static String pedeString(String pedido, String erro) {
		String retorno = null;

		while (retorno == null) {
			try {

				System.out.print(pedido);
				retorno = entrada.next();

			} catch (InputMismatchException ie) {
				System.err.println("\n" + erro + "\n");
				entrada.next();

			} catch (IllegalStateException ise) {
				System.err.println("\nERRO: Scanner fechado.\n");
			}
		}
		
		return retorno;
	}

	// Pede ao usuário um inteiro positivo
	private static int pedeInt(String pedido, String erro) {
		int retorno = -1;

		while (retorno <= -1) {
			try {
				
				System.out.print(pedido);
				retorno = entrada.nextInt();

			} catch (InputMismatchException ie) {
				System.err.println("\n" + erro + "\n");
				entrada.next();

			} catch (IllegalStateException ise) {
				System.err.println("\nERRO: Scanner fechado.\n");
			}
		}

		return retorno;
	}

	// Pede ao usuário um float
	private static float pedeFloat(String pedido, String erro) {
		float retorno = -1;

		while (retorno <= -1) {
			try {

				System.out.print(pedido);
				retorno = entrada.nextFloat();

			} catch (InputMismatchException ie) {
				System.err.println("\n" + erro + "\n");
				entrada.next();

			} catch (IllegalStateException ise) {
				System.err.println("\nERRO: Scanner fechado.\n");
			}
		}

		return retorno;
	}
	
	// Vetor com as calorias da semana
	private static int[] pedeCalorias() {
		int[] retorno = { 0, 0, 0, 0, 0, 0, 0 };
		
		boolean fim = false;
		while(fim == false) {
			try {
				
				for (int i = 0; i < retorno.length; i++) {
					System.out.print("Insira a caloria do " + (i+1) + "º dia: ");
					retorno[i] = entrada.nextInt();
					
					if(retorno[i] == 0) {
						break;
					}
				}
				
				fim = true;
				
			} catch (InputMismatchException ie) {
				System.err.println("\nERRO: Só pode ser número inteiro positivo.\n");
				entrada.next();

			} catch (IllegalStateException ise) {
				System.err.println("\nERRO: Scanner fechado.\n");
			}
		}
		
		return retorno;
	}

	// Calculo de IMC simples
	private static float calculaIMC(float peso, float altura) {
		float retorno = 0;
		try {
			
			// < INFNIT caso dividido por zero(acima de 40), somente inteiro lança exceção
			retorno = peso / (altura * altura);
			
		} catch (ArithmeticException ae) {
			System.err.println("\nIMC inválido.\n");
		}
		return retorno;
	}
	
	private static void limpaBuffer() {
		entrada.nextLine();
	}

}
