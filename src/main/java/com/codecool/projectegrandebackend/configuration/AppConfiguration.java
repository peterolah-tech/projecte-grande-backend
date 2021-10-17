package com.codecool.projectegrandebackend.configuration;


import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.model.Meal;
import com.codecool.projectegrandebackend.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Configuration
public class AppConfiguration {

    private final PasswordEncoder passwordEncoder;

    public AppConfiguration() {
        passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    @Profile("production")
    CommandLineRunner commandLineRunner(UserRepository userRepository, AirportsFactory airportsFactory) {
        return args -> {
            airportsFactory.saveCreatedAirports();

            AppUser betaAppUser = AppUser.builder()
                    .username("test_bela")
                    .email("bela@takeaction.com")
                    .password(passwordEncoder.encode("5678"))
                    .roles(List.of("ROLE_USER")) // other is ROLE_ADMIN
                    .build();

            userRepository.save(betaAppUser);

            Date mealDate = new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2021");
            Meal meal = Meal.builder()
                    .apiId(123456)
                    .consumptionDate(mealDate)
                    .build();

            // Set<Meal> mealSet = new HashSet<>();
            // mealSet.add(meal);

            AppUser betaUser2 = AppUser.builder()
                    .username("test_janos")
                    .email("janos@takeaction.com")
                    .password("9876")
                    .consumedMeal(meal)
                    .build();

            userRepository.save(betaUser2);

        };
    }

}
