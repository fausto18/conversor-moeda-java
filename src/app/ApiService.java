package app;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import config.Config;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiService {
    public double obterConversao(String from, String to, double amount) {
        try {
            String endpoint = Config.BASE_URL + from;
            URL url = new URL(endpoint);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");
            JsonObject json = JsonParser.parseReader(new InputStreamReader(conexao.getInputStream())).getAsJsonObject();
            JsonObject taxas = json.getAsJsonObject("conversion_rates");
            double taxa = taxas.get(to).getAsDouble();
            return taxa * amount;
        } catch (Exception e) {
            System.out.println("Erro na API: " + e.getMessage());
            return -1;
        }
    }
}
