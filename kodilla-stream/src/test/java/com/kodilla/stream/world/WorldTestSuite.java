package com.kodilla.stream.world;

import com.kodilla.stream.sand.SandStorage;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        World world = new World();

        Continent europe = new Continent("Europe");
        Country poland = new Country("Poland", new BigDecimal("38123123"));
        Country vatican = new Country("Vatican", new BigDecimal("1"));

        europe.addCountry(poland);
        europe.addCountry(vatican);
        world.addContinent(europe);


        BigDecimal expectedQuantity = new BigDecimal("38123124");
        assertEquals(expectedQuantity, world.getPeopleQuantity());
    }
}
