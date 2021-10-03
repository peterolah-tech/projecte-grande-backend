package com.codecool.projectegrandebackend.service.recipes;

import com.codecool.projectegrandebackend.model.generated.recipes.ingredients.IngredientsItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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



}
