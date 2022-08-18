package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    String name;
    BigDecimal population;

    public Country(String name, BigDecimal population) {
        this.name = name;
        this.population = population;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }
}
