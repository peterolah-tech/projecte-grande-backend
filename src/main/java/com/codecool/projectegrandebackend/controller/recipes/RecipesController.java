package com.codecool.projectegrandebackend.controller.recipes;

import com.codecool.projectegrandebackend.model.generated.Recipes;
import com.codecool.projectegrandebackend.service.recipes.RecipesApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipesController {

    @Autowired
    private RecipesApiService recipesApiService;

    @GetMapping("/recipes/{cuisine}/{diet}")
    public Recipes getRecipesByCuisineAndDiet(@PathVariable("cuisine") String cuisine, @PathVariable("diet") String diet) {
        return recipesApiService.getRecipesByCuisineAndDiet(cuisine, diet);
    }

}
