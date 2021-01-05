package com.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        StudentsInformation studentsInformation=new StudentsInformation();
        Scanner scanner=new Scanner(System.in);

        System.out.println("choose:");
        System.out.println("1-Submit Student's information :\n2_Edit Student's information : \n3-Delete Student's information :");
        int choice=scanner.nextInt();

        System.out.println("Enter the requested information");
        switch (choice){
            case 1:
                System.out.println("Enter your Id:");
                studentsInformation.setId(scanner.nextLong());
                System.out.println("Enter your Name:");
                studentsInformation.setName(scanner.next());
                System.out.println("Enter your Year of Entry:");
                studentsInformation.setYearEntry(scanner.nextInt());
                System.out.println("Enter your Grade:");
                studentsInformation.setGrade(scanner.nextFloat());
                try {
                    studentsInformation.insert(studentsInformation.getId(),studentsInformation.getName(),studentsInformation.getYearEntry(),studentsInformation.getGrade());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case 2:
                System.out.println("Enter your Id : ");
                long id=scanner.nextInt();
                System.out.println("Enter your new Name:");
                studentsInformation.setName(scanner.next());
                System.out.println("Enter your new Year of Entry:");
                studentsInformation.setYearEntry(scanner.nextInt());
                System.out.println("Enter your new Grade:");
                studentsInformation.setGrade(scanner.nextFloat());
                try {
                    studentsInformation.update(studentsInformation.getName(),studentsInformation.getYearEntry(),studentsInformation.getGrade());
                    studentsInformation.commit();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;

            case 3:
                System.out.println("Enter your Id : ");
                id=scanner.nextInt();
                try {
                    studentsInformation.delete(id);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }
    }
