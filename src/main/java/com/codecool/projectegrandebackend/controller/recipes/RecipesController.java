package com.codecool.projectegrandebackend.controller.recipes;

import com.codecool.projectegrandebackend.model.generated.recipes.Recipes;
import com.codecool.projectegrandebackend.service.recipes.RecipesApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class RecipesController {

    @Autowired
    private RecipesApiService recipesApiService;

    @GetMapping("api/v1/recipes/{cuisine}/{diet}")
    public Recipes getRecipesByCuisineAndDiet(@PathVariable("cuisine") String cuisine, @PathVariable("diet") String diet) {
        return recipesApiService.getRecipesByCuisineAndDiet(cuisine, diet);
    }

    @RequestMapping(value="/food/api/v1/add-meal",
            method= RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createRole(@RequestBody Map<String, String> formData){



//        AppUser newUser = AppUser.builder()
//                .username(formData.get("name"))
//                .email(formData.get("email"))
//                .password(passwordEncoder.encode(formData.get("password")))
//                .roles(List.of("ROLE_USER"))
//                .build();
//
//        userRepository.save(newUser);
    }

}
