package io.github.jangacnik.pkmntcg.model.dto;

import io.github.jangacnik.pkmntcg.model.Set;

public class SetDto extends GenericResponse {

  private Set data;

  public Set getData() {
    return data;
  }

  public void setData(Set data) {
    this.data = data;
  }
}
