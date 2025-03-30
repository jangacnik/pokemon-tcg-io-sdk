package io.github.jangacnik.pkmntcg.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Legality {
  LEGAL("Legal"),
  BANNED("Banned"),
  NOT_PRESENT("not present");

  public final String label;

  Legality(String label) {
    this.label = label;
  }

  @JsonValue
  public String getLabel() {
    return label;
  }
}
