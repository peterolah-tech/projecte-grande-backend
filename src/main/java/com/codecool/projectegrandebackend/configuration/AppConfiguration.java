package com.codecool.projectegrandebackend.configuration;

import com.codecool.projectegrandebackend.model.Meal;
import com.codecool.projectegrandebackend.model.User;
import com.codecool.projectegrandebackend.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class AppConfiguration {

    @Bean
    @Profile("production")
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            User betaUser = User.builder()
                    .username("test_bela")
                    .email("bela@takeaction.com")
                    .password("5678")
                    .build();
            userRepository.save(betaUser);

            Meal meal = Meal.builder().apiId(123456).build();

            Set<Meal> mealSet = new HashSet<>();
            mealSet.add(meal);

            User betaUser2 = User.builder()
                    .username("test_janos")
                    .email("janos@takeaction.com")
                    .password("9876")
                    .consumedMeals(mealSet)
                    .build();
            userRepository.save(betaUser2);

        };
    }

}
