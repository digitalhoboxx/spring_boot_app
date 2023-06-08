package com.example.SpringBootTutorial.worldtime;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@RestController
@RequestMapping("api/v1/worldtime")
public class WorldTimeController {
    private final RestTemplate restTemplate;
    public WorldTimeController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("{zone}/{city}")
    public String getWorldTime(@PathVariable("zone") String zone, @PathVariable("city") String city) {
        return WorldTimeService.getWorldTime(zone, city);
    }

    @PostMapping
    public void postWorldTime(String worldTime){
        WorldTimeService.postWorldTime(worldTime);
    }

}
