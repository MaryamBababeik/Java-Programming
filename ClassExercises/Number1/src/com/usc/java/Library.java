package com.usc.java;

import java.util.Scanner;

public class Library {


    public String name;           //name of book
    public String quality;   //Satisfaction rate of the book
    Scanner sc=new Scanner(System.in);

    public void borrow(){
        System.out.println(" Enter the name of book that you want to borrow: ");
        name=sc.nextLine();
    }

    public void returnn(){
        System.out.println(" Enter the name of book that you want to return: ");
        name=sc.nextLine();
        satisfaction();
    }

    public void buy(){
        System.out.println(" Enter the name of book that you want to buy: ");
        name=sc.nextLine();
    }

    public int satisfaction(){
        System.out.println(" Aya az ketab rezayat dashtid ?\n 1.YES   2.NO");
        quality=sc.nextLine();
        System.out.println(" your Survey is saved ");
        return 0;
    }

}
