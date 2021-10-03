package com.codecool.projectegrandebackend.model.generated.transport.vehicle.consumePostDataGenerated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FuelEfficiency{

	@JsonProperty("of")
	private String of;

	@JsonProperty("units")
	private String units;

	@JsonProperty("value")
	private int value;

	public String getOf(){
		return of;
	}

	public String getUnits(){
		return units;
	}

	public int getValue(){
		return value;
	}
}