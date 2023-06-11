package com.example.SpringBootTutorial.siteUser;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteUserService {
    private final SiteUserRepository siteUserRepository;

    public SiteUserService(SiteUserRepository siteUserRepository) {
        this.siteUserRepository = siteUserRepository;
    }

    public List<SiteUser> getSiteUsers() {
        return siteUserRepository.findAll();
    }
}
