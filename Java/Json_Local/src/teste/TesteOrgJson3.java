package teste;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TesteOrgJson3 {

	public static void main(String[] args) throws JSONException {

		/* Trabalhando com um array de strings */

		// instancia um novo JSONObject
		JSONObject my_obj = new JSONObject();

		// preenche o objeto
		my_obj.put("titulo", "JSON x XML: a Batalha Final");
		my_obj.put("ano", 2012);

		// cria um JSONArray e preenche com valores string
		JSONArray meus_generos = new JSONArray();

		meus_generos.put("aventura");
		meus_generos.put("ação");
		meus_generos.put("ficção");

		// insere o array no JSONObject com o rótulo "generos"
		my_obj.put("generos", meus_generos);

		// Exibe
		System.out.println(my_obj.toString());

	}

}
