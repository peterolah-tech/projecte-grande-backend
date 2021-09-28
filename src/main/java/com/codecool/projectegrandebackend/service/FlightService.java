package com.codecool.projectegrandebackend.service;

import com.codecool.projectegrandebackend.model.FLGHT_generated.FlightTransport;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.*;
import java.nio.file.Files;


@Service
@RestController
public class FlightService {

    @Value("${REACT_APP_API_KEY_CLOVERLY}")
    private String API_KEY_CLOVERLY;
    @Value("${Flight_Transport_URL}")
    private String url;

    public String getAirports() throws IOException {
        File resource = new ClassPathResource("airports.json").getFile();
        String text = new String(Files.readAllBytes(resource.toPath()));
        text = text.replaceAll("\r","").replaceAll("\n","")
                .replaceAll("\\\\","");
        //text = text.substring(1,text.length());
        Gson myGson = new Gson();
        String jsonString = myGson.toJson(text);
        return jsonString;
    }

    public FlightTransport getFlightData(String jsonString){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(jsonString, headers);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization",  API_KEY_CLOVERLY);
        ResponseEntity<FlightTransport> flightResponseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, FlightTransport.class);
        return flightResponseEntity.getBody();
    }

}
