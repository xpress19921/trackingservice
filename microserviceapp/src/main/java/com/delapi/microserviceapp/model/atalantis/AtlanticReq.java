package com.delapi.microserviceapp.model.atalantis;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AtlanticReq {
    @JsonProperty("UserID") 
    public String userID;
    @JsonProperty("Password") 
    public String password;
    @JsonProperty("AWBNo") 
    public String aWBNo;


	 // Getter Methods 

	  public String getUserID() {
	    return userID;
	  }

	  public String getPassword() {
	    return password;
	  }

	  public String getAWBNo() {
	    return aWBNo;
	  }

	 // Setter Methods 

	  public void setUserID( String UserID ) {
	    this.userID = UserID;
	  }

	  public void setPassword( String Password ) {
	    this.password = Password;
	  }

	  public void setAWBNo( String AWBNo ) {
	    this.aWBNo = AWBNo;
	  }
	}