package io.github.jangacnik.model.dto;

import io.github.jangacnik.model.PkmnCard;
import java.util.List;

public class CardsDto extends GenericResponse {

  private List<PkmnCard> data;

  public List<PkmnCard> getData() {
    return data;
  }

  public void setData(List<PkmnCard> data) {
    this.data = data;
  }
}
