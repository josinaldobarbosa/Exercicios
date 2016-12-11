package json3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Http {

	public String chamaUrl(String url) throws IOException {
		URL site = new URL(url);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(site.openStream()));

		String retornoJson;

		StringBuilder builder = new StringBuilder();
		while ((retornoJson = bufferedReader.readLine()) != null)
			builder.append(retornoJson);

		bufferedReader.close();

		return builder.toString();
	}
	
}
