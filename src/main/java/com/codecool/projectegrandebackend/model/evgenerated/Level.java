package com.codecool.projectegrandebackend.model.evgenerated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Level{

	@JsonProperty("IsFastChargeCapable")
	private boolean isFastChargeCapable;

	@JsonProperty("Comments")
	private String comments;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("ID")
	private int iD;

	public void setIsFastChargeCapable(boolean isFastChargeCapable){
		this.isFastChargeCapable = isFastChargeCapable;
	}

	public boolean isIsFastChargeCapable(){
		return isFastChargeCapable;
	}

	public void setComments(String comments){
		this.comments = comments;
	}

	public String getComments(){
		return comments;
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