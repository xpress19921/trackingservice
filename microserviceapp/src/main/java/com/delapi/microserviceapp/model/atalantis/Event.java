package com.delapi.microserviceapp.model.atalantis;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {
	 @JsonProperty("EventDate") 
	    public String eventDate;
	    @JsonProperty("EventTime") 
	    public String eventTime;
	    @JsonProperty("EventDate1") 
	    public String eventDate1;
	    @JsonProperty("EventTime1") 
	    public String eventTime1;
	    @JsonProperty("Location") 
	    public String location;
	    @JsonProperty("Status") 
	    public String status;
	    @JsonProperty("FlightCode") 
	    public String flightCode;
	    @JsonProperty("FlightName") 
	    public String flightName;

	 public String getEventDate() { return eventDate; }
	 public void setEventDate(String value) { this.eventDate = value; }

	 public String getEventTime() { return eventTime; }
	 public void setEventTime(String value) { this.eventTime = value; }

	 public String getEventDate1() { return eventDate1; }
	 public void setEventDate1(String value) { this.eventDate1 = value; }

	 public String getEventTime1() { return eventTime1; }
	 public void setEventTime1(String value) { this.eventTime1 = value; }

	 public String getLocation() { return location; }
	 public void setLocation(String value) { this.location = value; }

	 public String getStatus() { return status; }
	 public void setStatus(String value) { this.status = value; }

	 public String getFlightCode() { return flightCode; }
	 public void setFlightCode(String value) { this.flightCode = value; }

	 public String getFlightName() { return flightName; }
	 public void setFlightName(String value) { this.flightName = value; }
	}