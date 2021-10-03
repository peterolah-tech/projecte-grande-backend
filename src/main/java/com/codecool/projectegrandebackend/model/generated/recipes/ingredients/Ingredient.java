package com.codecool.projectegrandebackend.model.generated.recipes.ingredients;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Ingredient{

	@JsonProperty("ingredients")
	private List<IngredientsItem> ingredients;

	public void setIngredients(List<IngredientsItem> ingredients){
		this.ingredients = ingredients;
	}

	public List<IngredientsItem> getIngredients(){
		return ingredients;
	}

	@Override
 	public String toString(){
		return 
			"Ingredient{" + 
			"ingredients = '" + ingredients + '\'' + 
			"}";
		}
}