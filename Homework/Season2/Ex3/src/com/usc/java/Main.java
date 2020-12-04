package com.usc.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n ;
        Implementation imp = new Implementation();
        System.out.println("enter a number :");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println(n);

            if (n == 0){
                imp.isZero(n);
            }
            else if (n>0){
                imp.isPosetive(n);
            }
            else if (n<0){
                imp.isNegative(n);
            }
            else if (n%0==0){
                imp.isEven(n);
            }
            else {
                imp.isOdd(n);
            }

        }
}
