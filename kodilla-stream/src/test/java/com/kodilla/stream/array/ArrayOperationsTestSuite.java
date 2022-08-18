package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        int[] val = {1, 5, 10, 15};
        double ret = ArrayOperations.getAverage(val);
        System.out.println("Avg: " + ret);

        assertEquals(7.75, ret);
    }

}
