package io.github.jangacnik.model.dto;

import io.github.jangacnik.model.Card;
import java.util.List;

public class CardsDto extends GenericResponse{

  public List<Card> getData() {
    return data;
  }

  public void setData(List<Card> data) {
    this.data = data;
  }

  private List<Card> data;
}
