package com.delapi.microserviceapp.model.atalantis;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tracking {
	 @JsonProperty("AWBNo") 
	    public String aWBNo;
	    @JsonProperty("BookingDate") 
	    public String bookingDate;
	    @JsonProperty("BookTime") 
	    public String bookTime;
	    @JsonProperty("BookingDate1") 
	    public String bookingDate1;
	    @JsonProperty("Origin") 
	    public String origin;
	    @JsonProperty("Destination") 
	    public String destination;
	    @JsonProperty("Consignee") 
	    public String consignee;
	    @JsonProperty("VendorName") 
	    public String vendorName;
	    @JsonProperty("VendorName2") 
	    public String vendorName2;
	    @JsonProperty("VendorAWBNo1") 
	    public String vendorAWBNo1;
	    @JsonProperty("VendorAWBNo2") 
	    public String vendorAWBNo2;
	    @JsonProperty("ServiceName") 
	    public String serviceName;
	    @JsonProperty("Status") 
	    public String status;
	    @JsonProperty("DeliveryDate") 
	    public String deliveryDate;
	    @JsonProperty("DeliveryTime") 
	    public String deliveryTime;
	    @JsonProperty("DeliveryDate1") 
	    public String deliveryDate1;
	    @JsonProperty("DeliveryTime1") 
	    public String deliveryTime1;
	    @JsonProperty("ReceiverName") 
	    public String receiverName;
	    @JsonProperty("Receivertelephone") 
	    public String receivertelephone;
	    @JsonProperty("PODImage") 
	    public String pODImage;
	    public String signatureexist;
	    public String photoexist;
	    @JsonProperty("ExpectedDeliveryDate") 
	    public String expectedDeliveryDate;
	    @JsonProperty("Shipper_Name") 
	    public String shipper_Name;
	    @JsonProperty("Remark") 
	    public String remark;
	    @JsonProperty("Origin_Country") 
	    public String origin_Country;
	    @JsonProperty("Destination_Country") 
	    public String destination_Country;
	    @JsonProperty("Weight") 
	    public String weight;
	    @JsonProperty("RefNo") 
	    public String refNo;
	    @JsonProperty("Vendor_Code") 
	    public String vendor_Code;
	    @JsonProperty("Vendor_Code1") 
	    public String vendor_Code1;
	    @JsonProperty("IsAddedToWatchList") 
	    public boolean isAddedToWatchList;
	    @JsonProperty("VendorLinkURL") 
	    public Object vendorLinkURL;
	    @JsonProperty("VendorLinkURL1") 
	    public Object vendorLinkURL1;
	    @JsonProperty("ReturnAWB") 
	    public String returnAWB;
	    @JsonProperty("HoldUnhold") 
	    public String holdUnhold;
	    @JsonProperty("HoldUnholdRemark") 
	    public String holdUnholdRemark;

	 public String getAwbNo() { return aWBNo; }
	 public void setAwbNo(String value) { this.aWBNo = value; }

	 public String getBookingDate() { return bookingDate; }
	 public void setBookingDate(String value) { this.bookingDate = value; }

	 public String getBookTime() { return bookTime; }
	 public void setBookTime(String value) { this.bookTime = value; }

	 public String getBookingDate1() { return bookingDate1; }
	 public void setBookingDate1(String value) { this.bookingDate1 = value; }

	 public String getOrigin() { return origin; }
	 public void setOrigin(String value) { this.origin = value; }

	 public String getDestination() { return destination; }
	 public void setDestination(String value) { this.destination = value; }

	 public String getConsignee() { return consignee; }
	 public void setConsignee(String value) { this.consignee = value; }

	 public String getVendorName() { return vendorName; }
	 public void setVendorName(String value) { this.vendorName = value; }

	 public String getVendorName2() { return vendorName2; }
	 public void setVendorName2(String value) { this.vendorName2 = value; }

	 public String getVendorAWBNo1() { return vendorAWBNo1; }
	 public void setVendorAWBNo1(String value) { this.vendorAWBNo1 = value; }

	 public String getVendorAWBNo2() { return vendorAWBNo2; }
	 public void setVendorAWBNo2(String value) { this.vendorAWBNo2 = value; }

	 public String getServiceName() { return serviceName; }
	 public void setServiceName(String value) { this.serviceName = value; }

	 public String getStatus() { return status; }
	 public void setStatus(String value) { this.status = value; }

	 public String getDeliveryDate() { return deliveryDate; }
	 public void setDeliveryDate(String value) { this.deliveryDate = value; }

	 public String getDeliveryTime() { return deliveryTime; }
	 public void setDeliveryTime(String value) { this.deliveryTime = value; }

	 public String getDeliveryDate1() { return deliveryDate1; }
	 public void setDeliveryDate1(String value) { this.deliveryDate1 = value; }

	 public String getDeliveryTime1() { return deliveryTime1; }
	 public void setDeliveryTime1(String value) { this.deliveryTime1 = value; }

	 public String getReceiverName() { return receiverName; }
	 public void setReceiverName(String value) { this.receiverName = value; }

	 public String getReceivertelephone() { return receivertelephone; }
	 public void setReceivertelephone(String value) { this.receivertelephone = value; }

	 public String getPodImage() { return pODImage; }
	 public void setPodImage(String value) { this.pODImage = value; }

	 public String getSignatureexist() { return signatureexist; }
	 public void setSignatureexist(String value) { this.signatureexist = value; }

	 public String getPhotoexist() { return photoexist; }
	 public void setPhotoexist(String value) { this.photoexist = value; }

	 public String getExpectedDeliveryDate() { return expectedDeliveryDate; }
	 public void setExpectedDeliveryDate(String value) { this.expectedDeliveryDate = value; }

	 public String getShipperName() { return shipper_Name; }
	 public void setShipperName(String value) { this.shipper_Name = value; }

	 public String getRemark() { return remark; }
	 public void setRemark(String value) { this.remark = value; }

	 public String getOriginCountry() { return origin_Country; }
	 public void setOriginCountry(String value) { this.origin_Country = value; }

	 public String getDestinationCountry() { return destination_Country; }
	 public void setDestinationCountry(String value) { this.destination_Country = value; }

	 public String getWeight() { return weight; }
	 public void setWeight(String value) { this.weight = value; }

	 public String getRefNo() { return refNo; }
	 public void setRefNo(String value) { this.refNo = value; }

	 public String getVendorCode() { return vendor_Code; }
	 public void setVendorCode(String value) { this.vendor_Code = value; }

	 public String getVendorCode1() { return vendor_Code1; }
	 public void setVendorCode1(String value) { this.vendor_Code1 = value; }

	 public boolean getIsAddedToWatchList() { return isAddedToWatchList; }
	 public void setIsAddedToWatchList(boolean value) { this.isAddedToWatchList = value; }

	 public Object getVendorLinkURL() { return vendorLinkURL; }
	 public void setVendorLinkURL(Object value) { this.vendorLinkURL = value; }

	 public Object getVendorLinkURL1() { return vendorLinkURL1; }
	 public void setVendorLinkURL1(Object value) { this.vendorLinkURL1 = value; }

	 public String getReturnAWB() { return returnAWB; }
	 public void setReturnAWB(String value) { this.returnAWB = value; }

	 public String getHoldUnhold() { return holdUnhold; }
	 public void setHoldUnhold(String value) { this.holdUnhold = value; }

	 public String getHoldUnholdRemark() { return holdUnholdRemark; }
	 public void setHoldUnholdRemark(String value) { this.holdUnholdRemark = value; }
	}
