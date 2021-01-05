package view;

import controller.EmploymentController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Employment {
    public static JFrame jFrame;

    public Employment(){
        jFrame = new JFrame("Employment Form");
        jFrame.setBounds(470,200,450,400);
        jFrame.getContentPane().setBackground(Color.WHITE);
        Font font = new Font("TimesRoman", Font.PLAIN, 18);
        JLabel lblText = new JLabel("Please enter the requested information");
        lblText.setBounds(40,10,400,30);
        lblText.setFont(font);
        lblText.setVisible(true);

        JLabel lblFullName = new JLabel("Full Name:");
        lblFullName.setBounds(15, 60, 150, 30);
        lblFullName.setFont(font);
        lblFullName.setVisible(true);
        JTextField txtFullName = new JTextField();
        txtFullName.setBounds(150, 65, 220, 25);
        txtFullName.setVisible(true);

        JLabel lblNationalId = new JLabel("National Id:");
        lblNationalId.setBounds(15, 90, 150, 30);
        lblNationalId.setFont(font);
        lblNationalId.setVisible(true);
        JTextField txtNationalId = new JTextField();
        txtNationalId.setBounds(150, 95, 220, 25);
        txtNationalId.setVisible(true);

        JLabel lblPhoneNumber = new JLabel("Phone Number:");
        lblPhoneNumber.setBounds(15, 120, 150, 30);
        lblPhoneNumber.setFont(font);
        lblPhoneNumber.setVisible(true);
        JTextField txtPhoneNumber = new JTextField();
        txtPhoneNumber.setBounds(150, 125, 220, 25);
        txtPhoneNumber.setVisible(true);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(15, 150, 150, 30);
        lblEmail.setFont(font);
        lblEmail.setVisible(true);
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(150, 155, 220, 25);
        txtEmail.setVisible(true);

        JLabel lblEducation = new JLabel("Education:");
        lblEducation.setBounds(15, 180, 150, 30);
        lblEducation.setFont(font);
        lblEducation.setVisible(true);
        JTextField txtEducation = new JTextField();
        txtEducation.setBounds(150, 188, 220, 25);
        txtEducation.setVisible(true);

        JLabel lblWorkExperience = new JLabel("Work Experience:");
        lblWorkExperience.setBounds(15, 220, 150, 30);
        lblWorkExperience.setFont(font);
        lblWorkExperience.setVisible(true);
        SpinnerModel workExperience = new SpinnerNumberModel(0, 0, 20, 1);
        JSpinner spinnerWorkExperience = new JSpinner(workExperience);
        spinnerWorkExperience.setBounds(230, 223, 50, 25);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(180, 300, 100, 40);
        btnSave.setBackground(Color.DARK_GRAY);
        btnSave.setForeground(Color.WHITE);
        btnSave.setFont(font);
        btnSave.setVisible(true);
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    EmploymentController.getInstance().insert(txtFullName.getText(), txtNationalId.getText(), txtPhoneNumber.getText(), txtEmail.getText(), txtEducation.getText(), Integer.parseInt(spinnerWorkExperience.getValue().toString()));
                } catch(Exception e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
        });


        jFrame.add(lblText);
        jFrame.add(lblFullName);
        jFrame.add(txtFullName);
        jFrame.add(lblNationalId);
        jFrame.add(txtNationalId);
        jFrame.add(lblPhoneNumber);
        jFrame.add(txtPhoneNumber);
        jFrame.add(lblEmail);
        jFrame.add(txtEmail);
        jFrame.add(lblEducation);
        jFrame.add(txtEducation);
        jFrame.add(lblWorkExperience);
        jFrame.add(spinnerWorkExperience);
        jFrame.add(btnSave);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
