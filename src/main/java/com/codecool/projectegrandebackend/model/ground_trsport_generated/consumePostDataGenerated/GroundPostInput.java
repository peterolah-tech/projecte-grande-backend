package com.codecool.projectegrandebackend.model.ground_trsport_generated.consumePostDataGenerated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroundPostInput{

	@JsonProperty("distance")
	private Distance distance;

	@JsonProperty("fuel_efficiency")
	private FuelEfficiency fuelEfficiency;

	public Distance getDistance(){
		return distance;
	}

	public FuelEfficiency getFuelEfficiency(){
		return fuelEfficiency;
	}

	@Override
	public String toString() {
		return "GroundPostInput{" +
				"distance=" + distance +
				", fuelEfficiency=" + fuelEfficiency +
				'}';
	}
}