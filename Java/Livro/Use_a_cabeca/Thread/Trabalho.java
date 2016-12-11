package thread;

public class Trabalho implements Runnable {
	// Método de Runnable(obrigatório)
	@Override
	public void run() {
		
		/* Retardo da Thread opcional, caso queria que o método main execute antes..
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		contaNegativo();
	}

	private static void contaNegativo(){
		// String nomeThread = Thread.currentThread().getName(); // Pega o nome da Thread
		for(int i=1;i<=50;i++){
			System.out.println("Contando...[-"+i+"]");
		}
	}
}
