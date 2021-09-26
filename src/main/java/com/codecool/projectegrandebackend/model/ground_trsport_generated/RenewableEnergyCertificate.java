package com.codecool.projectegrandebackend.model.ground_trsport_generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RenewableEnergyCertificate{

	@JsonProperty("country")
	private String country;

	@JsonProperty("province")
	private String province;

	@JsonProperty("city")
	private String city;

	@JsonProperty("renewable_type")
	private String renewable_type;

	@JsonProperty("deprecated")
	private String deprecated;

	@JsonProperty("name")
	private String name;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("total_capacity")
	private String total_capacity;

//	@JsonProperty("latlng")
//	private String latlng;

	@JsonProperty("technical_details")
	private String technical_details;

	public String getCountry(){
		return country;
	}

	public String getProvince(){
		return province;
	}

	public String getCity(){
		return city;
	}

	public String getRenewableType(){
		return renewable_type;
	}

	public String getDeprecated(){
		return deprecated;
	}

	public String getName(){
		return name;
	}

	public String getSlug(){
		return slug;
	}

	public String getTotalCapacity(){
		return total_capacity;
	}

//	public String getLatlng(){
//		return latlng;
//	}

	public String getTechnicalDetails(){
		return technical_details;
	}
}