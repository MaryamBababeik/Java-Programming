package model.service;

import model.entity.SiteUsersEntity;
import model.repository.SiteUsersRepository;

import java.util.List;

public class SiteUsersService {
    private static SiteUsersService siteUsersService = new SiteUsersService();

    public static SiteUsersService getInstance() {
        return siteUsersService;
    }

    private SiteUsersService() {

    }

    public void save(SiteUsersEntity siteUsersEntity) throws Exception {
        try (SiteUsersRepository siteUsersRepository = new SiteUsersRepository()) {
            siteUsersRepository.insert(siteUsersEntity);
            siteUsersRepository.commit();
        }
    }

    public List<SiteUsersEntity> report() throws Exception {
        List<SiteUsersEntity> siteUsersEntities;
        try(SiteUsersRepository siteUsersRepository = new SiteUsersRepository()) {
            siteUsersEntities = siteUsersRepository.select();
        }
        return siteUsersEntities;
    }
}
