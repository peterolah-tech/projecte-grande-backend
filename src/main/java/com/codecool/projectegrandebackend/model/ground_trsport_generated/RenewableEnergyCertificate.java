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
	private String renewableType;

	@JsonProperty("deprecated")
	private String deprecated;

	@JsonProperty("name")
	private String name;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("total_capacity")
	private String totalCapacity;

	@JsonProperty("latlng")
	private String latlng;

	@JsonProperty("technical_details")
	private String technicalDetails;

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
		return renewableType;
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
		return totalCapacity;
	}

	public String getLatlng(){
		return latlng;
	}

	public String getTechnicalDetails(){
		return technicalDetails;
	}
}