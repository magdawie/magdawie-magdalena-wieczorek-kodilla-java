package com.kodilla.exception.test;

public class ExceptionHandling {


    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();


        //System.out.println(result);
        try  {
            secondChallenge.probablyIWillThrowException(5, 4);
        } catch (Exception e) {
            System.out.println("Oh no! Something went wrong! Error:" + e);
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}
