package io.github.jangacnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcgPlayer {

  @JsonProperty
  private String url;
  @JsonProperty
  private String updatedAt;
  @JsonProperty
  private TcgPlayerPrices prices;

  public TcgPlayer() {
    // default constructor
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

  public TcgPlayerPrices getPrices() {
    return prices;
  }

  public void setPrices(TcgPlayerPrices prices) {
    this.prices = prices;
  }
}
