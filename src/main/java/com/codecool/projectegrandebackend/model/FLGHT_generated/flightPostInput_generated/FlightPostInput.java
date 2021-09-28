package com.codecool.projectegrandebackend.model.FLGHT_generated.flightPostInput_generated;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightPostInput{

	@JsonProperty("airports")
	private List<String> airports;

	public List<String> getAirports(){
		return airports;
	}
}