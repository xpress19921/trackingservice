package com.delapi.microserviceapp.model.atalantis;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    @JsonProperty("ResponseCode") 
    public String responseCode;
    @JsonProperty("ErrorCode") 
    public String errorCode;
    @JsonProperty("ErrorDisc") 
    public String errorDisc;
    @JsonProperty("Tracking") 
    public Tracking[] tracking;
    @JsonProperty("Events") 
    public Event[] events;
    @JsonProperty("AdditionalData") 
    public Object[] additionalData;
    @JsonProperty("Dimensions") 
    public Object[] dimensions;
    @JsonProperty("Performa") 
    public Object[] performa;
	 public String getResponseCode() { return responseCode; }
	 public void setResponseCode(String value) { this.responseCode = value; }

	 public String getErrorCode() { return errorCode; }
	 public void setErrorCode(String value) { this.errorCode = value; }

	 public String getErrorDisc() { return errorDisc; }
	 public void setErrorDisc(String value) { this.errorDisc = value; }

	 public Tracking[] getTracking() { return tracking; }
	 public void setTracking(Tracking[] value) { this.tracking = value; }

	 public Event[] getEvents() { return events; }
	 public void setEvents(Event[] value) { this.events = value; }

	 public Object[] getAdditionalData() { return additionalData; }
	 public void setAdditionalData(Object[] value) { this.additionalData = value; }

	 public Object[] getDimensions() { return dimensions; }
	 public void setDimensions(Object[] value) { this.dimensions = value; }

	 public Object[] getPerforma() { return performa; }
	 public void setPerforma(Object[] value) { this.performa = value; }
	}