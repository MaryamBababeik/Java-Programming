import controller.SiteUsersController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        String username;
        String password;
        String email;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1)Sign Up \n2)Login ");
        int choice = scanner.nextInt();
        System.out.println("Enter the requested information");

        switch (choice) {
            case 1:
                System.out.println("Enter your name:");
                name = scanner.next();
                System.out.println("Enter your Username:");
                username = scanner.next();
                System.out.println("Enter your Password:");
                password = scanner.next();
                System.out.println("Enter your Email");
                email = scanner.next();
                try {
                    SiteUsersController.getInstance().insert(name,username,password,email);
                }catch (Exception e){
                    System.out.println("Error!"+e.getMessage());
                }
                break;

            case 2:
                System.out.println("Enter your UserName");
                username = scanner.next();
                System.out.println("Enter your PassWord:");
                password = scanner.next();
                try {
                    SiteUsersController.getInstance().select(username,password);
                }catch (Exception e){
                    System.out.println("Error!"+e.getMessage());
                }
                break;
        }
    }
}
