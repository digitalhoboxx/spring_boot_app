package com.example.SpringBootTutorial.worldtime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path="api/v1/worldtime")
public class WorldTimeController {

    @RequestMapping
    public String getWorldTime() {
        String uri = "";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }
}
