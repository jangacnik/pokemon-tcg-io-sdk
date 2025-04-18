package io.github.jangacnik.pkmntcg.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ability {

  @JsonProperty("name")
  private String name;
  @JsonProperty("text")
  private String text;
  @JsonProperty("type")
  private String type;

  public Ability() {
    // default constructor
  }

  public Ability(String name, String text, String type) {
    this.name = name;
    this.text = text;
    this.type = type;
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

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
