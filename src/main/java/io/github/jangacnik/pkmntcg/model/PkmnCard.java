package io.github.jangacnik.pkmntcg.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PkmnCard extends PkmnCardBase {

  @JsonProperty
  private Set set;
  @JsonProperty
  private TcgPlayer tcgplayer;
  @JsonProperty
  private CardMarket cardmarket;

  public PkmnCard(String id, String name, String level, String regulationMark, String supertype,
      List<String> subtypes, String hp, List<String> types, String evolvesFrom,
      List<String> evolvesTo, List<String> rules, AncientTrait ancientTrait,
      List<Ability> abilities,
      List<Attack> attacks, List<Reaction> weaknesses, List<Reaction> resistances,
      List<String> retreatCost, Integer convertedRetreatCost, String number, String artist,
      String rarity, String flavorText, List<Integer> nationalPokedexNumbers, Legalities legalities,
      CardImages images, Set set, TcgPlayer tcgplayer, CardMarket cardmarket) {
    super(id, name, level, regulationMark, supertype, subtypes, hp, types, evolvesFrom, evolvesTo,
        rules, ancientTrait, abilities, attacks, weaknesses, resistances, retreatCost,
        convertedRetreatCost, number, artist, rarity, flavorText, nationalPokedexNumbers,
        legalities,
        images);
    this.set = set;
    this.tcgplayer = tcgplayer;
    this.cardmarket = cardmarket;
  }

  public PkmnCard() {
  }

  public PkmnCard(Set set, TcgPlayer tcgplayer, CardMarket cardmarket) {
    this.set = set;
    this.tcgplayer = tcgplayer;
    this.cardmarket = cardmarket;
  }

  public Set getSet() {
    return set;
  }

  public void setSet(Set set) {
    this.set = set;
  }

  public TcgPlayer getTcgplayer() {
    return tcgplayer;
  }

  public void setTcgplayer(TcgPlayer tcgplayer) {
    this.tcgplayer = tcgplayer;
  }

  public CardMarket getCardmarket() {
    return cardmarket;
  }

  public void setCardmarket(CardMarket cardmarket) {
    this.cardmarket = cardmarket;
  }
}
