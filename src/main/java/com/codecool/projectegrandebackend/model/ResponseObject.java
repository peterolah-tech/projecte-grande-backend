package com.codecool.projectegrandebackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;


// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
public class ResponseObject{

public class DataProviderStatusType {
    public boolean isProviderEnabled;
}

public class DataProvider {
    public String websiteURL;
    public DataProviderStatusType dataProviderStatusType;
    public boolean isRestrictedEdit;
    public boolean isOpenDataLicensed;
    public boolean isApprovedImport;
    public Object dateLastImported;
}

public class OperatorInfo {
    public String websiteURL;
    public Object phonePrimaryContact;
    public Object phoneSecondaryContact;
    public boolean isPrivateIndividual;
    public Object addressInfo;
    public Object bookingURL;
    public Object contactEmail;
    public Object faultReportEmail;
    public boolean isRestrictedEdit;
}

public class UsageType {
    public boolean isPayAtLocation;
    public boolean isMembershipRequired;
    public boolean isAccessKeyRequired;
}

public class StatusType {
    public boolean isOperational;
    public boolean isUserSelectable;
}

public class SubmissionStatus {
}

public class Country {
    public String continentCode;
}

public class AddressInfo {
    public String addressLine1;
    public Object addressLine2;
    public String stateOrProvince;
    public int countryID;
    public double longitude;
    public String contactTelephone1;
    public Object contactTelephone2;
    public Object contactEmail;
    public String accessComments;
    public String relatedURL;
    public int distanceUnit;
}

public class ConnectionType {
    public String formalName;
    public boolean isDiscontinued;
    public boolean isObsolete;
}

public class Level {
    public boolean isFastChargeCapable;
}

public class CurrentType {
    public String description;
}

public class Connection {
    public int connectionTypeID;
    public ConnectionType connectionType;
    public String reference;
    public int statusTypeID;
    public StatusType statusType;
    public int currentTypeID;
    public CurrentType currentType;
}

public class Root {
    public DataProvider dataProvider;
    public OperatorInfo operatorInfo;
    public UsageType usageType;
    public StatusType statusType;
    public SubmissionStatus submissionStatus;
    public Object userComments;
    public Object percentageSimilarity;
    public Object mediaItems;
    public boolean isRecentlyVerified;
    public Date dateLastVerified;
    public Object parentChargePointID;
    public int dataProviderID;
    public Object dataProvidersReference;
    public int operatorID;
    public Object operatorsReference;
    public int usageTypeID;
    public String usageCost;
    public AddressInfo addressInfo;
    public List<Connection> connections;
    public int numberOfPoints;
    public Object generalComments;
    public Object datePlanned;
    public Object dateLastConfirmed;
    public int statusTypeID;
    public Date dateLastStatusUpdate;
    public Object metadataValues;
    public int dataQualityLevel;
    public Date dateCreated;
    public int submissionStatusTypeID;
}

}

