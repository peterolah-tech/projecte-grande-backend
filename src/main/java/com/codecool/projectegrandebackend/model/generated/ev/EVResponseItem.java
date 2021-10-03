package com.codecool.projectegrandebackend.model.generated.ev;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EVResponseItem{

	@JsonProperty("Connections")
	private List<ConnectionsItem> connections;

	@JsonProperty("NumberOfPoints")
	private int numberOfPoints;

	@JsonProperty("UsageTypeID")
	private int usageTypeID;

	@JsonProperty("DateCreated")
	private String dateCreated;

	@JsonProperty("OperatorID")
	private int operatorID;

	@JsonProperty("UsageType")
	private UsageType usageType;

	@JsonProperty("SubmissionStatusTypeID")
	private int submissionStatusTypeID;

	@JsonProperty("DataProvider")
	private DataProvider dataProvider;

	@JsonProperty("SubmissionStatus")
	private SubmissionStatus submissionStatus;

	@JsonProperty("DataQualityLevel")
	private int dataQualityLevel;

	@JsonProperty("IsRecentlyVerified")
	private boolean isRecentlyVerified;

	@JsonProperty("DateLastStatusUpdate")
	private String dateLastStatusUpdate;

	@JsonProperty("OperatorInfo")
	private OperatorInfo operatorInfo;

	@JsonProperty("PercentageSimilarity")
	private Object percentageSimilarity;

	@JsonProperty("ID")
	private int iD;

	@JsonProperty("UUID")
	private String uUID;

	@JsonProperty("StatusTypeID")
	private int statusTypeID;

	@JsonProperty("DateLastVerified")
	private String dateLastVerified;

	@JsonProperty("UsageCost")
	private Object usageCost;

	@JsonProperty("UserComments")
	private Object userComments;

	@JsonProperty("DatePlanned")
	private Object datePlanned;

	@JsonProperty("GeneralComments")
	private Object generalComments;

	@JsonProperty("MediaItems")
	private Object mediaItems;

	@JsonProperty("DataProvidersReference")
	private Object dataProvidersReference;

	@JsonProperty("MetadataValues")
	private Object metadataValues;

	@JsonProperty("ParentChargePointID")
	private Object parentChargePointID;

	@JsonProperty("AddressInfo")
	private AddressInfo addressInfo;

	@JsonProperty("OperatorsReference")
	private Object operatorsReference;

	@JsonProperty("DateLastConfirmed")
	private Object dateLastConfirmed;

	@JsonProperty("StatusType")
	private StatusType statusType;

	@JsonProperty("DataProviderID")
	private int dataProviderID;

	public void setConnections(List<ConnectionsItem> connections){
		this.connections = connections;
	}

	public List<ConnectionsItem> getConnections(){
		return connections;
	}

	public void setNumberOfPoints(int numberOfPoints){
		this.numberOfPoints = numberOfPoints;
	}

	public int getNumberOfPoints(){
		return numberOfPoints;
	}

	public void setUsageTypeID(int usageTypeID){
		this.usageTypeID = usageTypeID;
	}

	public int getUsageTypeID(){
		return usageTypeID;
	}

	public void setDateCreated(String dateCreated){
		this.dateCreated = dateCreated;
	}

	public String getDateCreated(){
		return dateCreated;
	}

	public void setOperatorID(int operatorID){
		this.operatorID = operatorID;
	}

	public int getOperatorID(){
		return operatorID;
	}

	public void setUsageType(UsageType usageType){
		this.usageType = usageType;
	}

	public UsageType getUsageType(){
		return usageType;
	}

	public void setSubmissionStatusTypeID(int submissionStatusTypeID){
		this.submissionStatusTypeID = submissionStatusTypeID;
	}

	public int getSubmissionStatusTypeID(){
		return submissionStatusTypeID;
	}

	public void setDataProvider(DataProvider dataProvider){
		this.dataProvider = dataProvider;
	}

	public DataProvider getDataProvider(){
		return dataProvider;
	}

	public void setSubmissionStatus(SubmissionStatus submissionStatus){
		this.submissionStatus = submissionStatus;
	}

	public SubmissionStatus getSubmissionStatus(){
		return submissionStatus;
	}

	public void setDataQualityLevel(int dataQualityLevel){
		this.dataQualityLevel = dataQualityLevel;
	}

	public int getDataQualityLevel(){
		return dataQualityLevel;
	}

	public void setIsRecentlyVerified(boolean isRecentlyVerified){
		this.isRecentlyVerified = isRecentlyVerified;
	}

	public boolean isIsRecentlyVerified(){
		return isRecentlyVerified;
	}

	public void setDateLastStatusUpdate(String dateLastStatusUpdate){
		this.dateLastStatusUpdate = dateLastStatusUpdate;
	}

	public String getDateLastStatusUpdate(){
		return dateLastStatusUpdate;
	}

	public void setOperatorInfo(OperatorInfo operatorInfo){
		this.operatorInfo = operatorInfo;
	}

	public OperatorInfo getOperatorInfo(){
		return operatorInfo;
	}

	public void setPercentageSimilarity(Object percentageSimilarity){
		this.percentageSimilarity = percentageSimilarity;
	}

	public Object getPercentageSimilarity(){
		return percentageSimilarity;
	}

	public void setID(int iD){
		this.iD = iD;
	}

	public int getID(){
		return iD;
	}

	public void setUUID(String uUID){
		this.uUID = uUID;
	}

	public String getUUID(){
		return uUID;
	}

	public void setStatusTypeID(int statusTypeID){
		this.statusTypeID = statusTypeID;
	}

	public int getStatusTypeID(){
		return statusTypeID;
	}

	public void setDateLastVerified(String dateLastVerified){
		this.dateLastVerified = dateLastVerified;
	}

	public String getDateLastVerified(){
		return dateLastVerified;
	}

	public void setUsageCost(Object usageCost){
		this.usageCost = usageCost;
	}

	public Object getUsageCost(){
		return usageCost;
	}

	public void setUserComments(Object userComments){
		this.userComments = userComments;
	}

	public Object getUserComments(){
		return userComments;
	}

	public void setDatePlanned(Object datePlanned){
		this.datePlanned = datePlanned;
	}

	public Object getDatePlanned(){
		return datePlanned;
	}

	public void setGeneralComments(Object generalComments){
		this.generalComments = generalComments;
	}

	public Object getGeneralComments(){
		return generalComments;
	}

	public void setMediaItems(Object mediaItems){
		this.mediaItems = mediaItems;
	}

	public Object getMediaItems(){
		return mediaItems;
	}

	public void setDataProvidersReference(Object dataProvidersReference){
		this.dataProvidersReference = dataProvidersReference;
	}

	public Object getDataProvidersReference(){
		return dataProvidersReference;
	}

	public void setMetadataValues(Object metadataValues){
		this.metadataValues = metadataValues;
	}

	public Object getMetadataValues(){
		return metadataValues;
	}

	public void setParentChargePointID(Object parentChargePointID){
		this.parentChargePointID = parentChargePointID;
	}

	public Object getParentChargePointID(){
		return parentChargePointID;
	}

	public void setAddressInfo(AddressInfo addressInfo){
		this.addressInfo = addressInfo;
	}

	public AddressInfo getAddressInfo(){
		return addressInfo;
	}

	public void setOperatorsReference(Object operatorsReference){
		this.operatorsReference = operatorsReference;
	}

	public Object getOperatorsReference(){
		return operatorsReference;
	}

	public void setDateLastConfirmed(Object dateLastConfirmed){
		this.dateLastConfirmed = dateLastConfirmed;
	}

	public Object getDateLastConfirmed(){
		return dateLastConfirmed;
	}

	public void setStatusType(StatusType statusType){
		this.statusType = statusType;
	}

	public StatusType getStatusType(){
		return statusType;
	}

	public void setDataProviderID(int dataProviderID){
		this.dataProviderID = dataProviderID;
	}

	public int getDataProviderID(){
		return dataProviderID;
	}
}