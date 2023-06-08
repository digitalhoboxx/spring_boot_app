package com.example.SpringBootTutorial.worldtime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorldTimeConfig {

    @Bean
    CommandLineRunner worldTimeCommandLineRunner(WorldTimeRepository repository) {
        return args -> {

        };
    }
}
