package io.github.jangacnik.model.dto;

import java.util.List;

public class GenericDto {
  public List<String> getData() {
    return data;
  }
  public void setData(List<String> data) {
    this.data = data;
  }
  private List<String> data;
}
