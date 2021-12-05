package br.com.beer.mvc.domain;

import java.util.Arrays;
import java.util.stream.Stream;

public enum BeerType {
    PILSEN, IPA, WEISS, APA;

    public static BeerType from(final String name) {
        return Stream.of(BeerType.values()).filter(beerType -> beerType.name().equalsIgnoreCase(name)).findAny()
            .orElseThrow();
    }
}
