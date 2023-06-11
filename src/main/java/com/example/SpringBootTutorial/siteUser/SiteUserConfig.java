package com.example.SpringBootTutorial.siteUser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SiteUserConfig {
    @Bean
    CommandLineRunner siteUserCLR(SiteUserRepository repository) {
        return args -> {
            SiteUser nuckChorris = new SiteUser(
                    "nuckChorris",
                    "superhidden"
            );
            repository.saveAll(
                    List.of(nuckChorris)
            );

        };
    }
}
