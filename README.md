<h1>Pokemon TCG IO Java SDK</h1>
<h2>Work in progress</h2>
This is a Java implementation of a wrapper for the Pokemon TCG API found at [pokemontcg.io](https://pokemontcg.io)

<h2>Installation</h2>
TODO

<h2>Usage</h2>
First you need to initialize the PkmnTcg class and provide your API key.

```java
PkmnTcg pkmnTcg = new PkmnTcg("API_KEY");
```

<h3>Cards</h3>

<h4>Find card by id</h4>

```java
Optional<CardDto> card = pkmnTcg.getCardById("cel25-25");
```

<h4>Query all cards</h4>

To get all cards from the API you can use the findAll() method.
Note that the results are Paginated and the maximum page size is 250.

```java
Optional<CardsDto> cards = pkmnTcg.cards()
                                  .findAll();
```

You can set the page and page size of a request like below:

```java
Optional<CardsDto> cards = pkmnTcg.cards()
                                    .page(2)
                                    .pageSize(10)
                                    .findAll();
```
<h4>Filtering requests</h4>
You can filter cards with where() when using the cards builder like in the examples below:
```java
//Search for cards from the Celebrations set where HP is equal to 50
Optional<CardsDto> cards = pkmnTcg.cards()
          .where(CardQueryOptions.SET_NAME, "Celebrations")
          .where(CardQueryOptions.HP, "50")
          .findAll();
```

You can also write your own queries or use the QueryHelper methods:

```java
Optional<CardsDto> cards = pkmnTcg.cards()
    .where("set.name:Celebrations")
    .where(QueryHelper.anyOf("types", "grass", "fire"))
    .where(QueryHelper.inclusiveRange(CardQueryOptions.HP.name(), 0, 100))
    .findAll();
```

<h3>Sets</h3>

<h4>Find set by id</h4>

```java
Optional<SetDto> setDto = pkmnTcg.getSetById("cel25");
```

<h4>Query all sets</h4>

```java
    Optional<SetsDto> sets = pkmnTcg.sets().findAll();
```

You can set the page and page size of a request like below:

```java
Optional<SetsDto> sets = pkmnTcg.sets()
                                .page(2)
                                .pageSize(20)
                                .findAll();
```

Similar to cards you can filter sets with where() with your own filters or using the built-in query options:

```java
Optional<SetsDto> cards = pkmnTcg.sets()
          .where("name:Celebrations")
          .where(QueryHelper.inclusiveRange(SetQueryOptions.TOTAL.name(), 0, 100))
          .findAll();
```

<h3>Available types and rarities</h3>
To get a list of available values:

```java
    //Get a list of all available rarities for cards
    Optional<GenericDto> rarities = pkmnTcg.getRarities();

    //Get a list of all available types for cards
    Optional<GenericDto> types = pkmnTcg.getTypes();

    //Get a list of all available sub types for cards
    Optional<GenericDto> subtypes = pkmnTcg.getSubtypes();

    //Get a list of all available super types for cards
    Optional<GenericDto> supertypes = pkmnTcg.getSupertypes();
```
