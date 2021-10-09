package com.codecool.projectegrandebackend.controller.ev;

import com.codecool.projectegrandebackend.model.EV;
import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.service.ev.EVService;
import com.codecool.projectegrandebackend.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class EVController {

    @Autowired
    private EVService evService;

    @Autowired
    private UserService userService;

    @GetMapping("api/v1/ev")
    public Set<EV> getEV(){
        return evService.getEVData();
    }

    @PostMapping("api/v1/ev")
    public String changeFavorite(@RequestBody EV ev){
        AppUser testAppUser =  userService.findUser(1L);
        evService.updateFavorite(ev, testAppUser);
        return "success";
    }

    @PostMapping("api/v1/ev/coordinate")
    public String coordinate(@RequestParam float longitude, float latitude){
        System.out.println(evService.setUrl(longitude,latitude));
        return "coordinate";
    }
}
