package com.codecool.projectegrandebackend.controller;

import com.codecool.projectegrandebackend.model.EV;
import com.codecool.projectegrandebackend.model.ResponseObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
public class EVController {

    @Value("${REACT_APP_OPENCHARGERMAP}")
    private String REACT_APP_OPENCHARGERMAP;
    private String url = "https://api.openchargemap.io/v3/poi/?output=json&countrycode=HU&maxresults=10";


    public void getDataWithApiKey(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("X-API-Key",  REACT_APP_OPENCHARGERMAP);
        ResponseEntity<ResponseObject> response = restTemplate.exchange(url, HttpMethod.GET, entity, ResponseObject.class);

        System.out.println(response);
//        return response;
    }

    @GetMapping("/ev")
    public ResponseEntity<EV> getEV(){
        getDataWithApiKey();
        return new ResponseEntity<>(new EV(), HttpStatus.OK);
    }
}