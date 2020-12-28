package controller;

import model.entity.SiteUsersEntity;
import model.service.SiteUsersService;
import view.MainSite;
import view.SiteUsersLogin;
import view.SiteUsersSignUp;

import javax.swing.*;
import java.util.List;

public class SiteUsersController {
    private static SiteUsersController siteUsersController = new SiteUsersController();

    public static SiteUsersController getInstance() {
        return siteUsersController;
    }

    private SiteUsersController() {

    }

    public void insert(String name, String username, String password, String email) {
        try {
            SiteUsersService.getInstance().save(new SiteUsersEntity().setName(name).setUsername(username).setPassword(password).setEmail(email));
            SiteUsersSignUp.jFrame.dispose();
            JOptionPane.showMessageDialog(null, "Sign Up successfully");
            new MainSite();
        } catch (Exception e) {
            System.out.println("Fail to save!" + e.getMessage());
        }
    }


    public void select(String username, String password) throws Exception {
        if(username.equals("") || password.equals(""))
            throw new Exception("Username and Password cannot be empty");
        boolean check = false;
        List<SiteUsersEntity> siteUsersEntityList = SiteUsersService.getInstance().report();
        for(SiteUsersEntity siteUsersEntity : siteUsersEntityList)
            if (username.equals(siteUsersEntity.getUsername()) && password.equals(siteUsersEntity.getPassword())) {
                check = true;
                new MainSite();
                SiteUsersLogin.jFrame.dispose();
                JOptionPane.showMessageDialog(null, "Login successfully");

            }
        if(!check)
            throw new Exception("Invalid username or password");
    }
}
