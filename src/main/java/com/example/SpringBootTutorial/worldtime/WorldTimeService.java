package com.example.SpringBootTutorial.worldtime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class WorldTimeService {

    private final WorldTimeRepository worldTimeRepository;

    @Autowired
    public WorldTimeService(WorldTimeRepository worldTimeRepository) {
        this.worldTimeRepository = worldTimeRepository;
    }

    public static String getWorldTime(String zone, String city) {
        String uri = "http://worldtimeapi.org/api/timezone/" + zone + "/" + city;

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        httpHeaders.set(zone, city);

        HttpEntity request = new HttpEntity(httpHeaders);

        ResponseEntity<String> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                request,
                String.class,
                0
        );

        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("Request Successful.");
            return response.getBody();
        } else {
            System.out.println("Request Failed");
            return response.getStatusCode().toString();
        }
    }
}
