package com.codecool.projectegrandebackend.service.transport;

import com.codecool.projectegrandebackend.model.Airport;
import com.codecool.projectegrandebackend.model.generated.transport.flight.FlightTransport;
import com.codecool.projectegrandebackend.repository.AirportRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.nio.file.Files;
import java.util.List;


@Service
@RestController
public class FlightService {

    @Value("${REACT_APP_API_KEY_CLOVERLY}")
    private String API_KEY_CLOVERLY;
    @Value("${Flight_Transport_URL}")
    private String url;
    @Autowired
    private AirportRepository airportRepository;

    public String sendAirports() throws IOException {
        List<Airport> foundAirports = airportRepository.findAll();
        Gson gson = new Gson();
        return gson.toJson(foundAirports);
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
