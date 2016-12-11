
public class Conta implements Runnable {

	private int saldo = 100;

	@Override
	public void run() {
		saldo();
	}

	private synchronized void saldo(){
		// synchronized faz com que só um segmento de cada vez acesse esté método. ou seja,
		// evita que a primeira Thread não consiga retirar o saldo
		if(saldo == 100){
			saldo += - 100;
			System.out.println(Thread.currentThread().getName() + " Retirou R$:100 do saldo.");
		}else{
			System.out.println(Thread.currentThread().getName() + " Não conseguiu tirar o saldo.");
		}
	}

}
