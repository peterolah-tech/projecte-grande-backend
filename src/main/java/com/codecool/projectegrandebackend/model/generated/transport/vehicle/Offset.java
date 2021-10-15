package com.codecool.projectegrandebackend.model.generated.transport.vehicle;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Offset{

	@JsonProperty("available_carbon_in_kg")
	private String availableCarbonInKg;

	@JsonProperty("country")
	private String country;

	@JsonProperty("province")
	private String province;

	@JsonProperty("city")
	private String city;

	@JsonProperty("offset_type")
	private String offsetType;

	@JsonProperty("offset_type_slug")
	private String offsetTypeSlug;

	@JsonProperty("name")
	private String name;

	@JsonProperty("pretty_url")
	private String prettyUrl;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("total_capacity")
	private String totalCapacity;

//	@JsonProperty("latlng")
//	private String latlng;

	@JsonProperty("technical_details")
	private String technicalDetails;
}