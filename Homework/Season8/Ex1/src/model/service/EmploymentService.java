package model.service;

import model.entity.EmploymentEntity;
import model.repository.EmploymentRepository;


public class EmploymentService {
    private static EmploymentService employmentService = new EmploymentService();

    public static EmploymentService getInstance() {
        return employmentService;
    }

    private EmploymentService() {

    }

    public void save(EmploymentEntity employmentEntity) throws Exception {
        try (EmploymentRepository employmentRepository = new EmploymentRepository()) {
            employmentRepository.insert(employmentEntity);
            employmentRepository.commit();
        }
    }

}
