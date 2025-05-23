package io.github.jangacnik.pkmntcg.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardMarket {

  @JsonProperty
  private String url;
  @JsonProperty
  private String updatedAt;
  @JsonProperty
  private CardMarketPrices prices;

  public CardMarket() {
    // default constructor
  }

  public CardMarket(String url, String updatedAt, CardMarketPrices prices) {
    this.url = url;
    this.updatedAt = updatedAt;
    this.prices = prices;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CardMarketPrices getPrices() {
    return prices;
  }

  public void setPrices(CardMarketPrices prices) {
    this.prices = prices;
  }
}
