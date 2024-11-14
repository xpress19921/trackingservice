package com.delapi.microserviceapp.model.delhivery;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScanDetail{
    @JsonProperty("ScanDateTime") 
    public String scanDateTime;
    @JsonProperty("ScanType") 
    public String scanType;
    @JsonProperty("Scan") 
    public String scan;
    @JsonProperty("StatusDateTime") 
    public String statusDateTime;
    @JsonProperty("ScannedLocation") 
    public String scannedLocation;
    @JsonProperty("StatusCode") 
    public String statusCode;
    @JsonProperty("Instructions") 
    public String instructions;
	public String getScanDateTime() {
		return scanDateTime;
	}
	public void setScanDateTime(String scanDateTime) {
		this.scanDateTime = scanDateTime;
	}
	public String getScanType() {
		return scanType;
	}
	public void setScanType(String scanType) {
		this.scanType = scanType;
	}
	public String getScan() {
		return scan;
	}
	public void setScan(String scan) {
		this.scan = scan;
	}
	public String getStatusDateTime() {
		return statusDateTime;
	}
	public void setStatusDateTime(String statusDateTime) {
		this.statusDateTime = statusDateTime;
	}
	public String getScannedLocation() {
		return scannedLocation;
	}
	public void setScannedLocation(String scannedLocation) {
		this.scannedLocation = scannedLocation;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
    
    
}