package model.repository;

import model.entity.EmploymentEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmploymentRepository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public EmploymentRepository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "maryambababeik", "java1234");
        connection.setAutoCommit(false);
    }

    public void insert(EmploymentEntity employmentEntity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into EmplymentForm(fullName,nationalId,phoneNumber,email,education,workExperience) values (?,?,?,?,?,?)");
        preparedStatement.setString(1, employmentEntity.getFullName());
        preparedStatement.setString(2, employmentEntity.getNationalId());
        preparedStatement.setString(3, employmentEntity.getPhoneNumber());
        preparedStatement.setString(4, employmentEntity.getEmail());
        preparedStatement.setString(5, employmentEntity.getEducation());
        preparedStatement.setInt(6, employmentEntity.getWorkExperience());
        preparedStatement.executeUpdate();
    }

    public void commit() throws Exception {
        connection.commit();
    }

    public void rollback() throws Exception {
        connection.rollback();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }

}
