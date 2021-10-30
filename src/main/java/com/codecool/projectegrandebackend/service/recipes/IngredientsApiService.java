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

    @Value("${REACT_APP_API_KEY_SPOONACULAR}")
    private String REACT_APP_API_KEY_SPOONACULAR;

    private String createUrl(String recipeId) {

        final String urlBase = "https://api.spoonacular.com/recipes/";
        final String urlEnd = "/ingredientWidget.json?";
        String url = urlBase + recipeId + urlEnd;

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("apiKey", REACT_APP_API_KEY_SPOONACULAR);
        return builder.toUriString();
    }

    public Ingredient getIngredientsForRecipe(String id) {
        String completeUrl = createUrl(id);
        RestTemplate template = new RestTemplate();
        ResponseEntity<Ingredient> ingredientsResponseEntity = template.exchange(completeUrl, HttpMethod.GET, null, Ingredient.class);
        return ingredientsResponseEntity.getBody();
    }

}
