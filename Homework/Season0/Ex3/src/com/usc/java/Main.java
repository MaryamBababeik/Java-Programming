package com.usc.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double x,y;
        int n;
        System.out.print("Enter number1 For x: ");
        Scanner input =new Scanner(System.in);
        x=input.nextInt();
        System.out.print("ENter number2 For y: ");
        y=input.nextInt();
        System.out.println("choose 1)+ " + "2)- " + "3)* " + "4)/ " );
        n=input.nextInt();
        switch(n){
            case 1:
            System.out.println(x+y);
            break;
            case 2:
                if(x>y)
            System.out.println(x-y);
                else
             System.out.println(y-x);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                System.out.println(x/y);
                break;
            default:
                System.out.println(" Not Defined !!");
        }
    }
}
