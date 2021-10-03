package com.codecool.projectegrandebackend.model.generated.transport.consumePostDataGenerated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Distance{

	@JsonProperty("units")
	private String units;

	@JsonProperty("value")
	private int value;
}