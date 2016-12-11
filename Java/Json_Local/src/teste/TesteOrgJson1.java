package teste;

import org.json.JSONException;
import org.json.JSONObject;

public class TesteOrgJson1 {

	public static void main(String[] args) throws JSONException {
		
		/* cria um JSONObject para armazenar dados de um filme */
		
		// Instancia um novo JSONObject
		JSONObject my_obj = new JSONObject();
		
		// Preenche o objeto
		my_obj.put("titulo", "Matrix");
		my_obj.put("ano", 1999);
		my_obj.put("genero", "ação");
		
		// Exibe
		my_obj.put("titulo", "Matrix II"); // altera o titulo
		System.out.println(my_obj.toString());
		
		// Exibe separado
		System.out.println("Titulo: " + my_obj.getString("titulo"));
		System.out.println("Ano: " + my_obj.getInt("ano"));
		System.out.println("Genero: " + my_obj.getString("genero"));
		

	}

}
