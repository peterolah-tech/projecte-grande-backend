package com.codecool.projectegrandebackend.model.generated.transport.flight.flightPostInput_generated;

import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class FlightPostInput{

	@JsonProperty("dateOfTravel")
	private transient LocalDate dateOfTravel;

	@JsonProperty("airports")
	private List<String> airports;

}