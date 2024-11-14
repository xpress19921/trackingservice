package com.delapi.microserviceapp.model.delhivery;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Scan{
    @JsonProperty("ScanDetail") 
    public ScanDetail scanDetail;

	public ScanDetail getScanDetail() {
		return scanDetail;
	}

	public void setScanDetail(ScanDetail scanDetail) {
		this.scanDetail = scanDetail;
	}
}