package io.github.jangacnik.model.dto;

import io.github.jangacnik.model.Set;

public class SetDto extends GenericResponse{

  public Set getData() {
    return data;
  }

  public void setData(Set data) {
    this.data = data;
  }

  private Set data;
}
