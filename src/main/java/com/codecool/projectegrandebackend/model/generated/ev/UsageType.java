package com.codecool.projectegrandebackend.model.generated.ev;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsageType{

	@JsonProperty("IsMembershipRequired")
	private boolean isMembershipRequired;

	@JsonProperty("IsPayAtLocation")
	private boolean isPayAtLocation;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("IsAccessKeyRequired")
	private boolean isAccessKeyRequired;

	@JsonProperty("ID")
	private int iD;

	public void setIsMembershipRequired(boolean isMembershipRequired){
		this.isMembershipRequired = isMembershipRequired;
	}

	public boolean isIsMembershipRequired(){
		return isMembershipRequired;
	}

	public void setIsPayAtLocation(boolean isPayAtLocation){
		this.isPayAtLocation = isPayAtLocation;
	}

	public boolean isIsPayAtLocation(){
		return isPayAtLocation;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setIsAccessKeyRequired(boolean isAccessKeyRequired){
		this.isAccessKeyRequired = isAccessKeyRequired;
	}

	public boolean isIsAccessKeyRequired(){
		return isAccessKeyRequired;
	}

	public void setID(int iD){
		this.iD = iD;
	}

	public int getID(){
		return iD;
	}
}