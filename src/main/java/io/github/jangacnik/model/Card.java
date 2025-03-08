package io.github.jangacnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Card {

  @JsonProperty
  private String id;
  @JsonProperty
  private String name;
  @JsonProperty
  private String level;
  @JsonProperty
  private String regulationMark;

  @JsonProperty
  private String supertype;
  @JsonProperty
  private List<String> subtypes;
  @JsonProperty
  private String hp;
  @JsonProperty
  private List<String> types;
  @JsonProperty
  private String evolvesFrom;
  @JsonProperty
  private List<String> evolvesTo;
  @JsonProperty
  private List<String> rules;
  @JsonProperty
  private AncientTrait ancientTrait;
  @JsonProperty
  private List<Ability> abilities;
  @JsonProperty
  private List<Attack> attacks;
  @JsonProperty
  private List<Reaction> weaknesses;
  @JsonProperty
  private List<Reaction> resistances;
  @JsonProperty
  private List<String> retreatCost;
  @JsonProperty
  private Integer convertedRetreatCost;
  @JsonProperty
  private Set set;
  @JsonProperty
  private String number;
  @JsonProperty
  private String artist;
  @JsonProperty
  private String rarity;
  @JsonProperty
  private String flavorText;
  @JsonProperty
  private List<Integer> nationalPokedexNumbers;
  @JsonProperty
  private Legalities legalities;
  @JsonProperty
  private CardImages images;
  @JsonProperty
  private TcgPlayer tcgplayer;
  @JsonProperty
  private CardMarket cardmarket;

  public Card() {
    // default constructor
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSupertype() {
    return supertype;
  }

  public void setSupertype(String supertype) {
    this.supertype = supertype;
  }

  public List<String> getSubtypes() {
    return subtypes;
  }

  public void setSubtypes(List<String> subtypes) {
    this.subtypes = subtypes;
  }

  public String getHp() {
    return hp;
  }

  public void setHp(String hp) {
    this.hp = hp;
  }

  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  public String getEvolvesFrom() {
    return evolvesFrom;
  }

  public void setEvolvesFrom(String evolvesFrom) {
    this.evolvesFrom = evolvesFrom;
  }

  public List<String> getEvolvesTo() {
    return evolvesTo;
  }

  public void setEvolvesTo(List<String> evolvesTo) {
    this.evolvesTo = evolvesTo;
  }

  public List<String> getRules() {
    return rules;
  }

  public void setRules(List<String> rules) {
    this.rules = rules;
  }

  public AncientTrait getAncientTrait() {
    return ancientTrait;
  }

  public void setAncientTrait(AncientTrait ancientTrait) {
    this.ancientTrait = ancientTrait;
  }

  public List<Ability> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<Ability> abilities) {
    this.abilities = abilities;
  }

  public List<Attack> getAttacks() {
    return attacks;
  }

  public void setAttacks(List<Attack> attacks) {
    this.attacks = attacks;
  }

  public List<Reaction> getWeaknesses() {
    return weaknesses;
  }

  public void setWeaknesses(List<Reaction> weaknesses) {
    this.weaknesses = weaknesses;
  }

  public List<Reaction> getResistances() {
    return resistances;
  }

  public void setResistances(List<Reaction> resistances) {
    this.resistances = resistances;
  }

  public List<String> getRetreatCost() {
    return retreatCost;
  }

  public void setRetreatCost(List<String> retreatCost) {
    this.retreatCost = retreatCost;
  }

  public Integer getConvertedRetreatCost() {
    return convertedRetreatCost;
  }

  public void setConvertedRetreatCost(Integer convertedRetreatCost) {
    this.convertedRetreatCost = convertedRetreatCost;
  }

  public Set getSet() {
    return set;
  }

  public void setSet(Set set) {
    this.set = set;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getRarity() {
    return rarity;
  }

  public void setRarity(String rarity) {
    this.rarity = rarity;
  }

  public String getFlavorText() {
    return flavorText;
  }

  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  public List<Integer> getNationalPokedexNumbers() {
    return nationalPokedexNumbers;
  }

  public void setNationalPokedexNumbers(List<Integer> nationalPokedexNumbers) {
    this.nationalPokedexNumbers = nationalPokedexNumbers;
  }

  public Legalities getLegalities() {
    return legalities;
  }

  public void setLegalities(Legalities legalities) {
    this.legalities = legalities;
  }

  public CardImages getImages() {
    return images;
  }

  public void setImages(CardImages images) {
    this.images = images;
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

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public String getRegulationMark() {
    return regulationMark;
  }

  public void setRegulationMark(String regulationMark) {
    this.regulationMark = regulationMark;
  }
}
