package com.codecool.projectegrandebackend.model.generated.recipes.ingredients;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metric{

	@JsonProperty("unit")
	private String unit;

	@JsonProperty("value")
	private double value;

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setValue(double value){
		this.value = value;
	}

	public double getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"Metric{" + 
			"unit = '" + unit + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}