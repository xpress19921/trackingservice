package com.delapi.microserviceapp.model.delhivery;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Consignee{
    @JsonProperty("City") 
    public String city;
    @JsonProperty("Name") 
    public String name;
    @JsonProperty("Address1") 
    public Object[] address1;
    public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object[] getAddress1() {
		return address1;
	}
	public void setAddress1(Object[] address1) {
		this.address1 = address1;
	}
	public Object[] getAddress2() {
		return address2;
	}
	public void setAddress2(Object[] address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTelephone2() {
		return telephone2;
	}
	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTelephone1() {
		return telephone1;
	}
	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}
	@JsonProperty("Address2") 
    public Object[] address2;
    @JsonProperty("Address3") 
    public String address3;
    @JsonProperty("PinCode") 
    public int pinCode;
    @JsonProperty("State") 
    public String state;
    @JsonProperty("Telephone2") 
    public String telephone2;
    @JsonProperty("Country") 
    public String country;
    @JsonProperty("Telephone1") 
    public String telephone1;
}