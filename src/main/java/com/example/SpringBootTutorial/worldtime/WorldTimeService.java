package com.example.SpringBootTutorial.worldtime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorldTimeService {

    private final WorldTimeRepository worldTimeRepository;

    @Autowired
    public WorldTimeService(WorldTimeRepository worldTimeRepository) {
        this.worldTimeRepository = worldTimeRepository;
    }

    public WorldTime getNewWorldTime() {
        return WorldTime;
    }

    public List<WorldTime> getSavedWorldTimes() {
        return worldTimeRepository.findAll();
    }

    public void saveWorldTime(WorldTime worldTime) {
        worldTimeRepository.save(worldTime);
    }

}
