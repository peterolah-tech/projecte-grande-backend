package com.codecool.projectegrandebackend.service;

import com.codecool.projectegrandebackend.model.EV;
import com.codecool.projectegrandebackend.model.evgenerated.EVResponseItem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;


@RestController
public class EVService {

    @Value("${REACT_APP_OPENCHARGERMAP}")
    private String REACT_APP_OPENCHARGERMAP;
//    private String url = "https://api.openchargemap.io/v3/poi/?output=json&latitude=51.509865&longitude=-0.118092&dustance=20";
    private String url = "https://api.openchargemap.io/v3/poi/?output=json&latitude=47.497913&longitude=19.040236&dustance=10";

    private Set<EV> evList = new HashSet<>();

    public String setUrl(float longitude, float latitude){
        this.url = "https://api.openchargemap.io/v3/poi/?output=json&latitude=" + latitude+ "&longitude=" + longitude + "&distance=10";
        return url;
    }

    public Set<EV> getEVData() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("X-API-Key", REACT_APP_OPENCHARGERMAP);

        ResponseEntity<Set<EVResponseItem>> evResponseEntity = restTemplate.exchange(url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<Set<EVResponseItem>>() {
                });
        Set<EVResponseItem> evResponse = evResponseEntity.getBody();
        if(evList.size() == 0) {
            evList = createEVList(evResponse);
        }
        return evList;
    }

    private Set<EV> createEVList(Set<EVResponseItem> evs) {
//        evList = new HashSet<>();
        for (EVResponseItem evResponse : evs) {
            EV actualEv = createEV(evResponse);
            evList.add(actualEv);
        }
        return evList;
    }

    private EV createEV(EVResponseItem evResponse){
        EV actualEV = new EV(
                evResponse.getAddressInfo().getID(),
                evResponse.getAddressInfo().getAddressLine1(),
                evResponse.getAddressInfo().getTown(),
                evResponse.getAddressInfo().getLatitude(),
                evResponse.getAddressInfo().getLongitude(),
                evResponse.getAddressInfo().getTitle(),
                false
        );
        return actualEV;
    }

    public void updateFavorite(EV updateEV) {
        for (EV ev : evList) {
            if (ev.getEvId().equals(updateEV.getEvId())) {
                boolean favorite = updateEV.isFavorite();
                ev.setFavorite(!favorite);
            }
        }
    }
}