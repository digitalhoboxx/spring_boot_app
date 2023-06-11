package com.example.SpringBootTutorial.siteUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/siteuser")
public class SiteUserController {
    private final SiteUserService siteUserService;

    @Autowired
    public SiteUserController(SiteUserService siteUserService) {
        this.siteUserService = siteUserService;
    }

    @GetMapping(path= "getall")
    public List<SiteUser> getSiteUsers(){
        return siteUserService.getSiteUsers();
    }
}
