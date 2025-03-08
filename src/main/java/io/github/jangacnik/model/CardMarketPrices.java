package io.github.jangacnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardMarketPrices {

  @JsonProperty
  private double averageSellPrice;
  @JsonProperty
  private double lowPrice;
  @JsonProperty
  private double trendPrice;
  @JsonProperty
  private double germanProLow;
  @JsonProperty
  private double suggestedPrice;
  @JsonProperty
  private double reverseHoloSell;
  @JsonProperty
  private double reverseHoloLow;
  @JsonProperty
  private double reverseHoloTrend;
  @JsonProperty
  private double lowPriceExPlus;
  @JsonProperty
  private double avg1;
  @JsonProperty
  private double avg7;
  @JsonProperty
  private double avg30;
  @JsonProperty
  private double reverseHoloAvg1;
  @JsonProperty
  private double reverseHoloAvg7;
  @JsonProperty
  private double reverseHoloAvg30;

  public CardMarketPrices() {
    // default constructor
  }

  public double getAverageSellPrice() {
    return averageSellPrice;
  }

  public void setAverageSellPrice(double averageSellPrice) {
    this.averageSellPrice = averageSellPrice;
  }

  public double getLowPrice() {
    return lowPrice;
  }

  public void setLowPrice(double lowPrice) {
    this.lowPrice = lowPrice;
  }

  public double getTrendPrice() {
    return trendPrice;
  }

  public void setTrendPrice(double trendPrice) {
    this.trendPrice = trendPrice;
  }

  public double getGermanProLow() {
    return germanProLow;
  }

  public void setGermanProLow(double germanProLow) {
    this.germanProLow = germanProLow;
  }

  public double getSuggestedPrice() {
    return suggestedPrice;
  }

  public void setSuggestedPrice(double suggestedPrice) {
    this.suggestedPrice = suggestedPrice;
  }

  public double getReverseHoloSell() {
    return reverseHoloSell;
  }

  public void setReverseHoloSell(double reverseHoloSell) {
    this.reverseHoloSell = reverseHoloSell;
  }

  public double getReverseHoloLow() {
    return reverseHoloLow;
  }

  public void setReverseHoloLow(double reverseHoloLow) {
    this.reverseHoloLow = reverseHoloLow;
  }

  public double getReverseHoloTrend() {
    return reverseHoloTrend;
  }

  public void setReverseHoloTrend(double reverseHoloTrend) {
    this.reverseHoloTrend = reverseHoloTrend;
  }

  public double getLowPriceExPlus() {
    return lowPriceExPlus;
  }

  public void setLowPriceExPlus(double lowPriceExPlus) {
    this.lowPriceExPlus = lowPriceExPlus;
  }

  public double getAvg1() {
    return avg1;
  }

  public void setAvg1(double avg1) {
    this.avg1 = avg1;
  }

  public double getAvg7() {
    return avg7;
  }

  public void setAvg7(double avg7) {
    this.avg7 = avg7;
  }

  public double getAvg30() {
    return avg30;
  }

  public void setAvg30(double avg30) {
    this.avg30 = avg30;
  }

  public double getReverseHoloAvg1() {
    return reverseHoloAvg1;
  }

  public void setReverseHoloAvg1(double reverseHoloAvg1) {
    this.reverseHoloAvg1 = reverseHoloAvg1;
  }

  public double getReverseHoloAvg7() {
    return reverseHoloAvg7;
  }

  public void setReverseHoloAvg7(double reverseHoloAvg7) {
    this.reverseHoloAvg7 = reverseHoloAvg7;
  }

  public double getReverseHoloAvg30() {
    return reverseHoloAvg30;
  }

  public void setReverseHoloAvg30(double reverseHoloAvg30) {
    this.reverseHoloAvg30 = reverseHoloAvg30;
  }
}
