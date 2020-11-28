package com.usc.java;

import java.security.PublicKey;
import java.util.Scanner;

public class User {
    private static User user;

    private User(){

    }

    int id;
    String name;
    String lastName;

    public static User getInstance(){
        if (user == null){
            user = new User();
        }
        return user();
    }
}
