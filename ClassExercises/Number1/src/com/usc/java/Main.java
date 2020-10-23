package com.usc.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(" What do you want ?\n 1.Borrow a book\n 2.Return the book\n 3.Buy a book");
        Scanner input = new Scanner(System.in);
        int choice;
        choice=input.nextInt();
        Library method=new Library();

        switch (choice){
            case 1:
            method.borrow();
                break;

            case 2:
            method.returnn();
                break;

            case 3:
             method.buy();
             break;

            default:
                System.out.println(" NOT DEFINDED!! ");

        }
    }
}
