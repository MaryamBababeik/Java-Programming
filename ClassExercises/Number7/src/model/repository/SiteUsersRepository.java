package model.repository;

import model.entity.SiteUsersEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SiteUsersRepository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public SiteUsersRepository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "maryambababeik", "java1234");
        connection.setAutoCommit(false);
    }

     public void insert(SiteUsersEntity siteUsersEntity) throws Exception {
         preparedStatement = connection.prepareStatement("insert into UsersInformation(name,username,password,email) values (?,?,?,?)");
         preparedStatement.setString(1, siteUsersEntity.getName());
         preparedStatement.setString(2, siteUsersEntity.getUsername());
         preparedStatement.setString(3, siteUsersEntity.getPassword());
         preparedStatement.setString(4, siteUsersEntity.getEmail());
         preparedStatement.executeUpdate();
     }

         public List<SiteUsersEntity> select() throws Exception {
             preparedStatement = connection.prepareStatement("select * from UsersInformation");
             ResultSet resultSet = preparedStatement.executeQuery();
             List<SiteUsersEntity> siteUsersEntityList = new ArrayList<>();
             while(resultSet.next()) {
                 SiteUsersEntity siteUsersEntity1 = new SiteUsersEntity();
                 siteUsersEntity1.setName(resultSet.getString("Name"));
                 siteUsersEntity1.setUsername(resultSet.getString("Username")) ;
                 siteUsersEntity1.setPassword(resultSet.getString("Password"));
                 siteUsersEntity1.setEmail(resultSet.getString("Email"));
                 siteUsersEntityList.add(siteUsersEntity1);
             }
             return siteUsersEntityList;
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


