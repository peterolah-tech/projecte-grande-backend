package com.codecool.projectegrandebackend.service.recipes;

import com.codecool.projectegrandebackend.model.generated.recipes.Recipes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class RecipesApiService {

    private final String urlBase = "https://api.spoonacular.com/recipes/complexSearch?";

    @Value("${REACT_APP_API_KEY_SPOONACULAR}")
    private String REACT_APP_API_KEY_SPOONACULAR;

    private String createUrl(String cuisine, String diet) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(urlBase)
                .queryParam("apiKey", REACT_APP_API_KEY_SPOONACULAR)
                .queryParam("cuisine", cuisine)
                .queryParam("diet", diet)
                .queryParam("instructionsRequired", true)
                .queryParam("addRecipeInformation", true);
        return builder.toUriString();
    }

    public Recipes getRecipesByCuisineAndDiet(String cuisine, String diet) {
        String completeUrl = createUrl(cuisine, diet);
        RestTemplate template = new RestTemplate();
        ResponseEntity<Recipes> recipesResponseEntity = template.exchange(completeUrl, HttpMethod.GET, null, Recipes.class);
        return recipesResponseEntity.getBody();
    }

}
