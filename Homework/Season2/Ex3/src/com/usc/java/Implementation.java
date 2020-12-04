package com.usc.java;

public class Implementation implements  MyInteger{

    @Override
    public void isEven(int n) {
        System.out.println("the number is even");
    }
    @Override
    public void isOdd(int n) {
        System.out.println("the number is odd");
    }

    @Override
    public void isPosetive(int n) {
        System.out.println("the number is posetive");
    }

    @Override
    public void isNegative(int n) {
        System.out.println("the number is negative");
    }

    @Override
    public void isZero(int n) {
        System.out.println("the number is zero");
    }

}
