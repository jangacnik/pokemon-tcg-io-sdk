package io.github.jangacnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardImages {

  @JsonProperty
  private String small;
  @JsonProperty
  private String large;

  public CardImages() {
    // default constructor
  }

  public String getSmall() {
    return small;
  }

  public void setSmall(String small) {
    this.small = small;
  }

  public String getLarge() {
    return large;
  }

  public void setLarge(String large) {
    this.large = large;
  }
}
