package ph.com.ibm.cvp;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ClientVisit {

	@Id String id;
	
	String locationCode;
	
	String locationName; 
	
	String reqCountry; 
	
	String reqCountryCode; 
	
	String currency; 
	
	String currencyCode; 
	
	String department; 
	
	String reqManager; 
	
	String financeRep; 
	
	String division; 
	
	String major; 
	
	String minor; 
	
	String subMinor; 
	
	String departmentNo; 
	
	String igsProject;
	
	List<String> ibmVisitors;
	
	List<String> clientVisitors;
	
	List<String> topicsOfInterests;
	
	List<String> dealBackgrounds;
	
	List<String> keyMessages;
    
	String iteneraries;

	String foodPreferences;
	
	String tips;
	
	String status;
	
	String dateSubmitted;
	
	String dateUpdated;
    
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(String dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public String getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getReqCountry() {
		return reqCountry;
	}

	public void setReqCountry(String reqCountry) {
		this.reqCountry = reqCountry;
	}

	public String getReqCountryCode() {
		return reqCountryCode;
	}

	public void setReqCountryCode(String reqCountryCode) {
		this.reqCountryCode = reqCountryCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getReqManager() {
		return reqManager;
	}

	public void setReqManager(String reqManager) {
		this.reqManager = reqManager;
	}

	public String getFinanceRep() {
		return financeRep;
	}

	public void setFinanceRep(String financeRep) {
		this.financeRep = financeRep;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	public String getSubMinor() {
		return subMinor;
	}

	public void setSubMinor(String subMinor) {
		this.subMinor = subMinor;
	}

	public String getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}

	public String getIgsProject() {
		return igsProject;
	}

	public void setIgsProject(String igsProject) {
		this.igsProject = igsProject;
	}

	public List<String> getIbmVisitors() {
		return ibmVisitors;
	}

	public void setIbmVisitors(List<String> ibmVisitors) {
		this.ibmVisitors = ibmVisitors;
	}

	public List<String> getClientVisitors() {
		return clientVisitors;
	}

	public void setClientVisitors(List<String> clientVisitors) {
		this.clientVisitors = clientVisitors;
	}

	public List<String> getTopicsOfInterests() {
		return topicsOfInterests;
	}

	public void setTopicsOfInterests(List<String> topicsOfInterests) {
		this.topicsOfInterests = topicsOfInterests;
	}

	public List<String> getDealBackgrounds() {
		return dealBackgrounds;
	}

	public void setDealBackgrounds(List<String> dealBackgrounds) {
		this.dealBackgrounds = dealBackgrounds;
	}

	public List<String> getKeyMessages() {
		return keyMessages;
	}

	public void setKeyMessages(List<String> keyMessages) {
		this.keyMessages = keyMessages;
	}

	public String getIteneraries() {
		return iteneraries;
	}

	public void setIteneraries(String iteneraries) {
		this.iteneraries = iteneraries;
	}

	public String getFoodPreferences() {
		return foodPreferences;
	}

	public void setFoodPreferences(String foodPreferences) {
		this.foodPreferences = foodPreferences;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	
}
