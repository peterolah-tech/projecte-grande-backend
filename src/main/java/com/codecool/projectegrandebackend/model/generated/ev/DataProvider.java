package com.codecool.projectegrandebackend.model.generated.ev;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataProvider{

	@JsonProperty("IsRestrictedEdit")
	private boolean isRestrictedEdit;

	@JsonProperty("Comments")
	private Object comments;

	@JsonProperty("WebsiteURL")
	private String websiteURL;

	@JsonProperty("License")
	private String license;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("ID")
	private int iD;

	@JsonProperty("DataProviderStatusType")
	private DataProviderStatusType dataProviderStatusType;

	@JsonProperty("IsApprovedImport")
	private boolean isApprovedImport;

	@JsonProperty("DateLastImported")
	private Object dateLastImported;

	@JsonProperty("IsOpenDataLicensed")
	private boolean isOpenDataLicensed;

	public void setIsRestrictedEdit(boolean isRestrictedEdit){
		this.isRestrictedEdit = isRestrictedEdit;
	}

	public boolean isIsRestrictedEdit(){
		return isRestrictedEdit;
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

	public void setLicense(String license){
		this.license = license;
	}

	public String getLicense(){
		return license;
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

	public void setDataProviderStatusType(DataProviderStatusType dataProviderStatusType){
		this.dataProviderStatusType = dataProviderStatusType;
	}

	public DataProviderStatusType getDataProviderStatusType(){
		return dataProviderStatusType;
	}

	public void setIsApprovedImport(boolean isApprovedImport){
		this.isApprovedImport = isApprovedImport;
	}

	public boolean isIsApprovedImport(){
		return isApprovedImport;
	}

	public void setDateLastImported(Object dateLastImported){
		this.dateLastImported = dateLastImported;
	}

	public Object getDateLastImported(){
		return dateLastImported;
	}

	public void setIsOpenDataLicensed(boolean isOpenDataLicensed){
		this.isOpenDataLicensed = isOpenDataLicensed;
	}

	public boolean isIsOpenDataLicensed(){
		return isOpenDataLicensed;
	}
}