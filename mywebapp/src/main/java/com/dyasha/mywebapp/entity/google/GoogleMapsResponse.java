package com.dyasha.mywebapp.entity.google;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GoogleMapsResponse {
	@XmlElement(name="GeocodeResponse")
	private GeocodeResponse geocodeResponse;

	public GeocodeResponse getGeocodeResponse() {
		return geocodeResponse;
	}

	public void setGeocodeResponse(GeocodeResponse GeocodeResponse) {
		this.geocodeResponse = GeocodeResponse;
	}

	@Override
	public String toString() {
		return "ClassPojo [GeocodeResponse = " + geocodeResponse + "]";
	}
}
