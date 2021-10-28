package com.codecool.projectegrandebackend.controller.recipes;

import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.model.Meal;
import com.codecool.projectegrandebackend.model.generated.recipes.Recipes;
import com.codecool.projectegrandebackend.repository.MealRepository;
import com.codecool.projectegrandebackend.repository.UserRepository;
import com.codecool.projectegrandebackend.service.recipes.MealService;
import com.codecool.projectegrandebackend.service.recipes.RecipesApiService;
import com.codecool.projectegrandebackend.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class RecipesController {

    @Autowired
    private RecipesApiService recipesApiService;

    @Autowired
    private UserService userService;

    @Autowired
    private MealService mealService;

    @GetMapping("api/v1/recipes/{cuisine}/{diet}")
    public Recipes getRecipesByCuisineAndDiet(@PathVariable("cuisine") String cuisine, @PathVariable("diet") String diet) {
        return recipesApiService.getRecipesByCuisineAndDiet(cuisine, diet);
    }

    @RequestMapping(value="api/v1/add-meal",
            method= RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createRole(@RequestBody Map<String, String> formData, Authentication authentication) throws ParseException {
        String username = authentication.getName();
        String roles = authentication.getAuthorities().toString();

        // Another way..
        AppUser user = (AppUser) authentication.getPrincipal();

        String mealId = formData.get("meal_id");
        int intMealId = Integer.parseInt(mealId);
        Date mealDate = new SimpleDateFormat("dd/MM/yyyy").parse(formData.get("consumption_date_formatted"));

        Meal meal = Meal.builder()
                .apiId(intMealId)
                .consumptionDate(mealDate)
                // .user(user)
                .build();

        userService.addMealToUser(meal, user);
        // mealRepository.save(meal);

//        AppUser newUser = AppUser.builder()
//                .username(formData.get("name"))
//                .email(formData.get("email"))
//                .password(passwordEncoder.encode(formData.get("password")))
//                .roles(List.of("ROLE_USER"))
//                .build();
//
//        userRepository.save(newUser);
    }

//    @GetMapping("/username")
//    @ResponseBody
//    public String currentUserName(Authentication authentication) {
//        String username = authentication.getName();
//        String roles = authentication.getAuthorities().toString();
//        // return username + "\n" + roles;
//
//        // Above works as well, below does not
//        Object principal = authentication.getPrincipal();
//        System.out.println("only for debug");
//        VehicleAppUser user = (VehicleAppUser) authentication.getPrincipal();
//        return user.getUsername() + "\n" + user.getRoles();
//    }

    @GetMapping("api/v1/meal-summary/{userId}")
    public int mealSummary(@PathVariable("userId") int userId) {
        return mealService.getVegaMealNumber(userId);
    }

    @GetMapping("api/v1/meal-summary")
    // public int mealSummaryForUser(Authentication authentication) {
    public Set<Meal> mealSummaryForUser(Authentication authentication) {
        AppUser user = (AppUser) authentication.getPrincipal();
        Long userId = user.getId();
        // return mealService.getVegaMealNumber(userId);
        Set<Meal> meals = mealService.getVegaMeals(userId);
        return meals;
    }

}
