
public class BancoPrincipal {

	public static void main(String[] args) {
		
		/* Como Limitar para que um método seja acessivel apenas por um segmento de cada vez(synchronized) */
		
		// Cria Objeto Runnable
		Runnable conta = new Conta();
		
		// Cria Thread
		Thread cliente1 = new Thread(conta);
		Thread cliente2 = new Thread(conta);
		
		// Dar nome as Thread's
		cliente1.setName("João");
		cliente2.setName("Fernando");
		
		// Inicia Thread's
		cliente1.start();
		cliente2.start();

	}

}
