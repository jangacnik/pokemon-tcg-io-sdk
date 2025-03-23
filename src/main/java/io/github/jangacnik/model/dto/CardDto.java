package io.github.jangacnik.model.dto;

import io.github.jangacnik.model.PkmnCard;

public class CardDto extends GenericResponse {

  private PkmnCard data;

  public PkmnCard getData() {
    return data;
  }

  public void setData(PkmnCard data) {
    this.data = data;
  }
}
