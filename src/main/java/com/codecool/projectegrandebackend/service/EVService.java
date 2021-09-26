package com.codecool.projectegrandebackend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;


@RestController
public class EVService {

    @Value("${REACT_APP_OPENCHARGERMAP}")
    private String REACT_APP_OPENCHARGERMAP;
    private String url = "https://api.openchargemap.io/v3/poi/?output=json&countrycode=HU&maxresults=100";


    public ArrayList getEVData(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("X-API-Key",  REACT_APP_OPENCHARGERMAP);
        ResponseEntity<ArrayList> evResponseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, ArrayList.class);

        return  evResponseEntity.getBody();
    }


}