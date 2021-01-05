package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UsersInfo usersInfo = new UsersInfo();
        System.out.println("choose:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1)Sign Up \n2)Edit information");
        int select = scanner.nextInt();
        System.out.println("Enter the requested information");

        switch (select){
            case 1:
                System.out.println("Enter your UserCode:");
                usersInfo.setUserCode(scanner.nextLong());
                System.out.println("Enter your UserName:");
                usersInfo.setUserName(scanner.next());
                System.out.println("Enter your PassWord:");
                usersInfo.setPassWord(scanner.next());
                System.out.println("Enter your Age:");
                usersInfo.setAge(scanner.nextInt());
                System.out.println("Enter your Email:");
                usersInfo.setEmail(scanner.next());
                System.out.println("Enter your Education:");
                usersInfo.setEducation(scanner.next());
                System.out.println("Welcom :)");
                    usersInfo.insert(usersInfo.getUserCode(),usersInfo.getUserName(),usersInfo.getPassWord(),usersInfo.getAge(),usersInfo.getEmail(),usersInfo.getEducation());
                break;

            case 2:
                System.out.println("Enter your UserCode:");
                usersInfo.setUserCode(scanner.nextLong());
                System.out.println("Enter your new UserName:");
                usersInfo.setUserName(scanner.next());
                System.out.println("Enter your new PassWord:");
                usersInfo.setPassWord(scanner.next());
                System.out.println("Enter your new Age:");
                usersInfo.setAge(scanner.nextInt());
                System.out.println("Enter your new Email:");
                usersInfo.setEmail(scanner.next());
                System.out.println("Enter your new Education:");
                usersInfo.setEducation(scanner.next());
                try {
                    usersInfo.update(usersInfo.getUserName(),usersInfo.getPassWord(),usersInfo.getAge(),usersInfo.getEmail(),usersInfo.getEducation());
                }catch (Exception e) {
            e.printStackTrace();
        }
                break;
        }
    }
}
