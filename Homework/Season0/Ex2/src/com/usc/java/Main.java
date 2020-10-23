package com.usc.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code
        int n,m,max=0;
        System.out.print("Enter number for value of n: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(i+")");
            m =sc.nextInt();
            if(m>max)
                max=m;
        }
        System.out.print("maximum number: " + max);
    }}