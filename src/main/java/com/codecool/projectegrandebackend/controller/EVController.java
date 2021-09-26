package com.codecool.projectegrandebackend.controller;

import com.codecool.projectegrandebackend.model.EV;
import com.codecool.projectegrandebackend.model.evgenerated.EVResponseItem;
import com.codecool.projectegrandebackend.service.EVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EVController {

    @Autowired
    private EVService evService;

    @GetMapping("api/ev")
    public ArrayList getEV(){
        System.out.println(evService.getEVData());
        return evService.getEVData();
    }
}
