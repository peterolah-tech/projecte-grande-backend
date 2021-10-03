package com.codecool.projectegrandebackend.model.generated.transport.consumePostDataGenerated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroundPostInput {

	@JsonProperty("distance")
	private Distance distance;

	@JsonProperty("fuel_efficiency")
	private FuelEfficiency fuelEfficiency;

//	public Distance getDistance(){
//		return distance;
//	}
//
//	public FuelEfficiency getFuelEfficiency(){
//		return fuelEfficiency;
//	}
//
//	@Override
//	public String toString() {
//		return "GroundPostInput{" +
//				"distance=" + distance +
//				", fuelEfficiency=" + fuel_efficiency +
//				'}';
//	}
}