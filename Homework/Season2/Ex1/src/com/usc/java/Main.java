package com.usc.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        float x, y;
        System.out.println("enter 2 numbers for caluclate");
        Scanner input = new Scanner(System.in);
        System.out.print(" enter x : ");
        x = input.nextFloat();
        System.out.print(" enter y : ");
        y = input.nextFloat();
        System.out.println(" choose: \n 1.(+)  2.(-)  3.(*)  4.(/) ");

        int choice;
        choice=input.nextInt();

        switch (choice) {
            case 1:
                System.out.println(x + y);
                break;

            case 2:
                if (x > y) {
                    System.out.println(x - y);
                } else
                    System.out.println(y - x);
                break;

            case 3:
                System.out.println(x * y);
                break;

            case 4:
                if (x > y) {
                    System.out.println(x / y);
                } else
                    System.out.println(y / x);
                break;

            default:
                System.out.println("*your choice NOT defined*");
        }
    }
}
