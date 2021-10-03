package com.codecool.projectegrandebackend.controller.recipes;

import com.codecool.projectegrandebackend.model.SimpleDataTransferObject;
import com.codecool.projectegrandebackend.model.generated.recipes.ingredients.Ingredient;
import com.codecool.projectegrandebackend.service.recipes.IngredientsApiService;
import com.codecool.projectegrandebackend.service.recipes.IngredientsDataService;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientsController {

    @Autowired
    private IngredientsApiService ingredientsApiService;

    @Autowired
    private IngredientsDataService ingredientsDataService;

    @GetMapping("api/v1/ingredients/{recipeId}")
    public Ingredient getRecipesByCuisineAndDiet(@PathVariable("recipeId") String recipeId) {
        return ingredientsApiService.getIngredientsForRecipe("715769");
    }

    @GetMapping("api/v1/ingredients/{recipeId}/emissions")
    public SimpleDataTransferObject getRecipeEmissions(@PathVariable("recipeId") String recipeId) {
        // Double emissions = ingredientsDataService.getEmissionForRecipe("715769");
        Double emissions = 2.0;
        SimpleDataTransferObject response = new SimpleDataTransferObject("asd");
        // return emissions.toString();
        return response;
    }

}
