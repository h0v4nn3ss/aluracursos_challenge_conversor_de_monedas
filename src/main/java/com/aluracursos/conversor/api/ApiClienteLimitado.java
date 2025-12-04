package main.java.com.aluracursos.conversor.api;// main.java.com.aluracursos.conversor.api.ApiClienteLimitado.java
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import main.java.com.aluracursos.conversor.exceptions.ParNoSoportadoException;
import main.java.com.aluracursos.conversor.exceptions.TasaNoDisponibleException;
import main.java.com.aluracursos.conversor.model.Moneda;

public class ApiClienteLimitado implements ApiCliente {
    private final String apiKey;
    private final String baseUrl = "https://v6.exchangerate-api.com/v6/";

    public ApiClienteLimitado(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public double obtenerTasa(Moneda origen, Moneda destino) {
        String clave = origen.name() + "-" + destino.name();
        if (!esParPermitido(clave)) {
            throw new ParNoSoportadoException("Par no soportado: " + clave);
        }

        try {
            // Construir URL: /v6/{apiKey}/pair/{origen}/{destino}
            String urlStr = baseUrl + apiKey + "/pair/" + origen.name() + "/" + destino.name();
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if (conn.getResponseCode() != 200) {
                throw new TasaNoDisponibleException("Error HTTP: " + conn.getResponseCode());
            }

            // Leer respuesta JSON
            Scanner sc = new Scanner(conn.getInputStream());
            StringBuilder jsonStr = new StringBuilder();
            while (sc.hasNext()) {
                jsonStr.append(sc.nextLine());
            }
            sc.close();

            // Parsear con Gson
            JsonObject json = JsonParser.parseString(jsonStr.toString()).getAsJsonObject();
            double tasa = json.get("conversion_rate").getAsDouble();

            return tasa;

        } catch (IOException e) {
            throw new TasaNoDisponibleException("Error de conexión: " + e.getMessage());
        }
    }

    private boolean esParPermitido(String clave) {
        return switch (clave) {
            case "USD-ARS", "ARS-USD",
                 "USD-BRL", "BRL-USD",
                 "USD-COP", "COP-USD" -> true;
            default -> false;
        };
    }
}
