package com.example.SpringBootTutorial.siteUser;

import jakarta.persistence.*;

@Entity
@Table
public class SiteUser {
    @Id
    @SequenceGenerator(
            name = "siteUser_sequence",
            sequenceName =  "siteUser_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "siteUser_sequence"
    )
    private Long siteUserId;
    protected String username;
    protected String password;

    public SiteUser() {
    }

    public SiteUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public SiteUser(Long siteUserId, String username, String password) {
        this.siteUserId = siteUserId;
        this.username = username;
        this.password = password;
    }

    public Long getSiteUserId() {
        return siteUserId;
    }

    public void setSiteUserId(Long siteUserId) {
        this.siteUserId = siteUserId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SiteUser{" +
                "id=" + siteUserId +
                ", username='" + username + '\'' +
                '}';
    }
}
