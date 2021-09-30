package com.codecool.projectegrandebackend.model.evgenerated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country{

	@JsonProperty("ISOCode")
	private String iSOCode;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("ID")
	private int iD;

	@JsonProperty("ContinentCode")
	private String continentCode;

	public void setISOCode(String iSOCode){
		this.iSOCode = iSOCode;
	}

	public String getISOCode(){
		return iSOCode;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setID(int iD){
		this.iD = iD;
	}

	public int getID(){
		return iD;
	}

	public void setContinentCode(String continentCode){
		this.continentCode = continentCode;
	}

	public String getContinentCode(){
		return continentCode;
	}
}