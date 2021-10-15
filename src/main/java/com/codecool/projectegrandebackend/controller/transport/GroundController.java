package com.codecool.projectegrandebackend.controller.transport;

import com.codecool.projectegrandebackend.model.Transportation;
import com.codecool.projectegrandebackend.model.generated.transport.FuelType;
import com.codecool.projectegrandebackend.model.generated.transport.vehicle.consumePostDataGenerated.GroundPostInput;
import com.codecool.projectegrandebackend.repository.TransportationRepository;
import com.codecool.projectegrandebackend.service.transport.GroundService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RequestMapping("api/v1")
@RestController
public class GroundController {

    private GroundService groundService;
    private TransportationRepository transportationRepository;

    @Autowired
    public GroundController(GroundService groundService, TransportationRepository transportationRepository) {
        this.groundService = groundService;
        this.transportationRepository = transportationRepository;
    }

//    @GetMapping("/ground-transport")
//    public String getGroundTransportForHtml() {
//        String toJsonString ="{distance:{value:55,units:km},fuel_efficiency:{value:25,units:mpg,of:gasoline}}";
//        Gson gson = new Gson();
//        String sampleInputData = gson.toJson(toJsonString);
//        String sampleCarbonData = groundService.getGroundData(sampleInputData).getEquivalentCarbonInKg();
//        return sampleCarbonData;
//    }

    @PostMapping(
            value = "/ground-transport",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String postCarbonGroundRemote(@RequestBody GroundPostInput inputData) {
        Gson g = new Gson();
        String jsonString = g.toJson(inputData);
        String remoteCarbonInKg = groundService.getGroundData(jsonString).getEquivalentCarbonInKg();
        String fuelType = inputData.getFuelEfficiency().getOf();
        Transportation transportation = Transportation.builder()
                .vehicleCarbonInKg(Float.parseFloat(remoteCarbonInKg))
                .fuelEfficiency(inputData.getFuelEfficiency().getValue())
                .fuelType(fuelType == "diesel" ? FuelType.DIESEL : FuelType.GASOLINE)
                .distance(inputData.getDistance().getValue())
                .dateOfTravel(LocalDate.now())
                .build();
        transportationRepository.save(transportation);
        return remoteCarbonInKg;
    }
    
}
