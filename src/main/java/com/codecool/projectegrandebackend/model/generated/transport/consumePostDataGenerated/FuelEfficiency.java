package com.codecool.projectegrandebackend.model.generated.transport.consumePostDataGenerated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuelEfficiency{

	@JsonProperty("of")
	private String of;

	@JsonProperty("units")
	private String units;

	@JsonProperty("value")
	private int value;
}