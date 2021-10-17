package com.codecool.projectegrandebackend.controller.transport;

import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.model.GroundTransportation;
import com.codecool.projectegrandebackend.model.generated.transport.vehicle.FuelType;
import com.codecool.projectegrandebackend.model.generated.transport.vehicle.consumePostDataGenerated.GroundPostInput;
import com.codecool.projectegrandebackend.repository.GroundTransportationRepository;
import com.codecool.projectegrandebackend.repository.UserRepository;
import com.codecool.projectegrandebackend.service.transport.GroundService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1")
@RestController
public class GroundController {

    private GroundService groundService;
    private GroundTransportationRepository groundTransportationRepository;
    private UserRepository userRepository;

    @Autowired
    public GroundController(GroundService groundService, GroundTransportationRepository groundTransportationRepository, UserRepository userRepository) {
        this.groundService = groundService;
        this.groundTransportationRepository = groundTransportationRepository;
        this.userRepository = userRepository;
    }


    @PostMapping(
            value = "/ground-transport",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String postCarbonGroundRemote(@RequestBody GroundPostInput inputData, Authentication authentication) {
        Gson g = new Gson();
        String jsonString = g.toJson(inputData);
        String remoteCarbonInKg = groundService.getGroundData(jsonString).getEquivalentCarbonInKg();
//        groundTransportationRepository.save(groundTransportation);
        return remoteCarbonInKg;
    }


    @PostMapping(
            value = "/ground-transport/persist",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public void saveCarbonGroundtoDB(@RequestBody GroundPostInput inputData, Authentication authentication) {
        Gson g = new Gson();
        String jsonString = g.toJson(inputData);
        String remoteCarbonInKg = groundService.getGroundData(jsonString).getEquivalentCarbonInKg();
        String fuelType = inputData.getFuelEfficiency().getOf();
        GroundTransportation groundTransportation = GroundTransportation.builder()
                .equivalentCarbonInKg(Float.parseFloat(remoteCarbonInKg))
                .fuelEfficiency(inputData.getFuelEfficiency().getValue())
                .fuelType(fuelType == "diesel" ? FuelType.DIESEL : FuelType.GASOLINE)
                .distance(inputData.getDistance().getValue())
                .dateOfTravel(inputData.getDateOfTravel())
                .build();

        AppUser appUser = (AppUser) authentication.getPrincipal();
        appUser.addJourney(groundTransportation);
        userRepository.save(appUser);
    }
    
}
