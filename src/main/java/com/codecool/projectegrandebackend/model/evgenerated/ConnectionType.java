package com.codecool.projectegrandebackend.model.evgenerated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectionType{

	@JsonProperty("IsDiscontinued")
	private boolean isDiscontinued;

	@JsonProperty("FormalName")
	private String formalName;

	@JsonProperty("IsObsolete")
	private boolean isObsolete;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("ID")
	private int iD;

	public void setIsDiscontinued(boolean isDiscontinued){
		this.isDiscontinued = isDiscontinued;
	}

	public boolean isIsDiscontinued(){
		return isDiscontinued;
	}

	public void setFormalName(String formalName){
		this.formalName = formalName;
	}

	public String getFormalName(){
		return formalName;
	}

	public void setIsObsolete(boolean isObsolete){
		this.isObsolete = isObsolete;
	}

	public boolean isIsObsolete(){
		return isObsolete;
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