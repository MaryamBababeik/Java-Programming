package com.usc;

import java.sql.*;

public class EmployeesInformation implements AutoCloseable {
    private long id;
    private String name;
    private long melliCode;
    private String fatherName;
    private String post;
    private long salary;
    private int workExperience;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMelliCode() {
        return melliCode;
    }

    public void setMelliCode(long melliCode) {
        this.melliCode = melliCode;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }


    public Connection connection;
    public PreparedStatement preparedStatement;

    public void insert(long id, String name, long melliCode, String fatherName, String post, long salary, int workExperience) {
        try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "maryambababeik", "java1234");
        preparedStatement = connection.prepareStatement("insert into EmployeesInfo(id, name, melliCode, fatherName, post, salary, workExperience) values (?,?,?,?,?,?,?)");
        preparedStatement.setLong(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setLong(3, melliCode);
        preparedStatement.setString(4, fatherName);
        preparedStatement.setString(5, post);
        preparedStatement.setLong(6, salary);
        preparedStatement.setInt(6, workExperience);
        preparedStatement.executeUpdate();
    } catch (ClassNotFoundException e) {
        System.out.println("DB Driver Not Exist!!");
    } catch (SQLException e1) {
        System.out.println("ERROR" + e1.getMessage());
    }
      }

    public void delete(long id) {
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                preparedStatement = connection.prepareStatement("delete from EmployeesInfo where id=?");
                preparedStatement.setLong(1, id);
                preparedStatement.executeUpdate();
            } else {
                System.out.println("your Employee Id is wrong!!!");
            }
        } catch (SQLException e1) {
            System.out.println("ERROR" + e1.getMessage());
        }
    }

    public void commit() throws Exception{
        connection.commit();
    }
    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }
}
