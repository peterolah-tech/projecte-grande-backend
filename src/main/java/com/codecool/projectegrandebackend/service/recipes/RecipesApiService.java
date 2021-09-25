package com.codecool.projectegrandebackend.service.recipes;

import com.codecool.projectegrandebackend.model.generated.Recipes;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RecipesApiService {

    private final String urlBase = "https://api.spoonacular.com/recipes/complexSearch?";
    private final String apiKey = "apiKey=5cf8d67a11864e018f9e6141d5107886";
    private final String otherStandardSettings = "&instructionsRequired=true&addRecipeInformation=true";
    // &cuisine=italian&diet=vegan

    private String createUrl(String cuisine, String diet) {
        String completeUrl = urlBase + apiKey + "&" + "&cuisine=" + cuisine + "&diet=" + diet + otherStandardSettings;
        return completeUrl;
    }

    public Recipes getRecipesByCuisineAndDiet(String cuisine, String diet) {
        String completeUrl = createUrl(cuisine, diet);
        RestTemplate template = new RestTemplate();
        // TODO: the query parameters could probably be set in the RequestEntity parameter below (currently null) - do it later
        ResponseEntity<Recipes> recipesResponseEntity = template.exchange(completeUrl, HttpMethod.GET, null, Recipes.class);
        return recipesResponseEntity.getBody();
    }

}
