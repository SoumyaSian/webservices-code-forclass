package org.jspiders.myjavapp;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address 
{
	private String addrType;
	private short houseNo;
	private String address1;
	private String address2;
	private String landmark;
	private String city;
	private int pincode;
	
	@XmlAttribute(name="type")
	public String getAddrType() {
		return addrType;
	}
	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}
	
	@XmlElement
	public short getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(short houseNo) {
		this.houseNo = houseNo;
	}
	
	@XmlElement
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	@XmlElement
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	@XmlElement
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	@XmlElement
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@XmlElement
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [addrType=" + addrType + ", houseNo=" + houseNo + ", address1=" + address1 + ", address2="
				+ address2 + ", landmark=" + landmark + ", city=" + city + ", pincode=" + pincode + ", getAddrType()="
				+ getAddrType() + ", getHouseNo()=" + getHouseNo() + ", getAddress1()=" + getAddress1()
				+ ", getAddress2()=" + getAddress2() + ", getLandmark()=" + getLandmark() + ", getCity()=" + getCity()
				+ ", getPincode()=" + getPincode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
