package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootApplication
@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void  testCalculations(){
        double addVal = calculator.add(2,2);
        double subVal = calculator.sub(2,2);
        double divVal = calculator.div(2,2);
        double mulVal = calculator.mul(2,2);

        Assertions.assertEquals(4, addVal);
        Assertions.assertEquals(0, subVal);
        Assertions.assertEquals(1, divVal);
        Assertions.assertEquals(4, mulVal);


    }
}
