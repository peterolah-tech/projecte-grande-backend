package com.codecool.projectegrandebackend.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Temperature{

	@JsonProperty("number")
	private double number;

	@JsonProperty("unit")
	private String unit;

	public void setNumber(double number){
		this.number = number;
	}

	public double getNumber(){
		return number;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	@Override
 	public String toString(){
		return 
			"Temperature{" + 
			"number = '" + number + '\'' + 
			",unit = '" + unit + '\'' + 
			"}";
		}
}