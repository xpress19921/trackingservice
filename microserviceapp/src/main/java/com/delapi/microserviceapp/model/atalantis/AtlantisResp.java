package com.delapi.microserviceapp.model.atalantis;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AtlantisResp {
    @JsonProperty("Response") 
    public Response response;

	 public Response getResponse() { return response; }
	 public void setResponse(Response value) { this.response = value; }
}