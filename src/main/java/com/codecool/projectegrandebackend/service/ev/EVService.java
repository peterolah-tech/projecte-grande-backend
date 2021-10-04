package com.codecool.projectegrandebackend.service.ev;

import com.codecool.projectegrandebackend.model.EV;
import com.codecool.projectegrandebackend.model.User;
import com.codecool.projectegrandebackend.model.generated.ev.EVResponseItem;
import com.codecool.projectegrandebackend.repository.EVRepository;
import com.codecool.projectegrandebackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@RestController
public class EVService {

    @Autowired
    private EVRepository evRepository;

    @Autowired
    private UserRepository userRepository;

    private Set<EV> evList = new HashSet<>();
    @Value("${REACT_APP_OPENCHARGERMAP}")
    private String REACT_APP_OPENCHARGERMAP;
    private String url = "https://api.openchargemap.io/v3/poi/?output=json&latitude=47.497913&longitude=19.040236&dustance=10";


    public String setUrl(float longitude, float latitude){
        this.url = "https://api.openchargemap.io/v3/poi/?output=json&latitude=" + latitude+ "&longitude=" + longitude + "&distance=10";
        return url;
    }

    public List<EV> getEVData() {
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
           createEVList(evResponse);
        return evRepository.findAll();
    }

    private void createEVList(Set<EVResponseItem> evs){
        for (EVResponseItem evResponse : evs) {
            if(!evRepository.existsByEvId(evResponse.getAddressInfo().getID())) {
                EV actualEv = createEV(evResponse);
                evRepository.save(actualEv);
            }else{
                System.out.println("found evId:  " + evResponse.getAddressInfo().getID());
            }
        }
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

    public void updateFavorite(EV updateEV, User user) {
        EV actualEV = evRepository.findEVByEvId(updateEV.getEvId());
        if(!user.getEvs().contains(actualEV)){
            actualEV.setFavorite(!updateEV.isFavorite());
            user.getEvs().add(actualEV);
        }else{
            user.getEvs().remove(actualEV);
            actualEV.setFavorite(!updateEV.isFavorite());
        }
        userRepository.save(user);
    }
}