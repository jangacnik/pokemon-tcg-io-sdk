package io.github.jangacnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Attack {

  @JsonProperty
  private List<String> cost;
  @JsonProperty
  private String name;
  @JsonProperty
  private String text;
  private String damage;
  private Integer convertedEnergyCost;

  public Attack(List<String> cost, String name, String text, String damage,
      Integer convertedEnergyCost) {
    this.cost = cost;
    this.name = name;
    this.text = text;
    this.damage = damage;
    this.convertedEnergyCost = convertedEnergyCost;
  }

  public Attack() {
  }

  public List<String> getCost() {
    return cost;
  }

  public void setCost(List<String> cost) {
    this.cost = cost;
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

  public String getDamage() {
    return damage;
  }

  public void setDamage(String damage) {
    this.damage = damage;
  }

  public Integer getConvertedEnergyCost() {
    return convertedEnergyCost;
  }

  public void setConvertedEnergyCost(Integer convertedEnergyCost) {
    this.convertedEnergyCost = convertedEnergyCost;
  }
}
