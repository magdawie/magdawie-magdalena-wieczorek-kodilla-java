package com.kodilla.stream.world;

import com.kodilla.stream.sand.Africa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> continentsCollection = new ArrayList<>();

    public void addContinent(Continent continent) {
        continentsCollection.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalQuantity = continentsCollection.stream()
                .flatMap(c -> c.getCountryCollection().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalQuantity;
    }
}
