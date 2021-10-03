package com.codecool.projectegrandebackend.service.recipes;

import com.codecool.projectegrandebackend.model.generated.recipes.IngredientEmissions;
import com.codecool.projectegrandebackend.model.generated.recipes.ingredients.IngredientsItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IngredientsDataService {

    @Autowired
    private IngredientsApiService ingredientsApiService;

    private ArrayList<String> getIngredientsList(String recipeId) {
        List<IngredientsItem> ingredients = ingredientsApiService.getIngredientsForRecipe(recipeId).getIngredients();
        ArrayList<String> ingredientsStringList = ingredients.stream()
                .map(IngredientsItem::getName)
                .collect(Collectors.toCollection(ArrayList::new));

        return ingredientsStringList;
    }

    public double getEmissionForRecipe(String recipeId) {
        ArrayList<String> ingredients = getIngredientsList(recipeId);

        Double totalEmissions = 0.0;

        // Get emissions data based on tracked ingredients
        IngredientEmissions emissionsObject = new IngredientEmissions();
        HashMap<String, Double> ingredientEmissions = emissionsObject.getIngredientEmissions();

        for (String actualIngredient : ingredients) {
            if (ingredientEmissions.containsKey(actualIngredient)) {
                totalEmissions += ingredientEmissions.get(actualIngredient);
            }
        }

        // If none was found, assume it's a vegetarian dish
        if (totalEmissions == 0.0) {
            totalEmissions = ingredientEmissions.get("vegetables");
        }

        return totalEmissions;
    }

}
