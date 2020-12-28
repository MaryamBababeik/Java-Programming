package view;

import controller.SiteUsersController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SiteUsersSignUp {
    public static JFrame jFrame;

    public void signUp() {
        jFrame = new JFrame("Users Sign Up");
        jFrame.setSize(400, 400);
        jFrame.getContentPane().setBackground(Color.WHITE);
        Font font = new Font("TimesRoman", Font.PLAIN, 18);
        JLabel lbltext = new JLabel("Please enter your informations");
        lbltext.setBounds(100,15,300,30);
        lbltext.setFont(font);
        lbltext.setVisible(true);
        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(15, 50, 150, 30);
        lblName.setFont(font);
        lblName.setVisible(true);
        JTextField txtName = new JTextField();
        txtName.setBounds(150, 55, 200, 25);
        txtName.setVisible(true);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(15, 100, 150, 30);
        lblUsername.setFont(font);
        lblUsername.setVisible(true);
        JTextField txtUsername = new JTextField();
        txtUsername.setBounds(150, 105, 200, 25);
        txtUsername.setVisible(true);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(15, 150, 150, 30);
        lblPassword.setFont(font);
        lblPassword.setVisible(true);
        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 155, 200, 25);
        txtPassword.setVisible(true);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(15, 200, 150, 30);
        lblEmail.setFont(font);
        lblEmail.setVisible(true);
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(150, 205, 200, 25);
        txtEmail.setVisible(true);

        JButton btnSignUp = new JButton("Sign Up");
        btnSignUp.setBounds(160, 290, 100, 40);
        btnSignUp.setBackground(Color.DARK_GRAY);
        btnSignUp.setForeground(Color.WHITE);
        btnSignUp.setFont(font);
        btnSignUp.setVisible(true);
        btnSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SiteUsersController.getInstance().insert(txtName.getText(), txtUsername.getText(), txtPassword.getText(), txtEmail.getText());
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        jFrame.add(lbltext);
        jFrame.add(lblName);
        jFrame.add(txtName);
        jFrame.add(lblUsername);
        jFrame.add(txtUsername);
        jFrame.add(lblPassword);
        jFrame.add(txtPassword);
        jFrame.add(lblEmail);
        jFrame.add(txtEmail);
        jFrame.add(btnSignUp);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}