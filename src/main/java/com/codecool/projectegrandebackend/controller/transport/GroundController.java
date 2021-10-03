package com.codecool.projectegrandebackend.controller.transport;

import com.codecool.projectegrandebackend.model.generated.transport.consumePostDataGenerated.GroundPostInput;
import com.codecool.projectegrandebackend.service.transport.GroundService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1")
@RestController
public class GroundController {

    @Autowired
    private GroundService groundService;

    @GetMapping("/ground-transport")
    public String getGroundTransportForHtml() {
        String toJsonString ="{distance:{value:55,units:km},fuel_efficiency:{value:25,units:mpg,of:gasoline}}";
        Gson gson = new Gson();
        String sampleInputData = gson.toJson(toJsonString);
        String sampleCarbonData = groundService.getGroundData(sampleInputData).getEquivalentCarbonInKg();
        return sampleCarbonData;
    }

    @PostMapping(
            value = "/ground-transport",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String postCarbonGroundRemote(@RequestBody GroundPostInput inputData) {
        Gson g = new Gson();
        String jsonString = g.toJson(inputData);
        return groundService.getGroundData(jsonString).getEquivalentCarbonInKg();
    }
    
}
