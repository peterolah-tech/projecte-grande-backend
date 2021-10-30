package com.codecool.projectegrandebackend.model.generated.recipes.ingredients;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IngredientsItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("amount")
	private Amount amount;

	@JsonProperty("name")
	private String name;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setAmount(Amount amount){
		this.amount = amount;
	}

	public Amount getAmount(){
		return amount;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"IngredientsItem{" + 
			"image = '" + image + '\'' + 
			",amount = '" + amount + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}