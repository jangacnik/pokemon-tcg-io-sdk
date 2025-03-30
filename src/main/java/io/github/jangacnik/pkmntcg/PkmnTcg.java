package io.github.jangacnik.pkmntcg;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.jangacnik.pkmntcg.model.dto.CardDto;
import io.github.jangacnik.pkmntcg.model.dto.CardsDto;
import io.github.jangacnik.pkmntcg.model.dto.GenericDto;
import io.github.jangacnik.pkmntcg.model.dto.SetDto;
import io.github.jangacnik.pkmntcg.model.dto.SetsDto;
import io.github.jangacnik.pkmntcg.model.enums.CardQueryOptions;
import io.github.jangacnik.pkmntcg.model.enums.SetQueryOptions;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.util.Optional;

public class PkmnTcg {

  private static final String SUB_PATH_CARDS = "cards";
  private static final String SUB_PATH_SETS = "sets";
  private static final String SUB_PATH_TYPES = "types";
  private static final String SUB_PATH_SUPER_TYPES = "supertypes";
  private static final String SUB_PATH_SUB_TYPES = "subtypes";
  private static final String SUB_PATH_RARITIES = "rarities";
  private static final ObjectMapper objectMapper = new ObjectMapper();

  public PkmnTcg(String apiKey) {
    ApiCaller.apiKey = apiKey;
  }

  public PkmnTcg() {
  }

  public static void setApiKey(String apiKey) {
    ApiCaller.apiKey = apiKey;
  }

  /**
   * Factory method for the {@link CardsBuilder} class.
   *
   * @return a new instance of {@link CardsBuilder}
   */
  public CardsBuilder cards() {
    return new CardsBuilder();
  }

  /**
   * Factory method for the {@link SetsBuilder} class.
   *
   * @return a new instance of {@link SetsBuilder}
   */
  public SetsBuilder sets() {
    return new SetsBuilder();
  }

  /**
   * Search for card with given id.
   *
   * @param id of card
   * @return {@link Optional} of {@link CardDto}
   */
  public Optional<CardDto> getCardById(String id)
      throws IOException, URISyntaxException, InterruptedException {
    HttpResponse<String> response = ApiCaller.executeRequest(SUB_PATH_CARDS + "/" + id);
    return Optional.of(objectMapper.readValue(response.body(), CardDto.class));
  }

  /**
   * Search for set with given id.
   *
   * @param id of set
   * @return {@link Optional} of {@link SetDto}
   */
  public Optional<SetDto> getSetById(String id)
      throws IOException, URISyntaxException, InterruptedException {
    HttpResponse<String> response = ApiCaller.executeRequest(SUB_PATH_SETS + "/" + id);
    return Optional.of(objectMapper.readValue(response.body(), SetDto.class));
  }

  /**
   * Get list of available Supertypes.
   *
   * @return {@link GenericDto} of all available supertypes.
   */
  public Optional<GenericDto> getSupertypes()
      throws URISyntaxException, IOException, InterruptedException {
    return getGenericData(SUB_PATH_SUPER_TYPES);
  }

  /**
   * Get list of available Subtypes.
   *
   * @return {@link GenericDto} of all available subtypes.
   */
  public Optional<GenericDto> getSubtypes()
      throws URISyntaxException, IOException, InterruptedException {
    return getGenericData(SUB_PATH_SUB_TYPES);

  }

  /**
   * Get list of available Types.
   *
   * @return {@link GenericDto} of all available types.
   */
  public Optional<GenericDto> getTypes()
      throws URISyntaxException, IOException, InterruptedException {
    return getGenericData(SUB_PATH_TYPES);
  }

  /**
   * Get list of available Rarities.
   *
   * @return {@link GenericDto} of all available rarities.
   */
  public Optional<GenericDto> getRarities()
      throws URISyntaxException, IOException, InterruptedException {
    return getGenericData(SUB_PATH_RARITIES);
  }

  private Optional<GenericDto> getGenericData(String data)
      throws URISyntaxException, IOException, InterruptedException {
    return Optional.of(
        objectMapper.readValue(ApiCaller.executeRequest(data).body(), GenericDto.class));
  }

  public static class CardsBuilder extends QueryBuilder implements ApiCall<CardsDto> {

    private CardsBuilder() {
    }

    public CardsBuilder where(String query) {
      addQuery(query);
      return this;
    }

    public CardsBuilder where(CardQueryOptions field, String value) {
      addQuery(field.toString(), value);
      return this;
    }

    public CardsBuilder select(String value) {
      addSelectField(value);
      return this;
    }

    public CardsBuilder page(int page) {
      setPageParam(page);
      return this;
    }

    public CardsBuilder pageSize(int pageSize) {
      super.setPageSizeParam(pageSize);
      return this;
    }

    @Override
    public Optional<CardsDto> findAll()
        throws URISyntaxException, IOException, InterruptedException {
      try {
        return Optional.of(objectMapper.readValue(query(SUB_PATH_CARDS).body(), CardsDto.class));
      } catch (Exception e) {
        throw new IOException(e.getStackTrace().toString());
      }
  }
  }

  public static class SetsBuilder extends QueryBuilder implements ApiCall<SetsDto> {

    private SetsBuilder() {
    }

    public SetsBuilder where(SetQueryOptions field, String value) {
      addQuery(field.toString(), value);
      return this;
    }

    public SetsBuilder where(String query) {
      addQuery(query);
      return this;
    }

    public SetsBuilder select(String value) {
      addSelectField(value);
      return this;
    }

    public SetsBuilder page(int page) {
      setPageParam(page);
      return this;
    }

    public SetsBuilder pageSize(int pageSize) {
      setPageParam(pageSize);
      return this;
    }

    @Override
    public Optional<SetsDto> findAll()
        throws URISyntaxException, IOException, InterruptedException {
      return Optional.of(objectMapper.readValue(query(SUB_PATH_SETS).body(), SetsDto.class));
    }
  }
}
