//package com.example.SpringBootTutorial.siteUser;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping(path= "api/v1/siteuser")
//public class SiteUserController {
//    private final SiteUserService siteUserService;
//
//    @Autowired
//    public SiteUserController(SiteUserService siteUserService) {
//        this.siteUserService = siteUserService;
//    }
//
//    @GetMapping
//    public SiteUser getSiteUsers(){
//        return siteUserService.getSiteUsers;
//    }
//
//    @PostMapping
//    public void registerNewSiteUser(){
//        siteUserService.addNewSiteUser;
//    }
//
//    @DeleteMapping(path="rm/{siteUserId}")
//    public void deleteSiteUser(){
//        siteUserService.deleteSiteUser(@PathVariable("siteUserId") Long siteUserId) { siteUserService.deleteSiteUser(siteUserId);
//        }
//    }
//}
