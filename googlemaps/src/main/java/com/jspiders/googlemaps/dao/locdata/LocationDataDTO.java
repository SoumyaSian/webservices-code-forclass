package com.jspiders.googlemaps.dao.locdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name="GeocodeResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "fullAddress", "latitude", "longitude" })
public class LocationDataDTO 
{
	@XmlAttribute(name="location_name")
	private String location;
	
	@XmlElementWrapper(name="geometry")
	//@XmlElement(name="lng")
	private double longitude;
	
	@XmlElement(name="lat")
	private double latitude;
	
	@XmlElement(name="formatted_address")
	private String fullAddress;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	@Override
	public String toString() {
		return "LocationDataDTO [location=" + location + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", fullAddress=" + fullAddress + "]";
	}
	
	
}
