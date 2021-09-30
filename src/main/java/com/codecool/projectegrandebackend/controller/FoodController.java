package com.codecool.projectegrandebackend.controller;

import com.codecool.projectegrandebackend.model.Food;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FoodController {

    @Value("${REACT_APP_API_KEY_SPOONACULAR}")
    private String REACT_APP_API_KEY_SPOONACULAR;

    @GetMapping("/food")
    public ResponseEntity<Food> getFood(){
        RestTemplate restTemplete = new RestTemplate();
        ResponseEntity<Food> food = restTemplete.getForEntity("https://api.spoonacular.com/recipes/complexSearch", Food.class);
        System.out.println(food);
        return food;
    }
//    @GetMapping("/")
//    public void readFromProp() {
//        System.out.println(REACT_APP_API_KEY_SPOONACULAR);
//    }

}
