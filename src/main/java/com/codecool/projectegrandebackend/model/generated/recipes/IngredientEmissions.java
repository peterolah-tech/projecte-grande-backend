package com.codecool.projectegrandebackend.model.generated.recipes;

import java.util.HashMap;

public class IngredientEmissions {

    // In parenthesis: greenhouse gas emissions (in kg CO2) produced by one kilo of each food
    // https://www.greeneatz.com/foods-carbon-footprint.html

    // Could get a separate API for this as well:
    // e.g. https://eaternity.org/foodprint/database

    private HashMap<String, Double> ingredientEmissions;

    public IngredientEmissions() {
        ingredientEmissions = new HashMap<>();
        ingredientEmissions.put("lamb", 39.2);
        ingredientEmissions.put("beef", 27.0);
        ingredientEmissions.put("cheese", 13.5);
        ingredientEmissions.put("pork", 12.1);
        ingredientEmissions.put("turkey", 10.9);
        ingredientEmissions.put("chicken", 6.9);
        ingredientEmissions.put("tuna", 6.1);
        ingredientEmissions.put("eggs", 4.8);
        ingredientEmissions.put("vegetables", 2.0);
    }

    public HashMap<String, Double> getIngredientEmissions() {
        return ingredientEmissions;
    }
}
