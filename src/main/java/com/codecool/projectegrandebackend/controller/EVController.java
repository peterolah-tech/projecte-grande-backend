package com.codecool.projectegrandebackend.controller;

import com.codecool.projectegrandebackend.model.EV;
import com.codecool.projectegrandebackend.service.EVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class EVController {

    @Autowired
    private EVService evService;

    @GetMapping("api/v1/ev")
    public Set<EV> getEV(){
        System.out.println(evService.getEVData());
        return evService.getEVData();
    }
}
