package model.service;

import model.entity.InternetPackagesEntity;
import model.repository.InternetPackagesRepository;

import java.util.List;

public class InternetPackagesService {
    private static InternetPackagesService internetPackagesService = new InternetPackagesService();

    public static InternetPackagesService getInstance() {
        return internetPackagesService;
    }

    private InternetPackagesService() {

    }

    public void save(InternetPackagesEntity internetPackagesEntity) throws Exception {
        try (InternetPackagesRepository internetPackagesRepository = new InternetPackagesRepository()) {
            internetPackagesRepository.insert(internetPackagesEntity);
            internetPackagesRepository.commit();
        }
    }

    public void edit(InternetPackagesEntity internetPackagesEntity) throws Exception {
        try (InternetPackagesRepository internetPackagesRepository = new InternetPackagesRepository()) {
            List<InternetPackagesEntity> internetPackagesEntityList = InternetPackagesService.getInstance().report();
            for (InternetPackagesEntity internetPackagesEntity1 : internetPackagesEntityList) {
                if (internetPackagesEntity.getPackage1() == internetPackagesEntity1.getInternetPackage()) {
                    internetPackagesEntity.setInternetPackage(internetPackagesEntity1.getInternetPackage() - internetPackagesEntity.getInternetPackage());
                    break;
                }
                if (internetPackagesEntity.getPackage2() == internetPackagesEntity1.getInternetPackage()) {
                    internetPackagesEntity.setInternetPackage(internetPackagesEntity1.getInternetPackage() - internetPackagesEntity.getInternetPackage());
                    break;
                }
                if (internetPackagesEntity.getPackage3() == internetPackagesEntity1.getInternetPackage()) {
                    internetPackagesEntity.setInternetPackage(internetPackagesEntity1.getInternetPackage() - internetPackagesEntity.getInternetPackage());
                    break;
                }
                if (internetPackagesEntity.getPackage4() == internetPackagesEntity1.getInternetPackage()) {
                    internetPackagesEntity.setInternetPackage(internetPackagesEntity1.getInternetPackage() - internetPackagesEntity.getInternetPackage());
                    break;
                }
                internetPackagesRepository.update(internetPackagesEntity);
                internetPackagesRepository.commit();
            }

            public List<InternetPackagesEntity> report () throws Exception {
                List<InternetPackagesEntity> internetPackagesEntities;
                try (InternetPackagesRepository internetPackagesRepository = new InternetPackagesRepository()) {
                    internetPackagesEntities = internetPackagesRepository.select();
                }
                return internetPackagesEntities;
            }
        }
    }