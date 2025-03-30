package io.github.jangacnik.pkmntcg.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcgPlayerPrice {

  @JsonProperty
  private Double low;
  @JsonProperty
  private Double mid;
  @JsonProperty
  private Double high;
  @JsonProperty
  private Double market;
  @JsonProperty
  private Double directLow;

  public TcgPlayerPrice() {
    // default constructor
  }

  public TcgPlayerPrice(Double low, Double mid, Double high, Double market, Double directLow) {
    this.low = low;
    this.mid = mid;
    this.high = high;
    this.market = market;
    this.directLow = directLow;
  }

  public Double getLow() {
    return low;
  }

  public void setLow(Double low) {
    this.low = low;
  }

  public Double getMid() {
    return mid;
  }

  public void setMid(Double mid) {
    this.mid = mid;
  }

  public Double getHigh() {
    return high;
  }

  public void setHigh(Double high) {
    this.high = high;
  }

  public Double getMarket() {
    return market;
  }

  public void setMarket(Double market) {
    this.market = market;
  }

  public Double getDirectLow() {
    return directLow;
  }

  public void setDirectLow(Double directLow) {
    this.directLow = directLow;
  }
}
