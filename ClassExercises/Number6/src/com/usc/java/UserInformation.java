package com.usc.java;

import java.sql.*;

public class UserInformation {
    private String name;
    private String username;
    private String password;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void insert(String name, String username, String password, String email){
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","maryambababeik","java1234");
        PreparedStatement preparedStatement = connection.prepareStatement("insert into users(name, username, password, email) values (?,?,?,?)");

        preparedStatement.setString(1,name);
        preparedStatement.setString(2,username);
        preparedStatement.setString(3,password);
        preparedStatement.setString(4,email);

        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!");
            e.printStackTrace();
        } catch (SQLException e1) {
            System.out.println("DB Erorr!");
            e1.printStackTrace();
        }

    }
    public void select(String username,String pass){
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "maryambababeik", "java1234")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement2 = connection.prepareStatement("select * from person where username = ? and password=? ");
            preparedStatement2.setString(1,username);
            preparedStatement2.setString(2,pass);
            ResultSet resultSet = preparedStatement2.executeQuery();
            if (resultSet.next()) {
                System.out.println("username & password is correct.\nwelcome : "+resultSet.getString("username"));
            }else {
                System.out.println("your user or pass is incorrect!");
            }
            resultSet.close();
            preparedStatement2.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("DB Driver Not Exist!");
        } catch (SQLException e1) {
            e1.printStackTrace();
            System.out.println("DB Erorr!");
        }
}}







