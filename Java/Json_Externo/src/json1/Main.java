package json1;

import org.json.JSONException;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) throws JSONException {
		
		// Criação do objeto carro e atribuição dos valores
		Carro carro = new Carro();
		carro.setId(1l);
		carro.setModelo("Celta");
		carro.setPlaca("AAA1234");
		
		adicaoSimplesDeDados(carro);
		
		adicaoDeUmObjeto(carro);

	}

	private static void adicaoSimplesDeDados(Carro carro) throws JSONException {
		//Criação do objeto carroJson
		JSONObject carroJson = new JSONObject();
		
		//Inserção dos valores do carro no objeto JSON
		carroJson.put("id", carro.getId());
		carroJson.put("Modelo", carro.getModelo());
		carroJson.put("Placa", carro.getPlaca());

		//Impressão do objeto JSON
		System.out.println(carroJson);

		// Exibindo valor especifico
		System.out.println("Modelo: " + carroJson.get("Modelo"));

		// Exibindo tamanho
		System.out.println("Tamanho: " + carroJson.length());
	}

	private static void adicaoDeUmObjeto(Carro carro) throws JSONException {
		JSONObject carroJson = new JSONObject();
		//Adição do objeto carro
		carroJson.put("Carro", carro);
		System.out.println(carroJson);
	}

}
