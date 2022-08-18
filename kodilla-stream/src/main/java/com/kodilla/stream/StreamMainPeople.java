package com.kodilla.stream;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigDecimal;

public class StreamMainPeople {

    public static void main(String[] args) {

        World world = new World();

        Continent europe = new Continent("Europe");
        Country poland = new Country("Poland", new BigDecimal("38123123"));
        Country vatican = new Country("Vatican", new BigDecimal("1"));

        europe.addCountry(poland);
        europe.addCountry(vatican);

        world.addContinent(europe);

        System.out.println("People quantity: " + world.getPeopleQuantity());

    }
}
