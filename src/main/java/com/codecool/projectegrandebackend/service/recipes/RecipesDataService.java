package com.codecool.projectegrandebackend.service.recipes;

import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.model.Meal;
import com.codecool.projectegrandebackend.model.generated.recipes.ingredients.IngredientsItem;
import com.codecool.projectegrandebackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RecipesDataService {
    // This class is to manipulate data that we receive from the external API
    // Currently unused
}
