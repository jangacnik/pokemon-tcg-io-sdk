package io.github.jangacnik.model.dto;

import io.github.jangacnik.model.Set;
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
