package io.github.jangacnik.pkmntcg.model.enums;

public enum SetQueryOptions {
  ID("id"),
  NAME("name"),
  SERIES("series"),
  PRINTED_TOTAL("printedTotal"),
  TOTAL("total"),
  LEGALITIES_STANDARD("legalities.standard"),
  LEGALITIES_EXPANDED("legalities.expanded"),
  LEGALITIES_UNLIMITED("legalities.unlimited");


  private final String queryOption;

  SetQueryOptions(String queryOption) {
    this.queryOption = queryOption;
  }

  @Override
  public String toString() {
    return this.queryOption;
  }
}
