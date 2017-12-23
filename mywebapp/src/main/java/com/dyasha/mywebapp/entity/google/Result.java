package com.dyasha.mywebapp.entity.google;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="result")
public class Result {
	
	private String place_id;

	private String formatted_address;

	private Address_component[] address_component;

	private String[] type;

	private Geometry geometry;

	public String getPlace_id() {
		return place_id;
	}

	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

	public String getFormatted_address() {
		return formatted_address;
	}

	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}

	public Address_component[] getAddress_component() {
		return address_component;
	}

	public void setAddress_component(Address_component[] address_component) {
		this.address_component = address_component;
	}

	public String[] getType() {
		return type;
	}

	public void setType(String[] type) {
		this.type = type;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	@Override
	public String toString() {
		return "ClassPojo [place_id = " + place_id + ", formatted_address = " + formatted_address
				+ ", address_component = " + address_component + ", type = " + type + ", geometry = " + geometry + "]";
	}
}
