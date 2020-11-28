package com.usc.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("enter the informaton of users and then ,show them");

        for (int i = 0 ; i<5 ; i++){
    System.out.println("enter Id ");
    User p1=User.getInstance();
    p1.id = input.nextInt();
    System.out.println(p1);

    System.out.println("enter Name");
    User p2 = User.getInstance();
    p2.name = input.next();
    System.out.println(p2);

    System.out.println("enter Last Name");
    User p3 = User.getInstance();
    p3.lastName = input.nextLine();
    System.out.println(p3);

    System.out.println("Id : "+p1.id +"Name : "+p2.name + "LastName : " +p3.lastName);
    }
    }
}
