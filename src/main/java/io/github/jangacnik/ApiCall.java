package io.github.jangacnik;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;

interface ApiCall<T> {

  Optional<T> findAll() throws URISyntaxException, IOException, InterruptedException;
}
