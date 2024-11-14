package com.delapi.microserviceapp.model.delhivery;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipmentDatum {
    @JsonProperty("Shipment") 
    public Shipment shipment;

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
}
