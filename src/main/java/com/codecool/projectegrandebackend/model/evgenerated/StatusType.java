package com.codecool.projectegrandebackend.model.evgenerated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatusType{

	@JsonProperty("IsUserSelectable")
	private boolean isUserSelectable;

	@JsonProperty("IsOperational")
	private boolean isOperational;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("ID")
	private int iD;

	public void setIsUserSelectable(boolean isUserSelectable){
		this.isUserSelectable = isUserSelectable;
	}

	public boolean isIsUserSelectable(){
		return isUserSelectable;
	}

	public void setIsOperational(boolean isOperational){
		this.isOperational = isOperational;
	}

	public boolean isIsOperational(){
		return isOperational;
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
}