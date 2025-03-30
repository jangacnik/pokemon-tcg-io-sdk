package io.github.jangacnik.pkmntcg.model.enums;

public enum CardQueryOptions {
  ID("id"),
  NAME("name"),
  SUPER_TYPE("superType"),
  SUB_TYPE("subType"),
  LEVEL("level"),
  HP("hp"),
  TYPES("types"),
  EVOLVES_FROM("evolvesFrom"),
  EVOLVES_TO("evolvesTo"),
  RULES("rules"),
  ANCIENT_TRAIT("ancientTrait"),
  ABILITIES_NAME("abilities.name"),
  ABILITIES_TEXT("abilities.text"),
  ABILITIES_TYPE("abilities.type"),
  ATTACKS_COST("attacks.cost"),
  ATTACKS_NAME("attacks.name"),
  ATTACKS_TEXT("attacks.text"),
  ATTACKS_DAMAGE("attacks.damage"),
  ATTACKS_CONVERTED_ENERGY_COST("attacks.convertedEnergyCost"),
  WEAKNESSES_TYPE("weaknesses.type"),
  WEAKNESSES_VALUE("weaknesses.value"),
  RESISTANCES_TYPE("resistances.type"),
  RESISTANCES_VALUE("resistances.value"),
  RETREAT_COST("retreatCost"),
  CONVERTED_RETREAT_COST("convertedRetreatCost"),
  SET("set.id"),
  SET_NAME("set.name"),
  NUMBER("number"),
  ARTIST("artist"),
  RARITY("rarity"),
  FLAVOR_TEXT("flavorText"),
  NATIONAL_POKEDEX_NUMBER("nationalPokedexNumber"),
  LEGALITIES_STANDARD("legalities.standard"),
  LEGALITIES_EXPANDED("legalities.expanded"),
  LEGALITIES_UNLIMITED("legalities.unlimited"),
  REGULATION_MARK("regulationMark");


  private final String queryOption;

  CardQueryOptions(String queryOption) {
    this.queryOption = queryOption;
  }

  @Override
  public String toString() {
    return this.queryOption;
  }
}
