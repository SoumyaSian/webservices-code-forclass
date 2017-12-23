package com.dyasha.mywebapp.entity.ip.data;

import com.dyasha.mywebapp.entity.ip.json.InternetAddressJSON;
import com.dyasha.mywebapp.entity.ip.xml.InternetAddressXML;

public class InternetAddress {

	private String ip;
	private String country_code;
	private String country_name;
	private String region_code;
	private String region_name;
	private String city;
	private String zip_code;
	private String time_zone;
	private double latitude;
	private double longitude;
	private int metro_code;

	public InternetAddress(){}

	public InternetAddress(InternetAddressXML data){

		this.ip = data.getIP();
		this.country_code = data.getCountryCode();
		this.country_name = data.getCountryName();
		this.region_code = data.getRegionCode();
		this.region_name = data.getRegionName();
		this.city = data.getCity();
		this.zip_code = data.getZipCode();
		this.time_zone = data.getTimeZone();
		this.latitude = data.getLatitude();
		this.longitude = data.getLongitude();
		this.metro_code = data.getMetroCode();

	}
	
	public InternetAddress(InternetAddressJSON data){

		this.ip = data.getIp();
		this.country_code = data.getCountryCode();
		this.country_name = data.getCountryName();
		this.region_code = data.getRegionCode();
		this.region_name = data.getRegionName();
		this.city = data.getCity();
		this.zip_code = data.getZipCode();
		this.time_zone = data.getTimeZone();
		this.latitude = data.getLatitude();
		this.longitude = data.getLongitude();
		this.metro_code = data.getMetroCode();

	}

	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getRegion_code() {
		return region_code;
	}
	public void setRegion_code(String region_code) {
		this.region_code = region_code;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getMetro_code() {
		return metro_code;
	}
	public void setMetro_code(int metro_code) {
		this.metro_code = metro_code;
	}

	@Override
	public String toString() {
		return "InternetAddress [\n ip=" + ip + "\n country_code=" + country_code + "\n country_name=" + country_name
				+ "\n region_code=" + region_code + "\n region_name=" + region_name + "\n city=" + city + "\n zip_code="
				+ zip_code + "\n time_zone=" + time_zone + "\n latitude=" + latitude + "\n longitude=" + longitude
				+ "\n metro_code=" + metro_code + "\n]";
	}
	
	
}
