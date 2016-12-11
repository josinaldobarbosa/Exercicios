package thread;

class Principal {

	public static void main(String[] args) {
		/* Como utilizar Thread */

		Runnable seuTrabalho = new Trabalho();
		Thread minhaThread = new Thread(seuTrabalho);
		minhaThread.setName("Nome da Thread"); // Opcional
		minhaThread.start();

		contaPositivo();
		// Thread principal(main) com números positivos, Thread criada(minhaThread) com números negativos
	}

	private static void contaPositivo(){
		for(int i=1;i<=50;i++){
			System.out.println("Contando...[+"+i+"]");
		}
	}

	// Exemplo de Monitor de sincronização de bloco(código a parte)
	private void testa(String conta) {
		System.out.println("blabla");
		synchronized(conta){
			if(true != false){
				// ...
			}
		}
		conta = conta + "";
	}

}
