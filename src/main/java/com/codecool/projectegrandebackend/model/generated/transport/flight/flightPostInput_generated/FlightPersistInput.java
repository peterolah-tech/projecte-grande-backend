package com.codecool.projectegrandebackend.model.generated.transport.flight.flightPostInput_generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class FlightPersistInput {

	@JsonProperty("dateOfTravel")
	private LocalDate dateOfTravel;

	@JsonProperty("airports")
	private List<String> airports;

}