import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class convertidorURL {

    public GetandLoud CalculaDivisa(String baseCode, String targetCode, double monto){

        String key = "6bcd288b45adcf591ed1cc33";
        String direccion = "https://v6.exchangerate-api.com/v6/"+key+"/pair/"+baseCode+"/"+targetCode+"/"+ monto;
        Gson gson = new GsonBuilder()
                 .setPrettyPrinting()
                .create();
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            Divisas Cambio = gson.fromJson(json, Divisas.class);
            GetandLoud divisaConvertida = new GetandLoud(Cambio);
            return divisaConvertida;

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
