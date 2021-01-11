package view;

import controller.InternetPackagesController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InternetPackagesController internetPackagesController=new InternetPackagesController();
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.Sing Up \n2.Login");
        int choise;
        switch (choise){
            case 1:
                System.out.println("Full Name ?");

        }
        System.out.println("Enter your username : ");
        String username=input.next();
        System.out.println("Enter your password : ");
        String pass=input.next();
        Bastcont.check(username,pass);
        bastcont.show();
        int i = input.nextInt();
        bastcont.buy(i,username,pass);
}
