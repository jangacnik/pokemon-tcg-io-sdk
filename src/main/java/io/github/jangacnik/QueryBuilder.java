package io.github.jangacnik;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class QueryBuilder {
  private final List<String> qParams;
  private final List<String> selectParams;
  private String pageParam;
  private String pageSizeParam;

  protected QueryBuilder() {
    qParams = new ArrayList<>();
    selectParams = new ArrayList<>();
  }

  protected void addQuery(String field) {
    Objects.requireNonNull(field);
    this.qParams.add(field);
  }

  protected void addQuery(String field, String value) {
    Objects.requireNonNull(field);
    Objects.requireNonNull(value);
    this.qParams.add(field + ":" + value);
  }

  protected void setPageParam(int page) {
    this.pageParam = String.valueOf(page);
  }

  protected void setPageSizeParam(int pageSize) {
    this.pageSizeParam = String.valueOf(pageSize);
  }

  protected void addSelectField(String field) {
    Objects.requireNonNull(field);
    this.selectParams.add(field);
  }

  protected HttpResponse<String> query(String query)
      throws URISyntaxException, IOException, InterruptedException {
    Objects.requireNonNull(query);
    return ApiCaller.executeRequest(query + prepareQuery());
  }

  protected String prepareQuery() {
    List<String> parameters = new ArrayList<>();
    if (qParams.isEmpty() && selectParams.isEmpty() && pageParam == null && pageSizeParam == null) {
      return null;
    }
    if (pageParam != null) {
      parameters.add("page=" + pageParam);
    }
    if (pageSizeParam != null) {
      parameters.add("pageSize=" + pageSizeParam);
    }
    if (!qParams.isEmpty()) {
      parameters.add("q=" + String.join("+", qParams));
    }
    if (!selectParams.isEmpty()) {
      parameters.add("select=" + String.join(",", selectParams));
    }
    return "?" + String.join("&", parameters).replace(" ", "+");
  }
}

