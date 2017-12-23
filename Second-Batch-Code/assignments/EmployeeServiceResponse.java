package com.jspiders.googlemaps.dao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="emp-service-resp")
public class EmployeeServiceResponse {
	
	private int code;
	private String message;
	private String description;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

