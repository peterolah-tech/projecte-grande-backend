package com.codecool.projectegrandebackend.controller.ev;

import com.codecool.projectegrandebackend.model.EV;
import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.service.ev.EVService;
import com.codecool.projectegrandebackend.service.user.UserService;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class EVController {

    @Autowired
    private EVService evService;

    @Autowired
    private UserService userService;

    @GetMapping("api/v1/ev")
    public Set<EV> getEV(Authentication authentication) {
        AppUser user = (AppUser) authentication.getPrincipal();
        Set<EV> allEVs = evService.getEVData(user);
        return allEVs;
    }

    @RequestMapping(value = "api/v1/ev", method = RequestMethod.POST)
    @ResponseBody
    public Set<EV> changeFavorite(@RequestBody EV ev, Authentication authentication) {
        AppUser user = (AppUser) authentication.getPrincipal();
        evService.updateFavorite(ev, user);
        return getEV(authentication);
    }

    @PostMapping("api/v1/ev/coordinate")
    public String coordinate(@RequestParam float longitude, float latitude) {
        System.out.println(evService.setUrl(longitude, latitude));
        return "coordinate";
    }

    @GetMapping("api/v1/ev/statistics")
    public List<EV> statistics(Authentication authentication) {
        AppUser user = (AppUser) authentication.getPrincipal();
        return evService.getStatistics(user);
    }


}
