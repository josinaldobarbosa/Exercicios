public class Conta {
	private double saldo;
	private TipoDeConta tipo;

	// Construtor
	public Conta(double saldo, TipoDeConta tipo) {
		this.saldo = saldo;
		this.tipo = tipo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", tipo=" + tipo.getTexto() + "]";
	}

}
