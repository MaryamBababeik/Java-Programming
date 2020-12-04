package com.usc.java;

import java.util.Scanner;

import static java.lang.String.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int n;
        int i = 0;
        int count = 0;
        String str[] = new String[10];

        Scanner input = new Scanner(System.in);
        System.out.println("enter String of numbers :");
        str[i] = String.valueOf(input.nextInt());
        System.out.println(str[i]);
        System.out.println("Enter a number :");
        n = input.nextInt();
        System.out.println(n);

        for (int j = 0; j <= i; j++) {
            if (str[i] == n) {
                System.out.println("True");
                i++;
                count++;
            } else
                System.out.println(" False ");
            System.out.println("reapeted " + count + " times");

        }
    }
}
