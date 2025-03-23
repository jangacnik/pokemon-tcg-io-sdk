package io.github.jangacnik;

import io.github.jangacnik.model.enums.CardQueryOptions;
import java.util.ArrayList;
import java.util.List;

public class QueryHelper {

  private static final String OR = " OR ";
  private static final String TO = " TO ";

  private QueryHelper() {
  }

  public static String anyOf(String field, String... value) {
    List<String> conditions = new ArrayList<>();
    for (String s : value) {
      conditions.add(field + ":" + s);
    }
    return "(" + String.join(OR, conditions) + ")";
  }

  public static String phrase(String field, String phrase) {
    return field + ":%22" + phrase + "%22";
  }

  public static String exclusiveRange(String field, int from, int to) {
    return field + ":%7B" + from + TO + to + "%7D";
  }

  public static String inclusiveRange(String field, int from, int to) {
    return field + ":%5B" + from + TO + to + "%5D";
  }

  public static String not(CardQueryOptions field, String value) {
    return "-" + field + ":" + value;
  }

  public static String exactMatch(CardQueryOptions field, String value) {
    return "!" + field + ":" + value;
  }

}
