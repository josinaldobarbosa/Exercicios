package exercicio4;

public class Sapo {

	private static final int MAX_DISTANCIA_PULO	= 3;
	private static final int MAX_RESISTENCIA	= 5;

	private int distanciaDePulo;
	private int resistencia;
	
	// Referece a corrida
	private int distanciaPercorrida;
	private int totalPassos;

	public Sapo() {
		distanciaDePulo	= Utils.valorRandomico(MAX_DISTANCIA_PULO);
		resistencia		= Utils.valorRandomico(MAX_RESISTENCIA);
		distanciaPercorrida = 0;
		totalPassos = 0;
	}

	public int getDistanciaDePulo() {
		return distanciaDePulo;
	}

	public int getResistencia() {
		return resistencia;
	}
	
	public int getDistanciaPercorrida() {
		return distanciaPercorrida;
	}
	
	public void setDistanciaPercorrida(int distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
		totalPassos++;
	}
	
	public int getTotalPassos() {
		return totalPassos;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" Distância de pulo: " + this.getDistanciaDePulo());
		sb.append("\n");
		sb.append(" Resistência: " + this.getResistencia());
		sb.append("\n");
		sb.append(" Distância percorrida: " + this.getDistanciaPercorrida() + "%");
		sb.append("\n");
		sb.append(" Total de passos: " + this.getTotalPassos());
		return sb.toString();
	}

}
