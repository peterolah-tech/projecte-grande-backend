package com.codecool.projectegrandebackend.service.recipes;

import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.model.Meal;
import com.codecool.projectegrandebackend.repository.MealRepository;
import com.codecool.projectegrandebackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@Service
@RestController
public class MealService {

    @Autowired
    private UserRepository userRepository;

    public int getVegaMealNumber(long userId) {
        AppUser user = userRepository.getById(userId);
        Set<Meal> consumedMeals = user.getConsumedMeals();
        // TODO: filter for arbitrary date range..
        return consumedMeals.size();
    }

    public Set<Meal> getVegaMeals(long userId) {
        AppUser user = userRepository.getById(userId);
        return user.getConsumedMeals();
    }

}
