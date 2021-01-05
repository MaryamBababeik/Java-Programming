package controller;

import model.entity.EmploymentEntity;
import model.service.EmploymentService;
import view.Employment;

import javax.swing.*;

public class EmploymentController {
    private static EmploymentController employmentController = new EmploymentController();

    public static EmploymentController getInstance() {
        return employmentController;
    }

    private EmploymentController() {

    }

    public void insert(String fullName, String nationalId, String phoneNumber, String email, String education, int workExperience) throws Exception {
        if (fullName.equals("") || nationalId.equals("") || phoneNumber.equals("") || email.equals("") || education.equals("") ){
            System.out.println("Informations cannot be empty");
        }
        try {
            EmploymentService.getInstance().save(new EmploymentEntity().setFullName(fullName).setNationalId(nationalId).setPhoneNumber(phoneNumber).setEmail(email).setEducation(education).setWorkExperience(workExperience));
            Employment.jFrame.dispose();
            JOptionPane.showMessageDialog(null, "Done");
        } catch (Exception e) {
            System.out.println("Fail to save!" + e.getMessage());
        }

    }
}