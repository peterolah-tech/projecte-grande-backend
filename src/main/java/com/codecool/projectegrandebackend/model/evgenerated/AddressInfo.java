package com.codecool.projectegrandebackend.model.evgenerated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressInfo{

	@JsonProperty("CountryID")
	private int countryID;

	@JsonProperty("ContactTelephone2")
	private Object contactTelephone2;

	@JsonProperty("ContactTelephone1")
	private Object contactTelephone1;

	@JsonProperty("StateOrProvince")
	private String stateOrProvince;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("Latitude")
	private double latitude;

	@JsonProperty("Postcode")
	private String postcode;

	@JsonProperty("Longitude")
	private double longitude;

	@JsonProperty("AccessComments")
	private Object accessComments;

	@JsonProperty("AddressLine2")
	private Object addressLine2;

	@JsonProperty("AddressLine1")
	private String addressLine1;

	@JsonProperty("Town")
	private String town;

	@JsonProperty("RelatedURL")
	private Object relatedURL;

	@JsonProperty("Country")
	private Country country;

	@JsonProperty("ContactEmail")
	private Object contactEmail;

	@JsonProperty("ID")
	private int iD;

	@JsonProperty("DistanceUnit")
	private int distanceUnit;

	@JsonProperty("Distance")
	private Object distance;

	public void setCountryID(int countryID){
		this.countryID = countryID;
	}

	public int getCountryID(){
		return countryID;
	}

	public void setContactTelephone2(Object contactTelephone2){
		this.contactTelephone2 = contactTelephone2;
	}

	public Object getContactTelephone2(){
		return contactTelephone2;
	}

	public void setContactTelephone1(Object contactTelephone1){
		this.contactTelephone1 = contactTelephone1;
	}

	public Object getContactTelephone1(){
		return contactTelephone1;
	}

	public void setStateOrProvince(String stateOrProvince){
		this.stateOrProvince = stateOrProvince;
	}

	public String getStateOrProvince(){
		return stateOrProvince;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLatitude(){
		return latitude;
	}

	public void setPostcode(String postcode){
		this.postcode = postcode;
	}

	public String getPostcode(){
		return postcode;
	}

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}

	public void setAccessComments(Object accessComments){
		this.accessComments = accessComments;
	}

	public Object getAccessComments(){
		return accessComments;
	}

	public void setAddressLine2(Object addressLine2){
		this.addressLine2 = addressLine2;
	}

	public Object getAddressLine2(){
		return addressLine2;
	}

	public void setAddressLine1(String addressLine1){
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine1(){
		return addressLine1;
	}

	public void setTown(String town){
		this.town = town;
	}

	public String getTown(){
		return town;
	}

	public void setRelatedURL(Object relatedURL){
		this.relatedURL = relatedURL;
	}

	public Object getRelatedURL(){
		return relatedURL;
	}

	public void setCountry(Country country){
		this.country = country;
	}

	public Country getCountry(){
		return country;
	}

	public void setContactEmail(Object contactEmail){
		this.contactEmail = contactEmail;
	}

	public Object getContactEmail(){
		return contactEmail;
	}

	public void setID(int iD){
		this.iD = iD;
	}

	public int getID(){
		return iD;
	}

	public void setDistanceUnit(int distanceUnit){
		this.distanceUnit = distanceUnit;
	}

	public int getDistanceUnit(){
		return distanceUnit;
	}

	public void setDistance(Object distance){
		this.distance = distance;
	}

	public Object getDistance(){
		return distance;
	}
}