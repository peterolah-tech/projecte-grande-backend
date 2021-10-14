package com.codecool.projectegrandebackend.controller.ev;

import com.codecool.projectegrandebackend.model.EV;
import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.service.ev.EVService;
import com.codecool.projectegrandebackend.service.user.UserService;
import com.fasterxml.jackson.databind.node.ObjectNode;
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

    @RequestMapping(value = "api/v1/ev", method = RequestMethod.POST)
    @ResponseBody
    public String changeFavorite(@RequestBody ObjectNode json){
        String username = json.get("username").asText();
        EV ev = EV.builder()
                .evId(json.get("evId").asInt())
                .favorite(json.get("favorite").asBoolean())
                .build();
        AppUser logInUser = userService.findByUserName(username);
        evService.updateFavorite(ev, logInUser);
        return "success";
    }

    @PostMapping("api/v1/ev/coordinate")
    public String coordinate(@RequestParam float longitude, float latitude){
        System.out.println(evService.setUrl(longitude,latitude));
        return "coordinate";
    }
}
