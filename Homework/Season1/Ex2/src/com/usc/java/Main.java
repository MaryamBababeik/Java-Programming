package com.usc.java;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
         //zaribe har dars
        float[] score = new float[10];
        int[] factor = new int[10];
        int n;  

        System.out.println(" Enter the  1.Score and  2.Factor of each lesson for student ");
        Scanner input = new Scanner(System.in);
        System.out.print("Number of lessons: ");
        n = input.nextInt();


        double sum = 0;
        int k = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Lesson" + i +" : ");
            System.out.print("the score of lesson" + i + " : ");
            score[i] = input.nextFloat();
            System.out.print("the factor of lesson" + i + " : ");
            factor[i] = input.nextInt();
            k += factor[i];
            sum = score[i] * factor[i] + sum;
        }

        double grade = sum/k;
        System.out.println("the finally garde is :" + grade);

        if(grade>=12){
            System.out.println(" *The score is acceptable* ");
        }
           else
            System.out.println(" *The score is NOT acceptable* ");

    }




}
