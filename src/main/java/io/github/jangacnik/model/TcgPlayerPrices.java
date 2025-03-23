package io.github.jangacnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcgPlayerPrices {

  @JsonProperty
  private TcgPlayerPrice normal;
  @JsonProperty
  private TcgPlayerPrice holofoil;
  @JsonProperty
  private TcgPlayerPrice reverseHolofoil;
  @JsonProperty
  private TcgPlayerPrice unlimited;
  @JsonProperty("1stEditionHolofoil")
  private TcgPlayerPrice firstEditionHolofoil;
  @JsonProperty("1stEdition")
  private TcgPlayerPrice firstEdition;
  @JsonProperty("1stEditionNormal")
  private TcgPlayerPrice firstEditionNormal;
  @JsonProperty
  private TcgPlayerPrice unlimitedHolofoil;

  public TcgPlayerPrices() {
    // default constructor
  }

  public TcgPlayerPrices(TcgPlayerPrice normal, TcgPlayerPrice holofoil,
      TcgPlayerPrice reverseHolofoil, TcgPlayerPrice unlimited, TcgPlayerPrice firstEditionHolofoil,
      TcgPlayerPrice firstEdition, TcgPlayerPrice firstEditionNormal,
      TcgPlayerPrice unlimitedHolofoil) {
    this.normal = normal;
    this.holofoil = holofoil;
    this.reverseHolofoil = reverseHolofoil;
    this.unlimited = unlimited;
    this.firstEditionHolofoil = firstEditionHolofoil;
    this.firstEdition = firstEdition;
    this.firstEditionNormal = firstEditionNormal;
    this.unlimitedHolofoil = unlimitedHolofoil;
  }

  public TcgPlayerPrice getUnlimitedHolofoil() {
    return unlimitedHolofoil;
  }

  public void setUnlimitedHolofoil(TcgPlayerPrice unlimitedHolofoil) {
    this.unlimitedHolofoil = unlimitedHolofoil;
  }

  public TcgPlayerPrice getNormal() {
    return normal;
  }

  public void setNormal(TcgPlayerPrice normal) {
    this.normal = normal;
  }

  public TcgPlayerPrice getHolofoil() {
    return holofoil;
  }

  public void setHolofoil(TcgPlayerPrice holofoil) {
    this.holofoil = holofoil;
  }

  public TcgPlayerPrice getReverseHolofoil() {
    return reverseHolofoil;
  }

  public void setReverseHolofoil(TcgPlayerPrice reverseHolofoil) {
    this.reverseHolofoil = reverseHolofoil;
  }

  public TcgPlayerPrice getFirstEditionHolofoil() {
    return firstEditionHolofoil;
  }

  public void setFirstEditionHolofoil(TcgPlayerPrice firstEditionHolofoil) {
    this.firstEditionHolofoil = firstEditionHolofoil;
  }

  public TcgPlayerPrice getFirstEditionNormal() {
    return firstEditionNormal;
  }

  public void setFirstEditionNormal(TcgPlayerPrice firstEditionNormal) {
    this.firstEditionNormal = firstEditionNormal;
  }
}
