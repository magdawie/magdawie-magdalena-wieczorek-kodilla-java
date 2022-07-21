package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void beforeEach() {
        System.out.println("Starting test case");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("Ending test case");
    }

    @DisplayName("When add testOddNumbersExterminatorEmptyList "+ "than testOddNumbersExterminatorEmptyList should return "
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        List<Integer> empty = new ArrayList<>();

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> res;
        res = oddNumbersExterminator.exterminate(empty);
        System.out.println("Testing: " + res);
        Assertions.assertEquals(0, res.size());
    }
    @Test
    void testOddNumbersExterminatorNormalList() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 4, 6));
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> res;
        res = oddNumbersExterminator.exterminate(numbers);

        System.out.println("Testing: " + res);
        Assertions.assertEquals(3, res.size());
    }
}
