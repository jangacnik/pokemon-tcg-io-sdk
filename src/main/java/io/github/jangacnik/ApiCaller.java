package io.github.jangacnik;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApiCaller {
  private static final String BASE_URL = "https://api.pokemontcg.io/v2/";
  private static final Logger LOGGER = Logger.getLogger(ApiCaller.class.getName());
  protected static String apiKey;
  private ApiCaller() {}
  public static HttpResponse<String> executeRequest(String query)
      throws URISyntaxException, IOException, InterruptedException {
    LOGGER.log(Level.INFO, "Executing API request: {0}", query);
    HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI(BASE_URL + query))
        .headers("Content-Type", "application/x-www-form-urlencoded")
        .headers("X-Api-Key", apiKey)
        .GET()
        .build();
    try (HttpClient httpClient = HttpClient.newBuilder().build()) {
      HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
      if (response.statusCode() >= 400) {
        throw new IOException(String.valueOf(response.body()));
      }
      return response;
    }
  }
}
