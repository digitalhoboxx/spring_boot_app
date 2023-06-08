package com.example.SpringBootTutorial.worldtime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface WorldTimeRepository
        extends JpaRepository<WorldTime, Long> {
    @Query("SELECT s FROM WorldTime s WHERE s.client_ip = ?1")
    Optional<WorldTime> findWorldTimeByIp(String client_ip);
}
