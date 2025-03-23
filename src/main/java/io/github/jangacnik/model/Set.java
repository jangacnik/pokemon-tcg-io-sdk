package io.github.jangacnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Set {

  @JsonProperty("id")
  private String id;
  @JsonProperty("name")
  private String name;
  @JsonProperty("series")
  private String series;
  @JsonProperty("printedTotal")
  private Integer printedTotal;
  @JsonProperty("total")
  private Integer total;
  @JsonProperty("legalities")
  private Legalities legalities;
  @JsonProperty("ptcgoCode")

  private String ptcgoCode;
  @JsonProperty("releaseDate")

  private String releaseDate;
  @JsonProperty("updatedAt")
  private String updatedAt;
  @JsonProperty("images")
  private SetImages images;

  public Set() {
    // default constructor
  }

  public Set(String id, String name, String series, Integer printedTotal, Integer total,
      Legalities legalities, String ptcgoCode, String releaseDate, String updatedAt,
      SetImages images) {
    this.id = id;
    this.name = name;
    this.series = series;
    this.printedTotal = printedTotal;
    this.total = total;
    this.legalities = legalities;
    this.ptcgoCode = ptcgoCode;
    this.releaseDate = releaseDate;
    this.updatedAt = updatedAt;
    this.images = images;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSeries() {
    return series;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public Integer getPrintedTotal() {
    return printedTotal;
  }

  public void setPrintedTotal(Integer printedTotal) {
    this.printedTotal = printedTotal;
  }

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public Legalities getLegalities() {
    return legalities;
  }

  public void setLegalities(Legalities legalities) {
    this.legalities = legalities;
  }

  public String getPtcgoCode() {
    return ptcgoCode;
  }

  public void setPtcgoCode(String ptcgoCode) {
    this.ptcgoCode = ptcgoCode;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public SetImages getImages() {
    return images;
  }

  public void setImages(SetImages images) {
    this.images = images;
  }
}
