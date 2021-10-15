package com.codecool.projectegrandebackend.controller.recipes;

import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.model.Meal;
import com.codecool.projectegrandebackend.model.generated.recipes.Recipes;
import com.codecool.projectegrandebackend.repository.MealRepository;
import com.codecool.projectegrandebackend.repository.UserRepository;
import com.codecool.projectegrandebackend.service.recipes.RecipesApiService;
import com.codecool.projectegrandebackend.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class RecipesController {

    @Autowired
    private RecipesApiService recipesApiService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MealRepository mealRepository;

    @GetMapping("api/v1/recipes/{cuisine}/{diet}")
    public Recipes getRecipesByCuisineAndDiet(@PathVariable("cuisine") String cuisine, @PathVariable("diet") String diet) {
        return recipesApiService.getRecipesByCuisineAndDiet(cuisine, diet);
    }

    @RequestMapping(value="api/v1/add-meal",
            method= RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createRole(@RequestBody Map<String, String> formData, Authentication authentication){
        String username = authentication.getName();
        String roles = authentication.getAuthorities().toString();

        // Above works as well, below does not
        Object principal = authentication.getPrincipal();
        AppUser user = (AppUser) authentication.getPrincipal();

        String mealId = formData.get("meal_id");
        int intMealId = Integer.parseInt(mealId);

        Meal meal = Meal.builder()
                .apiId(intMealId)
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

}
