package com.codecool.projectegrandebackend.service.ev;

import com.codecool.projectegrandebackend.model.EV;
import com.codecool.projectegrandebackend.model.generated.ev.EVResponseItem;
import com.codecool.projectegrandebackend.repository.EVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.Set;


@RestController
public class EVService {

    @Autowired
    private EVRepository evRepository;

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
            System.out.println(actualEv.toString());
            evRepository.save(actualEv);
        }
        return evList;
    }

    private EV createEV(EVResponseItem evResponse) {
        EV actualEV = EV.builder()
                .evId(evResponse.getAddressInfo().getID())
                .address(evResponse.getAddressInfo().getAddressLine1())
                .town(evResponse.getAddressInfo().getTown())
                .latitude(evResponse.getAddressInfo().getLatitude())
                .longitude(evResponse.getAddressInfo().getLongitude())
                .title(evResponse.getAddressInfo().getTitle())
                .favorite(false)
                .build();

        return actualEV;
    }

    public void updateFavorite(EV updateEV) {
        EV actualEV = evRepository.findEVByEvId(updateEV.getEvId());
        actualEV.setFavorite(!updateEV.isFavorite());
        evRepository.updateFavoriteByEvId(actualEV.isFavorite(), updateEV.getEvId());
    }
}