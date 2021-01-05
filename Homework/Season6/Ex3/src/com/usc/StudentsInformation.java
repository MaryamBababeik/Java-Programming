package com.usc;

import java.sql.*;

public class StudentsInformation implements AutoCloseable{
    private long id;
    private String name;
    private int yearEntry;
    private float grade;

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

    public int getYearEntry() {
        return yearEntry;
    }

    public void setYearEntry(int yearEntry) {
        this.yearEntry = yearEntry;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public Connection connection;
    public PreparedStatement preparedStatement;

    public void insert(long id, String name, int yearEntry, float grade) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "maryambababeik", "java1234");
            preparedStatement = connection.prepareStatement("insert into StudentInfo(id, name, yearEntry, garde) values (?,?,?,?)");
            preparedStatement.setLong(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, yearEntry);
            preparedStatement.setFloat(4, grade);
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
            preparedStatement = connection.prepareStatement("delete from StudentsInfo where id=?");
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } else {
            System.out.println("your Id Student is wrong!!!");
        }
    } catch (SQLException e) {
            System.out.println(" ERROR " + e.getMessage());
        }
    }

    public void update(String name, int yearEntry, float grade) {
        try {
        preparedStatement = connection.prepareStatement("update StudentInfo set name =? , yearEntry =? , grade =?  where id=? ");
        preparedStatement.setString(1, getName());
        preparedStatement.setInt(2, getYearEntry());
        preparedStatement.setFloat(3, getGrade());
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
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
