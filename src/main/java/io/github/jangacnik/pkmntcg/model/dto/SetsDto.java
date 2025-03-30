package io.github.jangacnik.pkmntcg.model.dto;

import io.github.jangacnik.pkmntcg.model.Set;
import java.util.List;

public class SetsDto extends GenericResponse {

  private List<Set> data;

  public List<Set> getData() {
    return data;
  }

  public void setData(List<Set> data) {
    this.data = data;
  }
}
