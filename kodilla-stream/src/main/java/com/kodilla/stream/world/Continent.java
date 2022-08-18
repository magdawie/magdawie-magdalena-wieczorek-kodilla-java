package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {

     private String name;

     private final List<Country> countryCollection = new ArrayList<>();

     public Continent(String name) {
        this.name = name;
     }

    public List<Country> getCountryCollection() {
        return countryCollection;
    }

    public void addCountry(Country country) {
        countryCollection.add(country);
    }

}
