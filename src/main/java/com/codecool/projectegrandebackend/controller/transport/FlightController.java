package com.codecool.projectegrandebackend.controller.transport;

import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.model.FlightTransportation;
import com.codecool.projectegrandebackend.model.generated.transport.flight.flightPostInput_generated.FlightPostInput;
import com.codecool.projectegrandebackend.repository.FlightTransportationRepository;
import com.codecool.projectegrandebackend.repository.UserRepository;
import com.codecool.projectegrandebackend.service.transport.FlightService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@RequestMapping("api/v1")
@RestController
public class FlightController {

    private FlightService flightService;
    private FlightTransportationRepository flightTransportationRepository;
    private UserRepository userRepository;

    @Autowired
    public FlightController(FlightService flightService, FlightTransportationRepository flightTransportationRepository, UserRepository userRepository) {
        this.flightService = flightService;
        this.flightTransportationRepository = flightTransportationRepository;
        this.userRepository = userRepository;
    }

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
    public String getFlightTransport(@RequestBody FlightPostInput inputData, Authentication authentication) {
        Gson g = new Gson();
        String jsonString = g.toJson(inputData);
        String remoteCarbonInKg = flightService.getFlightData(jsonString).getEquivalentCarbonInKg();
//        flightTransportationRepository.save(flightTransportation);
        return remoteCarbonInKg;
    }

    @PostMapping(
            value = "/flight-transport/persist",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String saveFlightTransportToDB(@RequestBody FlightPostInput inputData, Authentication authentication) {
        Gson g = new Gson();
        String jsonString = g.toJson(inputData);
        String remoteCarbonInKg = flightService.getFlightData(jsonString).getEquivalentCarbonInKg();

        FlightTransportation flightTransportation = FlightTransportation.builder()
                .dateOfTravel(inputData.getDateOfTravel())
                .airportFrom(inputData.getAirports().get(0))
                .airportThrough(inputData.getAirports().get(1))
                .airportTo(inputData.getAirports().get(2))
                .equivalentCarbonInKg(Float.parseFloat(remoteCarbonInKg))
                .build();

        AppUser appUser = (AppUser) authentication.getPrincipal();
        appUser.addJourney(flightTransportation);
        userRepository.save(appUser);

        return remoteCarbonInKg;
    }
}
