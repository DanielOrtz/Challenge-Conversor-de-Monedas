import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarDivisa {
    public Monedas buscaMoneda (String monedaPrincipal, String monedaConvertir) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/48a1ae0b59e1c11f56a6981e/pair/"+monedaPrincipal+"/"+monedaConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        }catch (Exception e){
            throw new RuntimeException("No encontre la divisa que seleccionaste");
        }
    }
}
