package com.codecool.projectegrandebackend.model.ground_trsport_generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Offset{

	@JsonProperty("available_carbon_in_kg")
	private String available_carbon_in_kg;

	@JsonProperty("country")
	private String country;

	@JsonProperty("province")
	private String province;

	@JsonProperty("city")
	private String city;

	@JsonProperty("offset_type")
	private String offset_type;

	@JsonProperty("offset_type_slug")
	private String offset_type_slug;

	@JsonProperty("name")
	private String name;

	@JsonProperty("pretty_url")
	private String pretty_url;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("total_capacity")
	private String total_capacity;

	@JsonProperty("latlng")
	private String latlng;

	@JsonProperty("technical_details")
	private String technical_details;

	public String getAvailableCarbonInKg(){
		return available_carbon_in_kg;
	}

	public String getCountry(){
		return country;
	}

	public String getProvince(){
		return province;
	}

	public String getCity(){
		return city;
	}

	public String getOffsetType(){
		return offset_type;
	}

	public String getOffsetTypeSlug(){
		return offset_type_slug;
	}

	public String getName(){
		return name;
	}

	public String getPrettyUrl(){
		return pretty_url;
	}

	public String getSlug(){
		return slug;
	}

	public String getTotalCapacity(){
		return total_capacity;
	}

	public String getLatlng(){
		return latlng;
	}

	public String getTechnicalDetails(){
		return technical_details;
	}
}