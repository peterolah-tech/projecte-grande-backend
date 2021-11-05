package com.codecool.projectegrandebackend.service.transport;

import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.model.GroundTransportation;
import com.codecool.projectegrandebackend.model.generated.transport.vehicle.GroundTransport;
import com.codecool.projectegrandebackend.repository.GroundTransportationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RestController
public class GroundService {

    @Autowired
    private GroundTransportationRepository groundTransportationRepository;

    @Value("${REACT_APP_API_KEY_CLOVERLY}")
    private String API_KEY_CLOVERLY;
    @Value("${Ground_Transport_URL}")
    private String url;


    public GroundTransport getGroundData(String jsonString){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(jsonString, headers);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization",  API_KEY_CLOVERLY);
        ResponseEntity<GroundTransport> groundResponseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, GroundTransport.class);
        return groundResponseEntity.getBody();
    }

    public List<GroundTransportation> getStatistics(AppUser user) {
        List<GroundTransportation> vehicleTravels = groundTransportationRepository.findAllByUser(user);
        return vehicleTravels;
    }
}
