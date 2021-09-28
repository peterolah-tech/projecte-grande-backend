package com.codecool.projectegrandebackend.controller;

import com.codecool.projectegrandebackend.model.FLGHT_generated.flightPostInput_generated.FlightPostInput;
import com.codecool.projectegrandebackend.service.FlightService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.IOException;

@RequestMapping("api/v1")
@RestController
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping(
            value="/airports",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getAirports() throws IOException {
        return flightService.getAirports();
    }

    @PostMapping(
            value = "/flight-transport",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getFlightTransport(@RequestBody FlightPostInput inputData) {
        Gson g = new Gson();
        String jsonString = g.toJson(inputData);
        return flightService.getFlightData(jsonString).getEquivalentCarbonInKg();
    }
}
