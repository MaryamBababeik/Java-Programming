package com.usc.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        UserInformation userInformation = new UserInformation();
        System.out.println("What do you want ?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1)Sign Up \n2)Login ");
        int select = scanner.nextInt();
        System.out.println("Enter the requested information");

        switch (select){
            case 1:
                System.out.println("Enter your name:");
                userInformation.setName(scanner.next());
                System.out.println("Enter your UserName:");
                userInformation.setUsername(scanner.next());
                System.out.println("Enter your PassWord:");
                userInformation.setPassword(scanner.next());
                System.out.println("Enter your Email");
                userInformation.setEmail(scanner.next());
                System.out.println("Welcom :)");
                userInformation.insert(userInformation.getName(),userInformation.getUsername(),userInformation.getPassword(),userInformation.getEmail());
                break;

            case 2:
                System.out.println("Enter your UserName");
                userInformation.setUsername(scanner.next());
                System.out.println("Enter your PassWord:");
                userInformation.setPassword(scanner.next());
                break;
        }
    }
}
