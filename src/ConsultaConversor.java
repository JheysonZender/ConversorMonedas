import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversor {
    public Conversor buscarDivisa(String divisa1, String divisa2){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+System.getenv("API_KEY")+"/pair/"+divisa1+"/"+divisa2);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré la divisa.");
        }
    }
}
