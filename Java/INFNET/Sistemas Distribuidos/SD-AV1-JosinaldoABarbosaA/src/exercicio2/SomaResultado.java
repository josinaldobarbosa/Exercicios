package exercicio2;

import java.util.List;

public class SomaResultado extends Thread {

	private List<Long> valores;
	private SomaListener somaListener;
	
	public SomaResultado(List<Long> valores, SomaListener somaListener) {
		this.somaListener = somaListener;
		this.valores = valores;
	}
	
	@Override
	public void run() {
		long total = 0;
		for (Long s : valores) {
			total += s;
		}
		somaListener.resultado(total);
	}
	
}
