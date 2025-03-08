package io.github.jangacnik.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SuperType {

  ENERGY("Energy"),
  POKEMON("Pokémon"),
  TRAINER("Trainer");

  public final String label;

  SuperType(String label) {
    this.label = label;
  }


  @JsonValue
  public String getLabel() {
    return label;
  }
}
