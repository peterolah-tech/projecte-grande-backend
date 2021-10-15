package com.codecool.projectegrandebackend.model.generated.transport.flight;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class RenewableEnergyCertificate{

	@JsonProperty("country")
	private String country;

	@JsonProperty("province")
	private String province;

	@JsonProperty("city")
	private String city;

	@JsonProperty("renewable_type")
	private String renewableType;

	@JsonProperty("deprecated")
	private String deprecated;

	@JsonProperty("name")
	private String name;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("total_capacity")
	private String totalCapacity;

//	@JsonProperty("latlng")
//	private String latlng;

	@JsonProperty("technical_details")
	private String technicalDetails;
}