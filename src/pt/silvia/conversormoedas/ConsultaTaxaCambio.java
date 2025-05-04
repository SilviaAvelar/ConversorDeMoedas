package pt.silvia.conversormoedas;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTaxaCambio {
    private static final String API_KEY = "35a52c309c2c5b92d1e92b9f";
    private static final String API_BASE_URL = "https://v6.exchangerate-api.com/v6/";

    private static final HttpClient client = HttpClient.newHttpClient();  // Usando um HttpClient reutilizável

    public ApiResponse buscaTaxas(String moedaBase) {
        URI uri = URI.create(String.format("%s%s/latest/%s", API_BASE_URL, API_KEY, moedaBase));
        HttpRequest request = HttpRequest.newBuilder().uri(uri).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                String responseBody = response.body();

                if (responseBody.contains("conversion_rates")) {
                    return new Gson().fromJson(responseBody, ApiResponse.class);
                } else {
                    System.out.println("Erro: Resposta da API não contém as taxas de conversão.");
                    return null;
                }
            } else {
                System.out.println("Erro API: " + response.statusCode() + " - " + response.body());
                return null;
            }
        } catch (IOException e) {
            System.err.println("Erro de I/O ao conectar ou processar a API: " + e.getMessage());
            e.printStackTrace();
            return null;
        } catch (InterruptedException e) {
            System.err.println("A requisição foi interrompida: " + e.getMessage());
            Thread.currentThread().interrupt();  // Restaura o status de interrupção
            return null;
        } catch (Exception e) {
            System.err.println("Erro inesperado ao processar a consulta: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
