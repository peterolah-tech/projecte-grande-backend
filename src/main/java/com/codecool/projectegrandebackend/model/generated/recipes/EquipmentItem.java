package com.codecool.projectegrandebackend.model.generated.recipes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EquipmentItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("localizedName")
	private String localizedName;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("temperature")
	private Temperature temperature;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setLocalizedName(String localizedName){
		this.localizedName = localizedName;
	}

	public String getLocalizedName(){
		return localizedName;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTemperature(Temperature temperature){
		this.temperature = temperature;
	}

	public Temperature getTemperature(){
		return temperature;
	}

	@Override
 	public String toString(){
		return 
			"EquipmentItem{" + 
			"image = '" + image + '\'' + 
			",localizedName = '" + localizedName + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",temperature = '" + temperature + '\'' + 
			"}";
		}
}