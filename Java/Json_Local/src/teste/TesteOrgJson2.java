package teste;

import org.json.JSONException;
import org.json.JSONObject;

public class TesteOrgJson2 {

	public static void main(String[] args) throws JSONException {

		/* cria um JSONObject a partir de uma string */

		// string json
		String json_str = "{\"titulo\":\"Os Arquivos JSON\",\"ano\":1998, \"genero\":\"Ficção\"}";

		// instancia um novo JSONObject passando a string como entrada
		JSONObject my_obj = new JSONObject(json_str);

		System.out.println("Titulo: " + my_obj.getString("titulo"));
		System.out.println("Ano: "    + my_obj.getInt("ano"));
		System.out.println("Gerero: " + my_obj.getString("genero"));

	}

}
