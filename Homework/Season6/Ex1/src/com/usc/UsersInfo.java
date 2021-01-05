package com.usc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsersInfo {
    private long userCode;
    private String userName;
    private String passWord;
    private int age;
    private String email;
    private String education;

    public long getUserCode() {
        return userCode;
    }

    public void setUserCode(long userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Connection connection;
    public PreparedStatement preparedStatement;
    public void insert(long userCode, String username, String password, int age, String email, String education){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","maryambababeik","java1234");
            preparedStatement = connection.prepareStatement("insert into information(userCode, username, password, age, email, education) values (?,?,?,?,?,?)");

            preparedStatement.setLong(1,userCode);
            preparedStatement.setString(2,userName);
            preparedStatement.setString(3,password);
            preparedStatement.setInt(4,age);
            preparedStatement.setString(5,email);
            preparedStatement.setString(6,education);

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
    public void update(String username, String password, int age, String email, String education){
        try {
            preparedStatement = connection.prepareStatement("update information set userName=? , passWord=? , age=? , email=? , education=?  where userCode=? ");
            preparedStatement.setString(1,getUserName());
            preparedStatement.setString(2,getPassWord());
            preparedStatement.setInt(3,getAge());
            preparedStatement.setString(4,getEmail());
            preparedStatement.setString(5,getEducation());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e1) {
            e1.printStackTrace();
            System.out.println("DB Erorr!");
        }
    }

    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }

    public void commit() throws Exception{
        connection.commit();
    }
}
