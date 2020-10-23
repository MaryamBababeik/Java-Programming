package com.usc.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double x,y,p,s;
        System.out.println(" Enter the sides of Rectangle ");
        Scanner input=new Scanner(System.in);
        x=input.nextDouble();
        y=input.nextDouble();
        p=(x+y)*2;
        s=(x*y);
        System.out.println(("and the Area is: ") +p + ("The Environment is: ") + s);

    } }

