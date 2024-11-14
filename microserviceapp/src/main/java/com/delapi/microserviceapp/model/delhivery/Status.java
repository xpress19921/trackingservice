package com.delapi.microserviceapp.model.delhivery;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status{
    @JsonProperty("Status") 
    public String status;
    @JsonProperty("StatusLocation") 
    public String statusLocation;
    @JsonProperty("StatusDateTime") 
    public String statusDateTime;
    @JsonProperty("RecievedBy") 
    public String recievedBy;
    @JsonProperty("StatusCode") 
    public String statusCode;
    @JsonProperty("StatusType") 
    public String statusType;
    @JsonProperty("Instructions") 
    public String instructions;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusLocation() {
		return statusLocation;
	}
	public void setStatusLocation(String statusLocation) {
		this.statusLocation = statusLocation;
	}
	public String getStatusDateTime() {
		return statusDateTime;
	}
	public void setStatusDateTime(String statusDateTime) {
		this.statusDateTime = statusDateTime;
	}
	public String getRecievedBy() {
		return recievedBy;
	}
	public void setRecievedBy(String recievedBy) {
		this.recievedBy = recievedBy;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusType() {
		return statusType;
	}
	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
    
    
}

