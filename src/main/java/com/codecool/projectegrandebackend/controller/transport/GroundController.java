package com.codecool.projectegrandebackend.controller.transport;

import com.codecool.projectegrandebackend.model.generated.transport.vehicle.consumePostDataGenerated.GroundPostInput;
import com.codecool.projectegrandebackend.service.transport.GroundService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1")
@RestController
public class GroundController {

    @Autowired
    private GroundService groundService;

    @PostMapping(
            value = "/ground-transport",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getGroundTransport(@RequestBody GroundPostInput inputData) {
        Gson g = new Gson();
        String jsonString = g.toJson(inputData);
        return groundService.getGroundData(jsonString).getEquivalentCarbonInKg();
    }
    
}
