package com.usc.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int  array[];
        int   n;
        int count=0;
        System.out.print("Enter n : ");
        Scanner intput = new Scanner(System.in);
        n = intput.nextInt();
         for (int i=0 ; i<array.length ; i++) {
             System.out.println("Enter number " +(i) );
             array[i] = intput.nextInt();
                }
        int  x;
        System.out.println("Enter your Number for Search in array:");
         x = intput.nextInt();
         for (int j=0 ; j<n ; j++) {
             if (array[j] == x) {
                 System.out.println(" True ");
                 count ++;
             }
                 else
                 System.out.println(" False ");
            }
             System.out.println("reapeted " +count+ " times");
         }

    }
