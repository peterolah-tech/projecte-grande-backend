package com.codecool.projectegrandebackend.controller.recipes;

import com.codecool.projectegrandebackend.model.generated.recipes.ingredients.Ingredient;
import com.codecool.projectegrandebackend.service.recipes.IngredientsApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientsController {

    @Autowired
    private IngredientsApiService ingredientsApiService;

    @GetMapping("api/v1/ingredients/{recipeId}")
    public Ingredient getRecipesByCuisineAndDiet(@PathVariable("recipeId") String recipeId) {
        return ingredientsApiService.getIngredientsForRecipe("715769");
    }

}
