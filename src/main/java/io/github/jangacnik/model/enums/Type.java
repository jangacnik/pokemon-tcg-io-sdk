package io.github.jangacnik.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Type {
  COLORLESS("Colorless"),
  DARKNESS("Darkness"),
  DRAGON("Dragon"),
  FAIRY("Fairy"), // rip
  FIGHTING("Fighting"),
  FIRE("Fire"),
  GRASS("Grass"),
  LIGHTNING("Lightning"),
  METAL("Metal"),
  PSYCHIC("Psychic"),
  WATER("Water");
  public final String label;

  Type(String label) {
    this.label = label;
  }


  @JsonValue
  public String getLabel() {
    return label;
  }
}
