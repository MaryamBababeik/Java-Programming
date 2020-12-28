package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSite {
    private JFrame jFrame;

    public MainSite() {
        jFrame = new JFrame("Users Service");
        jFrame.setSize(400, 400);
        jFrame.getContentPane().setBackground(Color.WHITE);
        Font font = new Font("TimesRoman", Font.ITALIC, 28);
        JButton btnLogin = new JButton("Login Users");
        btnLogin.setBackground(Color.WHITE);
        btnLogin.setFont(font);
        btnLogin.setVisible(true);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                SiteUsersLogin siteUsersLogin = new SiteUsersLogin();
                siteUsersLogin.login();
            }
        });
        JButton btnSignUp = new JButton("Sign Up Users");
        btnSignUp.setBackground(Color.WHITE);
        btnSignUp.setFont(font);
        btnSignUp.setVisible(true);
        btnSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                SiteUsersSignUp siteUsersSignUp = new SiteUsersSignUp();
                siteUsersSignUp.signUp();
            }
        });
        JButton btnExit = new JButton("Exit");
        btnExit.setBackground(Color.WHITE);
        btnExit.setFont(font);
        btnExit.setVisible(true);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
            }
        });
        jFrame.add(btnLogin);
        jFrame.add(btnSignUp);
        jFrame.add(btnExit);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new GridLayout(3, 0));
        jFrame.setVisible(true);
    }
}
