package com.codecool.projectegrandebackend.model.generated.transport.vehicle.consumePostDataGenerated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GroundPersistInput {

	@JsonProperty("dateOfTravel")
	private LocalDate dateOfTravel;

	@JsonProperty("distance")
	private Distance distance;

	@JsonProperty("fuel_efficiency")
	private FuelEfficiency fuel_efficiency;

	public LocalDate getDateOfTravel() {
		return dateOfTravel;
	}

	public Distance getDistance(){
		return distance;
	}

	public FuelEfficiency getFuelEfficiency(){
		return fuel_efficiency;
	}
	

}