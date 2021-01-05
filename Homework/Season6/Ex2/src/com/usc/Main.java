package com.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        EmployeesInformation employeesInformation=new EmployeesInformation();
        Scanner scanner=new Scanner(System.in);

        System.out.println("choose:");
        System.out.println("1-submit employee's information :\n2-delete employee's information :");
        int choice=scanner.nextInt();

        System.out.println("Enter the requested information");
            switch (choice){
                case 1:
                    System.out.println("Enter your Id:");
                    employeesInformation.setId(scanner.nextLong());
                    System.out.println("Enter your Name:");
                    employeesInformation.setName(scanner.next());
                    System.out.println("Enter your Melli Code:");
                    employeesInformation.setMelliCode(scanner.nextLong());
                    System.out.println("Enter your Father Name:");
                    employeesInformation.setFatherName(scanner.next());
                    System.out.println("Enter your Post:");
                    employeesInformation.setPost(scanner.next());
                    System.out.println("Enter your Salary:");
                    employeesInformation.setSalary(scanner.nextLong());
                    System.out.println("Enter your Work Experience:");
                    employeesInformation.setWorkExperience(scanner.nextInt());
                    try {
                        employeesInformation.insert(employeesInformation.getId(),employeesInformation.getName(),employeesInformation.getMelliCode(),employeesInformation.getFatherName(),employeesInformation.getPost(),employeesInformation.getSalary(),employeesInformation.getWorkExperience());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Enter your Id : ");
                    long id=scanner.nextInt();
                    try {
                        employeesInformation.delete(employeesInformation.getId());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
        }
    }
}
