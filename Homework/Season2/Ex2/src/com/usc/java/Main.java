package com.usc.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            Lesson lesson = new Lesson();
            System.out.println("enter your course :");
            System.out.println(" 1.Physycs1\n 2.Physycs2\n 3.Math1\n 4.Math2\n 5.Programming\n 6.WorkProgramming");
            int choice;
            choice = scanner.nextInt();
        System.out.println("tedade vahed :");

            switch(choice){
                case 1:
                    lesson.physycs1();

                case 2:
                    lesson.physycs2();
                    break;

                case 3:
                    lesson.math1();
                    break;

                case 4:
                    lesson.math2();
                    break;

                case 5:
                    lesson.programming();
                    break;

                case 6:
                    lesson.workProgramming();
                    break;
            }
        }
    }
