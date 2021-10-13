package com.codecool.projectegrandebackend.configuration;

import com.codecool.projectegrandebackend.model.EV;
import com.codecool.projectegrandebackend.model.User;
import com.codecool.projectegrandebackend.repository.AirportRepository;
import com.codecool.projectegrandebackend.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfiguration {

    @Bean
    @Profile("production")
    CommandLineRunner commandLineRunner(UserRepository userRepository, AirportsFactory airportsFactory) {
        return args -> {
            airportsFactory.saveCreatedAirports();
            User betaUser = User.builder()
                    .username("test_bela")
                    .email("bela@takeaction.com")
                    .password("5678")
                    .build();
            userRepository.save(betaUser);
        };
    }

}
