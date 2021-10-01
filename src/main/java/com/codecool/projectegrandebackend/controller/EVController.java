package com.codecool.projectegrandebackend.controller;

import com.codecool.projectegrandebackend.model.EV;
import com.codecool.projectegrandebackend.service.EVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class EVController {

    @Autowired
    private EVService evService;

    @GetMapping("api/v1/ev")
    public Set<EV> getEV(){
        return evService.getEVData();
    }

    @PostMapping("api/v1/ev")
    public String changeFavorite(@RequestBody EV ev){
        evService.updateFavorite(ev);
        return "success";
    }

    @PostMapping("api/v1/ev/coordinate")
    public String coordinate(@RequestParam float longitude, float latitude){
        System.out.println(evService.setUrl(longitude,latitude));
        return "coordinate";
    }
}
