package model.repository;

import model.entity.InternetPackagesEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class InternetPackagesRepository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public InternetPackagesRepository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "maryambababeik", "java1234");
        connection.setAutoCommit(false);
    }

    public void insert(InternetPackagesEntity internetPackagesEntity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into UsersInfo(name,username,password,email,internetPackage) values (?,?,?,?)");
        preparedStatement.setString(1, internetPackagesEntity.getName());
        preparedStatement.setString(2, internetPackagesEntity.getUsername());
        preparedStatement.setString(3, internetPackagesEntity.getPassword());
        preparedStatement.setString(4, internetPackagesEntity.getEmail());
        preparedStatement.setString(5,internetPackagesEntity.getInternetPackage());
        preparedStatement.executeUpdate();
    }

    public List<InternetPackagesEntity> select() throws Exception {
        preparedStatement = connection.prepareStatement("select * from UsersInfo");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<InternetPackagesEntity> internetPackagesEntityList = new ArrayList<>();
        while(resultSet.next()) {
            InternetPackagesEntity internetPackagesEntity = new InternetPackagesEntity();
            internetPackagesEntity.setName(resultSet.getString("Name"));
            internetPackagesEntity.setUsername(resultSet.getString("Username")) ;
            internetPackagesEntity.setPassword(resultSet.getString("Password"));
            internetPackagesEntity.setEmail(resultSet.getString("Email"));
            internetPackagesEntity.setInternetPackage(resultSet.getString("InternetPackage"));
            internetPackagesEntityList.add(internetPackagesEntity);
        }
        return internetPackagesEntityList;
    }

    public void update(InternetPackagesEntity internetPackagesEntity)throws Exception{
        PreparedStatement preparedStatement=connection.prepareStatement("update UsersInfo set internetPackage where username=? and pass=?");
        preparedStatement.setString(1,internetPackagesEntity.getName());
        preparedStatement.executeUpdate();
        System.out.println("saved");
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
