package com.codecool.projectegrandebackend.model.generated.transport.vehicle.consumePostDataGenerated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuelEfficiency{

	@JsonProperty("value")
	private int value;

	@JsonProperty("units")
	private String units;

	@JsonProperty("of")
	private String of;
}