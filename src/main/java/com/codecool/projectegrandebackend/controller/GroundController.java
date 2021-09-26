package com.codecool.projectegrandebackend.controller;

import com.codecool.projectegrandebackend.model.ground_trsport_generated.GroundTransport;
import com.codecool.projectegrandebackend.model.ground_trsport_generated.consumePostDataGenerated.GroundPostInput;
import com.codecool.projectegrandebackend.service.GroundService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@RestController
public class GroundController {

    @Autowired
    private GroundService groundService;

    @PostMapping(
            value = "/ground-transport",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public GroundTransport getGroundTransport(@RequestBody GroundPostInput inputData) {
        Gson g = new Gson();
        String jsonString = g.toJson(inputData);
        return groundService.getGroundData();
    }

    @GetMapping("/ground-transport")
    public String sayHello() {
        return "Hello WOrld!";
    }
}
