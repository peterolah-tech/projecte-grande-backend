package com.codecool.projectegrandebackend.model.generated.ev;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataProviderStatusType{

	@JsonProperty("Title")
	private String title;

	@JsonProperty("ID")
	private int iD;

	@JsonProperty("IsProviderEnabled")
	private boolean isProviderEnabled;

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

	public void setIsProviderEnabled(boolean isProviderEnabled){
		this.isProviderEnabled = isProviderEnabled;
	}

	public boolean isIsProviderEnabled(){
		return isProviderEnabled;
	}
}