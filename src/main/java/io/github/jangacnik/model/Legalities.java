package io.github.jangacnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.jangacnik.model.enums.Legality;

public class Legalities {

  @JsonProperty("standard")
  private Legality standard;

  @JsonProperty("expanded")
  private Legality expanded;

  @JsonProperty("unlimited")
  private Legality unlimited;

  public Legalities() {
    // default constructor
  }

  public Legalities(Legality standard, Legality expanded, Legality unlimited) {
    this.standard = standard;
    this.expanded = expanded;
    this.unlimited = unlimited;
  }

  public Legality getStandard() {
    return standard;
  }

  public void setStandard(Legality standard) {
    this.standard = standard;
  }

  public Legality getExpanded() {
    return expanded;
  }

  public void setExpanded(Legality expanded) {
    this.expanded = expanded;
  }

  public Legality getUnlimited() {
    return unlimited;
  }

  public void setUnlimited(Legality unlimited) {
    this.unlimited = unlimited;
  }
}
