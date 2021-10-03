package com.codecool.projectegrandebackend.service.recipes;

import com.codecool.projectegrandebackend.model.generated.recipes.Recipes;
import com.codecool.projectegrandebackend.model.generated.recipes.ingredients.Ingredient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class IngredientsApiService {

    // private final String urlBase = "https://api.spoonacular.com/recipes/%d/ingredientWidget.json?";
    private final String urlBase = "https://api.spoonacular.com/recipes/715769/ingredientWidget.json?";

    private String testId = "715769";
    private String urlWithId = String.format(urlBase, testId);

    @Value("${REACT_APP_API_KEY_SPOONACULAR}")
    private String REACT_APP_API_KEY_SPOONACULAR;

    private String createUrl(String recipeId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(urlBase)
                .queryParam("apiKey", REACT_APP_API_KEY_SPOONACULAR);
        return builder.toUriString();
    }

    public Ingredient getIngredientsForRecipe(String id) {
        String completeUrl = createUrl("715769");
        RestTemplate template = new RestTemplate();
        ResponseEntity<Ingredient> ingredientsResponseEntity = template.exchange(completeUrl, HttpMethod.GET, null, Ingredient.class);
        return ingredientsResponseEntity.getBody();
    }

}
