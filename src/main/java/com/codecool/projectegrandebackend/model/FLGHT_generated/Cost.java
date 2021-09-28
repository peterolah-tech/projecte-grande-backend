package com.codecool.projectegrandebackend.model.FLGHT_generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cost{

	@JsonProperty("total")
	private String total;

	@JsonProperty("offset")
	private String offset;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("transaction")
	private String transaction;

	public String getTotal(){
		return total;
	}

	public String getOffset(){
		return offset;
	}

	public String getCurrency(){
		return currency;
	}

	public String getTransaction(){
		return transaction;
	}
}