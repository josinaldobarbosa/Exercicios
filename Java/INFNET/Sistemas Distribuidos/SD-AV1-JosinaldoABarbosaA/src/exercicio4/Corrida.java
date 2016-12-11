package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Corrida {
	
	private static final int MAX_DISTANCE = 100;
	
	private List<Sapo> participantes;
	private List<Sapo> colocacao;
	
	private StatusCorrida statusCorrida;
	
	public Corrida(int totalParticipantes) {
		participantes = new ArrayList<>();
		colocacao = new ArrayList<>();
		this.adicionaParticipantes(totalParticipantes);
	}
	
	public void inicia(StatusCorrida statusCorrida) {
		this.statusCorrida = statusCorrida;
		
		List<Thread> corredores = this.preparaParticipantes();
		
		statusCorrida.onStart();
		
		// Inicia todos
		for (Thread t : corredores) {
			t.start();
		}
		
		// Espera todos acabarem
		for (Thread t : corredores) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		statusCorrida.onFinish(colocacao);
		
	}
	
	private void adicionaParticipantes(int totalParticipantes) {
		for (int i = 0; i < totalParticipantes; i++) {
			participantes.add(new Sapo());
		}
	}
	
	private List<Thread> preparaParticipantes() {
		List<Thread> runParticipantes = new ArrayList<>();
		
		for (final Sapo sapo : participantes) {
			
			Thread participante = new Thread(new Runnable() {
				@Override
				public void run() {
					int passos = 0;
					
					while (sapo.getDistanciaPercorrida() < MAX_DISTANCE) {
						// pula
						int percorrido = sapo.getDistanciaPercorrida();
						int proximoPulo = sapo.getDistanciaDePulo();
						int proximaDistancia = percorrido + proximoPulo;
						
						// Corredor não pode ultrapassar a distancia total
						if (proximaDistancia > MAX_DISTANCE) {
							proximaDistancia = MAX_DISTANCE;
						}
						
						sapo.setDistanciaPercorrida(proximaDistancia);
						
						// Verifica Resistencia
						if (passos == sapo.getResistencia()) {
							intervalo(500);
							passos = 0;
						} else {
							passos++;
						}
					}
					
					synchronized (colocacao) {
						colocacao.add(sapo);
						
						int posicao = colocacao.indexOf(sapo) + 1;
						statusCorrida.onColocado(sapo, posicao);
					}
					
				}
				
				private void intervalo(long time) {
					try {
						Thread.sleep(time);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			});
			
			runParticipantes.add(participante);
		}
		
		return runParticipantes;
	}

}
