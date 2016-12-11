package exercicio4;

import java.util.List;

public interface StatusCorrida {
	void onStart();
	void onColocado(Sapo sapo, int posicao);
	void onFinish(List<Sapo> sapos);
}
