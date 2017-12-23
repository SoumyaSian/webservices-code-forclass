package com.jspiders.myjavaproj.jsonb;

import javax.json.bind.annotation.JsonbProperty;

public class StudentInfo 
{
	private int regno;
	@JsonbProperty
	private String firstName;
	private String lastName;
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "StudentInfo [regno=" + regno + ", firstName=" + firstName + ", lastName=" + lastName + ", getRegno()="
				+ getRegno() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
