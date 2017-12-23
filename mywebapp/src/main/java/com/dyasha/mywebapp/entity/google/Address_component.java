package com.dyasha.mywebapp.entity.google;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address_component {
	private String long_name;

	private String short_name;

	private String[] type;

	public String getLong_name() {
		return long_name;
	}

	public void setLong_name(String long_name) {
		this.long_name = long_name;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public String[] getType() {
		return type;
	}

	public void setType(String[] type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ClassPojo [long_name = " + long_name + ", short_name = " + short_name + ", type = " + type + "]";
	}
}
