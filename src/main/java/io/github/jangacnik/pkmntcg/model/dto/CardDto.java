package io.github.jangacnik.pkmntcg.model.dto;

import io.github.jangacnik.pkmntcg.model.PkmnCard;

public class CardDto extends GenericResponse {

  private PkmnCard data;

  public PkmnCard getData() {
    return data;
  }

  public void setData(PkmnCard data) {
    this.data = data;
  }
}
