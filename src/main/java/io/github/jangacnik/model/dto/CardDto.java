package io.github.jangacnik.model.dto;

import io.github.jangacnik.model.Card;

public class CardDto extends GenericResponse{

  public Card getData() {
    return data;
  }

  public void setData(Card data) {
    this.data = data;
  }

  private Card data;
}
