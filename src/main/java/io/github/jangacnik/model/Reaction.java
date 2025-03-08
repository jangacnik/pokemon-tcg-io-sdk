package io.github.jangacnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.jangacnik.model.enums.Type;

public class Reaction {

  @JsonProperty
  private Type type;
  @JsonProperty
  private String value;

  public Reaction() {
    // default constructor
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
