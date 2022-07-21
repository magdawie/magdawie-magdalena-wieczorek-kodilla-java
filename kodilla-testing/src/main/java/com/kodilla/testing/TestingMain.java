package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - calc");
        Calculator calc = new Calculator();
        if(calc.add(2,2)==4){
            System.out.println("test OK");
        } else {
        System.out.println("Error!");
         }
        if(calc.subtract(4,2)==2){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
