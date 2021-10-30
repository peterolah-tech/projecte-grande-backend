package com.codecool.projectegrandebackend.model.generated.transport.vehicle.consumePostDataGenerated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Distance{

	@JsonProperty("value")
	private int value;

	@JsonProperty("units")
	private String units;

}