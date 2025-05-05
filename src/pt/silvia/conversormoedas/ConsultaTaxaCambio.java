package pt.silvia.conversormoedas;

import com.google.gson.Gson;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

public class ConsultaTaxaCambio {

    private static final String API_BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private static final HttpClient client = HttpClient.newHttpClient();
    private final String apiKey;

    public ConsultaTaxaCambio() {
        this.apiKey = carregarApiKey();
    }

    private String carregarApiKey() {
        Properties props = new Properties();
        try (InputStream input = new FileInputStream("config.properties")) {
            props.load(input);
            String key = props.getProperty("api.key");
            if (key == null || key.trim().isEmpty()) {
                throw new IllegalStateException("Chave 'api.key' não encontrada ou vazia no arquivo config.properties");
            }
            return key;
        } catch (IOException ex) {
            throw new RuntimeException("Erro ao carregar o arquivo de configuração 'config.properties'. Certifique-se de que ele existe e contém 'api.key'.", ex);
        }
    }

    public ApiResponse buscaTaxas(String moedaBase) {
        URI uri = URI.create(String.format("%s%s/latest/%s", API_BASE_URL, this.apiKey, moedaBase));
        HttpRequest request = HttpRequest.newBuilder().uri(uri).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                String responseBody = response.body();
                if (responseBody.contains("conversion_rates")) {
                    return new Gson().fromJson(responseBody, ApiResponse.class);
                } else {
                    System.out.println("Erro: Resposta da API não contém as taxas de conversão. Resposta: " + responseBody);
                    return null;
                }
            } else {
                System.out.println("Erro API: " + response.statusCode() + " - " + response.body());
                return null;
            }
        } catch (IOException | InterruptedException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            System.err.println("Erro durante a requisição à API: " + e.getMessage());
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        try {
            ConsultaTaxaCambio consulta = new ConsultaTaxaCambio();
            ApiResponse resposta = consulta.buscaTaxas("USD");
            if (resposta != null) {
                System.out.println("Taxas de conversão para USD:");
                System.out.println("Objeto de resposta completo: " + new Gson().toJson(resposta));
            }
        } catch (RuntimeException e) { // Captura a exceção lançada por carregarApiKey
            System.err.println("Erro ao inicializar: " + e.getMessage());
        }
    }
}