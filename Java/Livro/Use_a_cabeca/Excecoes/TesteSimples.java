package excecoes;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class TesteSimples {

	private static void conta(double tempo){
		try{
			for(int i=0;i < tempo;i++){
				System.out.println(i+1);
				Thread.sleep(1000); // 1 segundo
			}
		}catch(Exception e){
			System.out.println("Erro!");
		}
	}

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		double tempo;

		System.out.print("Insira números: ");
		try{
			// Salva no double x o que o usuário digitar
			tempo = n.nextDouble();
			System.out.println("Obrigado! :)");
			conta(tempo);
		} catch (Exception x){
			// Caso digite algo que não seja números
			//x.printStackTrace(); // Mostra o erro no console
			System.out.println("Só números seu burro! :P");
		} finally {
			// Indepedente se deu certo ou não, isso ira ser feito
			// (evita de duplicar um código que seria feito caso desse certo(try) ou não(catch))
			// Caso tenha retorno no try ou catch, primeiro executa finally pra depois voltar pra instrução de retorno
			System.out.println("Fim!");
		}

	}

}
