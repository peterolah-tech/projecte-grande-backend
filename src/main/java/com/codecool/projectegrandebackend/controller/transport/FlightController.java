package com.codecool.projectegrandebackend.controller.transport;

import com.codecool.projectegrandebackend.model.Transportation;
import com.codecool.projectegrandebackend.model.generated.transport.flight.FlightTransport;
import com.codecool.projectegrandebackend.model.generated.transport.flight.flightPostInput_generated.FlightPostInput;
import com.codecool.projectegrandebackend.repository.AirportRepository;
import com.codecool.projectegrandebackend.repository.TransportationRepository;
import com.codecool.projectegrandebackend.service.transport.FlightService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("api/v1")
@RestController
public class FlightController {

    @Autowired
    private FlightService flightService;

    @Autowired
    private TransportationRepository transportationRepository;

    @PostMapping(
            value="/airports",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String sendAirports() throws IOException {
        return flightService.sendAirports();
    }

    @PostMapping(
            value = "/flight-transport",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getFlightTransport(@RequestBody FlightPostInput inputData) {
        Gson g = new Gson();
        String jsonString = g.toJson(inputData);
        String remoteCarbonInKg = flightService.getFlightData(jsonString).getEquivalentCarbonInKg();

        Transportation transportation = Transportation.builder()
                .dateOfTravel(LocalDate.now())
                .airportFrom(inputData.getAirports().get(0))
                .airportThrough(inputData.getAirports().get(1))
                .airportTo(inputData.getAirports().get(2))
                .flightCarbonInKg(Float.parseFloat(remoteCarbonInKg))
                .build();
        transportationRepository.save(transportation);
        return remoteCarbonInKg;
    }
}
