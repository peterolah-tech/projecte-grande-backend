package com.codecool.projectegrandebackend.model.generated.ev;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EVResponse{

	@JsonProperty("EVResponse")
	private List<EVResponseItem> eVResponse;

	public void setEVResponse(List<EVResponseItem> eVResponse){
		this.eVResponse = eVResponse;
	}

	public List<EVResponseItem> getEVResponse(){
		return eVResponse;
	}
}