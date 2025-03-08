package io.github.jangacnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error {

  @JsonProperty
  private String message;
  @JsonProperty
  private int code;

  public Error() {
    // default constructor
  }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}
