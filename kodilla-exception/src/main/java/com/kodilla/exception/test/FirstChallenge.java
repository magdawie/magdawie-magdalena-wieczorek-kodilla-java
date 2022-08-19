package com.kodilla.exception.test;


public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }


    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();


        //System.out.println(result);
        try  {
            double result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Oh no! Something went wrong! Error:" + e);
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}