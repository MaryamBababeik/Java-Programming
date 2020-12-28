package view;

import controller.SiteUsersController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SiteUsersLogin {
    public static JFrame jFrame;

    public void login() {
        jFrame = new JFrame("Users Login");
        jFrame.setSize(350, 400);
        jFrame.getContentPane().setBackground(Color.WHITE);
        Font font = new Font("TimesRoman", Font.PLAIN, 18);
        JLabel lblTxt = new JLabel("Users Login");
        lblTxt.setBounds(100, 10, 300, 50);
        lblTxt.setFont(font);
        lblTxt.setVisible(true);
        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(15, 80, 120, 30);
        lblUsername.setFont(font);
        lblUsername.setVisible(true);
        JTextField txtUsername = new JTextField();
        txtUsername.setBounds(120, 85, 200, 25);
        txtUsername.setVisible(true);
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(15, 160, 120, 30);
        lblPassword.setFont(font);
        lblPassword.setVisible(true);
        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(120, 165, 200, 25);
        txtPassword.setVisible(true);


        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(130, 250, 100, 40);
        btnLogin.setBackground(Color.DARK_GRAY);
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFont(font);
        btnLogin.setVisible(true);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SiteUsersController.getInstance().select(txtUsername.getText(), txtPassword.getText());
                } catch(Exception e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        jFrame.add(lblTxt);
        jFrame.add(lblUsername);
        jFrame.add(txtUsername);
        jFrame.add(lblPassword);
        jFrame.add(txtPassword);
        jFrame.add(btnLogin);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

}
