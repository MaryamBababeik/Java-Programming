package model.entity;

public class EmploymentEntity {
    private String fullName;
    private String nationalId;
    private String phoneNumber;
    private String email;
    private String education;
    private int workExperience;

    public String getFullName() {
        return fullName;
    }

    public EmploymentEntity setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getNationalId() {
        return nationalId;
    }

    public EmploymentEntity setNationalId(String nationalId) {
        this.nationalId = nationalId;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public EmploymentEntity setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public EmploymentEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEducation() {
        return education;
    }

    public EmploymentEntity setEducation(String education) {
        this.education = education;
        return this;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public EmploymentEntity setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
        return this;
    }
}
