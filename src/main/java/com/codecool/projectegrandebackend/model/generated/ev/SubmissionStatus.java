package com.codecool.projectegrandebackend.model.generated.ev;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubmissionStatus{

	@JsonProperty("Title")
	private String title;

	@JsonProperty("ID")
	private int iD;

	@JsonProperty("IsLive")
	private boolean isLive;

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

	public void setIsLive(boolean isLive){
		this.isLive = isLive;
	}

	public boolean isIsLive(){
		return isLive;
	}
}