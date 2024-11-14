package com.delapi.microserviceapp.model.delhivery;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Shipment{
    @JsonProperty("PickUpDate") 
    public String pickUpDate;
    @JsonProperty("Destination") 
    public String destination;
    @JsonProperty("DestRecieveDate") 
    public Object destRecieveDate;
    @JsonProperty("Scans") 
    public Scan[] scans;
    @JsonProperty("Status") 
    public Status status;
    @JsonProperty("ReturnPromisedDeliveryDate") 
    public Object returnPromisedDeliveryDate;
    @JsonProperty("Ewaybill") 
    public Object[] ewaybill;
    @JsonProperty("InvoiceAmount") 
    public int invoiceAmount;
    @JsonProperty("ChargedWeight") 
    public Object chargedWeight;
    @JsonProperty("PickedupDate") 
    public String pickedupDate;
    @JsonProperty("DeliveryDate") 
    public Object deliveryDate;
    @JsonProperty("SenderName") 
    public String senderName;
    @JsonProperty("AWB") 
    public String aWB;
    @JsonProperty("DispatchCount") 
    public int dispatchCount;
    @JsonProperty("OrderType") 
    public String orderType;
    @JsonProperty("ReturnedDate") 
    public Object returnedDate;
    @JsonProperty("ExpectedDeliveryDate") 
    public String expectedDeliveryDate;
    @JsonProperty("RTOStartedDate") 
    public Object rTOStartedDate;
    @JsonProperty("Extras") 
    public String extras;
    @JsonProperty("FirstAttemptDate") 
    public Object firstAttemptDate;
    @JsonProperty("ReverseInTransit") 
    public boolean reverseInTransit;
    @JsonProperty("Quantity") 
    public String quantity;
    @JsonProperty("Origin") 
    public String origin;
    @JsonProperty("Consignee") 
    public Consignee consignee;
    @JsonProperty("ReferenceNo") 
    public String referenceNo;
    @JsonProperty("OutDestinationDate") 
    public String outDestinationDate;
    @JsonProperty("CODAmount") 
    public int cODAmount;
    @JsonProperty("PromisedDeliveryDate") 
    public String promisedDeliveryDate;
    @JsonProperty("PickupLocation") 
    public String pickupLocation;
    @JsonProperty("OriginRecieveDate") 
    public String originRecieveDate;
    public String getPickUpDate() {
		return pickUpDate;
	}
	public void setPickUpDate(String pickUpDate) {
		this.pickUpDate = pickUpDate;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Object getDestRecieveDate() {
		return destRecieveDate;
	}
	public void setDestRecieveDate(Object destRecieveDate) {
		this.destRecieveDate = destRecieveDate;
	}
	public Scan[] getScans() {
		return scans;
	}
	public void setScans(Scan[] scans) {
		this.scans = scans;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Object getReturnPromisedDeliveryDate() {
		return returnPromisedDeliveryDate;
	}
	public void setReturnPromisedDeliveryDate(Object returnPromisedDeliveryDate) {
		this.returnPromisedDeliveryDate = returnPromisedDeliveryDate;
	}
	public Object[] getEwaybill() {
		return ewaybill;
	}
	public void setEwaybill(Object[] ewaybill) {
		this.ewaybill = ewaybill;
	}
	public int getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(int invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public Object getChargedWeight() {
		return chargedWeight;
	}
	public void setChargedWeight(Object chargedWeight) {
		this.chargedWeight = chargedWeight;
	}
	public String getPickedupDate() {
		return pickedupDate;
	}
	public void setPickedupDate(String pickedupDate) {
		this.pickedupDate = pickedupDate;
	}
	public Object getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Object deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getaWB() {
		return aWB;
	}
	public void setaWB(String aWB) {
		this.aWB = aWB;
	}
	public int getDispatchCount() {
		return dispatchCount;
	}
	public void setDispatchCount(int dispatchCount) {
		this.dispatchCount = dispatchCount;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Object getReturnedDate() {
		return returnedDate;
	}
	public void setReturnedDate(Object returnedDate) {
		this.returnedDate = returnedDate;
	}
	public String getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}
	public void setExpectedDeliveryDate(String expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}
	public Object getrTOStartedDate() {
		return rTOStartedDate;
	}
	public void setrTOStartedDate(Object rTOStartedDate) {
		this.rTOStartedDate = rTOStartedDate;
	}
	public String getExtras() {
		return extras;
	}
	public void setExtras(String extras) {
		this.extras = extras;
	}
	public Object getFirstAttemptDate() {
		return firstAttemptDate;
	}
	public void setFirstAttemptDate(Object firstAttemptDate) {
		this.firstAttemptDate = firstAttemptDate;
	}
	public boolean isReverseInTransit() {
		return reverseInTransit;
	}
	public void setReverseInTransit(boolean reverseInTransit) {
		this.reverseInTransit = reverseInTransit;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Consignee getConsignee() {
		return consignee;
	}
	public void setConsignee(Consignee consignee) {
		this.consignee = consignee;
	}
	public String getReferenceNo() {
		return referenceNo;
	}
	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}
	public String getOutDestinationDate() {
		return outDestinationDate;
	}
	public void setOutDestinationDate(String outDestinationDate) {
		this.outDestinationDate = outDestinationDate;
	}
	public int getcODAmount() {
		return cODAmount;
	}
	public void setcODAmount(int cODAmount) {
		this.cODAmount = cODAmount;
	}
	public String getPromisedDeliveryDate() {
		return promisedDeliveryDate;
	}
	public void setPromisedDeliveryDate(String promisedDeliveryDate) {
		this.promisedDeliveryDate = promisedDeliveryDate;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getOriginRecieveDate() {
		return originRecieveDate;
	}
	public void setOriginRecieveDate(String originRecieveDate) {
		this.originRecieveDate = originRecieveDate;
	}
	
}