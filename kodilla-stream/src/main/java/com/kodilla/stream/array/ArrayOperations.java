package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {


        IntStream.range(0, numbers.length).map(x-> numbers[x]).forEach(System.out::println);

        OptionalDouble ret = IntStream.range(0, numbers.length).map(x -> numbers[x]).average();

        return ret.getAsDouble();

    }
}
