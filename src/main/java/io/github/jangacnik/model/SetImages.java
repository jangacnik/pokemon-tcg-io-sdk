package io.github.jangacnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetImages {

  @JsonProperty("symbol")
  private String symbol;
  @JsonProperty("logo")
  private String logo;

  public SetImages() {
    // default constructor
  }

  public SetImages(String symbol, String logo) {
    this.symbol = symbol;
    this.logo = logo;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }
}
