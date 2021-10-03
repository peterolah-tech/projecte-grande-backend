package com.codecool.projectegrandebackend.controller.transport;

import com.codecool.projectegrandebackend.model.Transportation;
import com.codecool.projectegrandebackend.model.generated.transport.GroundTransport;
import com.codecool.projectegrandebackend.model.generated.transport.consumePostDataGenerated.GroundPostInput;
import com.codecool.projectegrandebackend.repository.TransportationRepository;
import com.codecool.projectegrandebackend.service.transport.GroundService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
        Transportation transportation = Transportation.builder()
                .vehicleCarbonInKg(Float.parseFloat(remoteCarbonInKg))
                .flightCarbonInKg(0)
                .dateOfTravel(LocalDate.of(2021,10,11))
                .build();
        transportationRepository.save(transportation);
        return remoteCarbonInKg;
    }
    
}
