package com.codecool.projectegrandebackend.model.generated.ev;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OperatorInfo{

	@JsonProperty("IsPrivateIndividual")
	private boolean isPrivateIndividual;

	@JsonProperty("IsRestrictedEdit")
	private boolean isRestrictedEdit;

	@JsonProperty("PhonePrimaryContact")
	private Object phonePrimaryContact;

	@JsonProperty("BookingURL")
	private Object bookingURL;

	@JsonProperty("Comments")
	private Object comments;

	@JsonProperty("WebsiteURL")
	private String websiteURL;

	@JsonProperty("FaultReportEmail")
	private Object faultReportEmail;

	@JsonProperty("ContactEmail")
	private Object contactEmail;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("ID")
	private int iD;

	@JsonProperty("PhoneSecondaryContact")
	private Object phoneSecondaryContact;

	@JsonProperty("AddressInfo")
	private Object addressInfo;

	public void setIsPrivateIndividual(boolean isPrivateIndividual){
		this.isPrivateIndividual = isPrivateIndividual;
	}

	public boolean isIsPrivateIndividual(){
		return isPrivateIndividual;
	}

	public void setIsRestrictedEdit(boolean isRestrictedEdit){
		this.isRestrictedEdit = isRestrictedEdit;
	}

	public boolean isIsRestrictedEdit(){
		return isRestrictedEdit;
	}

	public void setPhonePrimaryContact(Object phonePrimaryContact){
		this.phonePrimaryContact = phonePrimaryContact;
	}

	public Object getPhonePrimaryContact(){
		return phonePrimaryContact;
	}

	public void setBookingURL(Object bookingURL){
		this.bookingURL = bookingURL;
	}

	public Object getBookingURL(){
		return bookingURL;
	}

	public void setComments(Object comments){
		this.comments = comments;
	}

	public Object getComments(){
		return comments;
	}

	public void setWebsiteURL(String websiteURL){
		this.websiteURL = websiteURL;
	}

	public String getWebsiteURL(){
		return websiteURL;
	}

	public void setFaultReportEmail(Object faultReportEmail){
		this.faultReportEmail = faultReportEmail;
	}

	public Object getFaultReportEmail(){
		return faultReportEmail;
	}

	public void setContactEmail(Object contactEmail){
		this.contactEmail = contactEmail;
	}

	public Object getContactEmail(){
		return contactEmail;
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

	public void setPhoneSecondaryContact(Object phoneSecondaryContact){
		this.phoneSecondaryContact = phoneSecondaryContact;
	}

	public Object getPhoneSecondaryContact(){
		return phoneSecondaryContact;
	}

	public void setAddressInfo(Object addressInfo){
		this.addressInfo = addressInfo;
	}

	public Object getAddressInfo(){
		return addressInfo;
	}
}