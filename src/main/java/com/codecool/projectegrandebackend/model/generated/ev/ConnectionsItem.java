package com.codecool.projectegrandebackend.model.generated.ev;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectionsItem{

	@JsonProperty("CurrentTypeID")
	private int currentTypeID;

	@JsonProperty("ConnectionType")
	private ConnectionType connectionType;

	@JsonProperty("Reference")
	private Object reference;

	@JsonProperty("Comments")
	private Object comments;

	@JsonProperty("PowerKW")
	private double powerKW;

	@JsonProperty("Quantity")
	private int quantity;

	@JsonProperty("Amps")
	private int amps;

	@JsonProperty("CurrentType")
	private CurrentType currentType;

	@JsonProperty("StatusType")
	private StatusType statusType;

	@JsonProperty("Voltage")
	private int voltage;

	@JsonProperty("Level")
	private Level level;

	@JsonProperty("ID")
	private int iD;

	@JsonProperty("ConnectionTypeID")
	private int connectionTypeID;

	@JsonProperty("StatusTypeID")
	private int statusTypeID;

	@JsonProperty("LevelID")
	private int levelID;

	public void setCurrentTypeID(int currentTypeID){
		this.currentTypeID = currentTypeID;
	}

	public int getCurrentTypeID(){
		return currentTypeID;
	}

	public void setConnectionType(ConnectionType connectionType){
		this.connectionType = connectionType;
	}

	public ConnectionType getConnectionType(){
		return connectionType;
	}

	public void setReference(Object reference){
		this.reference = reference;
	}

	public Object getReference(){
		return reference;
	}

	public void setComments(Object comments){
		this.comments = comments;
	}

	public Object getComments(){
		return comments;
	}

	public void setPowerKW(double powerKW){
		this.powerKW = powerKW;
	}

	public double getPowerKW(){
		return powerKW;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setAmps(int amps){
		this.amps = amps;
	}

	public int getAmps(){
		return amps;
	}

	public void setCurrentType(CurrentType currentType){
		this.currentType = currentType;
	}

	public CurrentType getCurrentType(){
		return currentType;
	}

	public void setStatusType(StatusType statusType){
		this.statusType = statusType;
	}

	public StatusType getStatusType(){
		return statusType;
	}

	public void setVoltage(int voltage){
		this.voltage = voltage;
	}

	public int getVoltage(){
		return voltage;
	}

	public void setLevel(Level level){
		this.level = level;
	}

	public Level getLevel(){
		return level;
	}

	public void setID(int iD){
		this.iD = iD;
	}

	public int getID(){
		return iD;
	}

	public void setConnectionTypeID(int connectionTypeID){
		this.connectionTypeID = connectionTypeID;
	}

	public int getConnectionTypeID(){
		return connectionTypeID;
	}

	public void setStatusTypeID(int statusTypeID){
		this.statusTypeID = statusTypeID;
	}

	public int getStatusTypeID(){
		return statusTypeID;
	}

	public void setLevelID(int levelID){
		this.levelID = levelID;
	}

	public int getLevelID(){
		return levelID;
	}
}