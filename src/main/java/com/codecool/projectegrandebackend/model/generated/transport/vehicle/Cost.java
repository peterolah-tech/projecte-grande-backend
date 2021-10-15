package com.codecool.projectegrandebackend.model.generated.transport.vehicle;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Cost{

	@JsonProperty("total")
	private String total;

	@JsonProperty("offset")
	private String offset;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("transaction")
	private String transaction;
}