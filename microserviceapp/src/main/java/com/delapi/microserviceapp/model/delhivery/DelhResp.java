package com.delapi.microserviceapp.model.delhivery;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DelhResp {
	 	@JsonProperty("ShipmentData") 
	    public ShipmentDatum[] shipmentData;

		public ShipmentDatum[] getShipmentData() {
			return shipmentData;
		}

		public void setShipmentData(ShipmentDatum[] shipmentData) {
			this.shipmentData = shipmentData;
		}
}
