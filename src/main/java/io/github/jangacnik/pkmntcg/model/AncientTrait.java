package io.github.jangacnik.pkmntcg.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AncientTrait {

  @JsonProperty
  private String name;
  @JsonProperty
  private String text;

  public AncientTrait() {
    // default constructor
  }

  public AncientTrait(String name, String text) {
    this.name = name;
    this.text = text;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
