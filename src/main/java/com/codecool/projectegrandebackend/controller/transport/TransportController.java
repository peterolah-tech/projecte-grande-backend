package com.codecool.projectegrandebackend.controller.transport;

import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.model.FlightTransportation;
import com.codecool.projectegrandebackend.model.GroundTransportation;
import com.codecool.projectegrandebackend.model.generated.transport.TransportStat;
import com.codecool.projectegrandebackend.service.transport.FlightService;
import com.codecool.projectegrandebackend.service.transport.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("api/v1/transport")
@RestController
public class TransportController {

    @Autowired
    private GroundService groundService;
    @Autowired
    private FlightService flightService;


    @GetMapping("/statistics")
    public List<TransportStat> statistics(Authentication authentication) {
        AppUser user = (AppUser) authentication.getPrincipal();
        List<GroundTransportation> vehicleTravels = groundService.getStatistics(user);
        List<FlightTransportation> flightTravels = flightService.getStatistics(user);


        HashMap<Integer, Double> monthlyTravels = new HashMap<>();
        for (int currentMonth=0;currentMonth<=12;currentMonth++) {
            int streamCurrentMonth = currentMonth;
            double CO2ofMonth = vehicleTravels.stream()
                    .filter(travel -> travel.getDateOfTravel().getMonthValue() == (streamCurrentMonth))
                    .mapToDouble(GroundTransportation::getEquivalentCarbonInKg)
                    .sum();
            monthlyTravels.put(currentMonth, CO2ofMonth);
        }

        for (int currentMonth=1;currentMonth<=12;currentMonth++) {
            int streamCurrentMonth = currentMonth;
            double CO2ofMonth = flightTravels.stream()
                    .filter(travel -> travel.getDateOfTravel().getMonthValue() == streamCurrentMonth)
                    .mapToDouble(FlightTransportation::getEquivalentCarbonInKg)
                    .sum();
            monthlyTravels.put(currentMonth, monthlyTravels.get(currentMonth) + CO2ofMonth);
        }

        List<TransportStat> resultStat = new ArrayList<>();
        for (Map.Entry entry : monthlyTravels.entrySet()) {
            TransportStat transStat = TransportStat.builder()
                    .name(entry.getKey().toString())
                    .yourCO2((double) entry.getValue())
                    .avgCO2(60.0)
                    .build();
            resultStat.add(transStat);
        }
        return resultStat;
    }

}
