package com.dyasha.mywebapp.entity.google.data;

import com.dyasha.mywebapp.entity.google.json.GeocodeResponseJSON;
import com.dyasha.mywebapp.entity.google.xml.GeocodeResponseXML;

public class GeocodeResponse {

	private String address_components0_long_name;
	private String address_components0_short_name;
	private String address_components0_type0;
	private String address_components0_type1;
	private String address_components1_long_name;
	private String address_components1_short_name;
	private String address_components1_type0;
	private String address_components1_type1;
	private String formatted_address;
	private Double geometry_bounds_northeast_lat;
	private Double geometry_bounds_northeast_lng;
	private Double geometry_bounds_southwest_lat;
	private Double geometry_bounds_southwest_lng;
	private Double geometry_bounds_location_lat;
	private Double geometry_bounds_location_lng;
	private String geometry_location_type;
	private Double geometry_viewport_northeast_lat;
	private Double geometry_viewport_northeast_lng;
	private Double geometry_viewport_southwest_lat;
	private Double geometry_viewport_southwest_lng;
	private String place_id;
	private String type0;
	private String type1;
	private String status;

	public GeocodeResponse(){}

	public GeocodeResponse(GeocodeResponseJSON jsonData){
		this.address_components0_long_name = jsonData.getResults()[0].getAddressComponents()[0].getLongName();
		this.address_components0_short_name= jsonData.getResults()[0].getAddressComponents()[0].getShortName();
		this.address_components0_type0 = jsonData.getResults()[0].getAddressComponents()[0]
				.getTypes().get(0);
		this.address_components0_type1 = jsonData.getResults()[0].getAddressComponents()[0]
				.getTypes().get(1);
		if(jsonData.getResults()[0].getAddressComponents().length > 1){
			this.address_components1_long_name = jsonData.getResults()[0].getAddressComponents()[1]
					.getLongName();
			this.address_components1_short_name = jsonData.getResults()[0].getAddressComponents()[1]
					.getShortName();
			this.address_components1_type0 = jsonData.getResults()[0].getAddressComponents()[1]
					.getTypes().get(0);
			this.address_components1_type1 = jsonData.getResults()[0].getAddressComponents()[1]
					.getTypes().get(1);
		}
		this.formatted_address = jsonData.getResults()[0].getFormattedAddress();
		this.geometry_bounds_northeast_lat = jsonData.getResults()[0].getGeometry()
				.getBounds().getNortheast().getLat();
		this.geometry_bounds_northeast_lng = jsonData.getResults()[0].getGeometry()
				.getBounds().getNortheast().getLng();
		this.geometry_bounds_southwest_lat = jsonData.getResults()[0].getGeometry()
				.getBounds().getSouthwest().getLat();
		this.geometry_bounds_southwest_lng = jsonData.getResults()[0].getGeometry()
				.getBounds().getSouthwest().getLng();
		this.geometry_bounds_location_lat = jsonData.getResults()[0].getGeometry().getLocation()
				.getLat();
		this.geometry_bounds_location_lng = jsonData.getResults()[0].getGeometry().getLocation()
				.getLng();
		this.geometry_location_type = jsonData.getResults()[0].getGeometry().getLocationType();
		this.geometry_viewport_northeast_lat = jsonData.getResults()[0].getGeometry()
				.getViewport().getNortheast().getLat();
		this.geometry_viewport_northeast_lng = jsonData.getResults()[0].getGeometry()
				.getViewport().getNortheast().getLng();
		this.geometry_viewport_southwest_lat = jsonData.getResults()[0].getGeometry().getViewport()
				.getSouthwest().getLat();
		this.geometry_viewport_southwest_lng = jsonData.getResults()[0].getGeometry().getViewport()
				.getSouthwest().getLng();
		this.place_id = jsonData.getResults()[0].getPlaceId();
		this.type0 = jsonData.getResults()[0].getTypes().get(0);
		this.type1 = jsonData.getResults()[0].getTypes().get(1);
		this.status = jsonData.getStatus();
	}

	public GeocodeResponse(GeocodeResponseXML xmlData){
		this.address_components0_long_name = xmlData.getResult().getAddressComponent().get(0).getLongName();
		this.address_components0_short_name= xmlData.getResult().getAddressComponent().get(0).getShortName();
		this.address_components0_type0 = xmlData.getResult().getAddressComponent().get(0).getType().get(0);
		this.address_components0_type1 = xmlData.getResult().getAddressComponent().get(0).getType().get(1);
		if(xmlData.getResult().getAddressComponent().size() > 1){
			this.address_components1_long_name = xmlData.getResult().getAddressComponent().get(1).getLongName();
			this.address_components1_short_name = xmlData.getResult().getAddressComponent().get(1).getShortName();
			this.address_components1_type0 = xmlData.getResult().getAddressComponent().get(1).getType().get(0);
			this.address_components1_type1 = xmlData.getResult().getAddressComponent().get(1).getType().get(1);

		}
		this.formatted_address = xmlData.getResult().getFormattedAddress();
		this.geometry_bounds_northeast_lat = xmlData.getResult().getGeometry().getBounds()
				.getNortheast().getLat();
		this.geometry_bounds_northeast_lng = xmlData.getResult().getGeometry().getBounds()
				.getNortheast().getLng();
		this.geometry_bounds_southwest_lat = xmlData.getResult().getGeometry().getBounds()
				.getSouthwest().getLat();
		this.geometry_bounds_southwest_lng = xmlData.getResult().getGeometry().getBounds()
				.getSouthwest().getLng();
		this.geometry_bounds_location_lat = xmlData.getResult().getGeometry().getLocation().getLat();
		this.geometry_bounds_location_lng = xmlData.getResult().getGeometry().getLocation().getLng();
		this.geometry_location_type = xmlData.getResult().getGeometry().getLocationType();
		this.geometry_viewport_northeast_lat = xmlData.getResult().getGeometry()
				.getViewport().getNortheast().getLat();
		this.geometry_viewport_northeast_lng = xmlData.getResult().getGeometry()
				.getViewport().getNortheast().getLng();
		this.geometry_viewport_southwest_lat = xmlData.getResult().getGeometry()
				.getViewport().getSouthwest().getLat();
		this.geometry_viewport_southwest_lng = xmlData.getResult().getGeometry()
				.getViewport().getSouthwest().getLng();
		this.place_id = xmlData.getResult().getPlaceId();
		this.type0 = xmlData.getResult().getType().get(0);
		this.type1 = xmlData.getResult().getType().get(0);
		this.status = xmlData.getStatus();
	}

	public String getAddress_components0_long_name() {
		return address_components0_long_name;
	}
	public void setAddress_components0_long_name(String address_components0_long_name) {
		this.address_components0_long_name = address_components0_long_name;
	}
	public String getAddress_components0_short_name() {
		return address_components0_short_name;
	}
	public void setAddress_components0_short_name(String address_components0_short_name) {
		this.address_components0_short_name = address_components0_short_name;
	}
	public String getAddress_components0_type0() {
		return address_components0_type0;
	}
	public void setAddress_components0_type0(String address_components0_type0) {
		this.address_components0_type0 = address_components0_type0;
	}
	public String getAddress_components0_type1() {
		return address_components0_type1;
	}
	public void setAddress_components0_type1(String address_components0_type1) {
		this.address_components0_type1 = address_components0_type1;
	}
	public String getAddress_components1_long_name() {
		return address_components1_long_name;
	}
	public void setAddress_components1_long_name(String address_components1_long_name) {
		this.address_components1_long_name = address_components1_long_name;
	}
	public String getAddress_components1_short_name() {
		return address_components1_short_name;
	}
	public void setAddress_components1_short_name(String address_components1_short_name) {
		this.address_components1_short_name = address_components1_short_name;
	}
	public String getAddress_components1_type0() {
		return address_components1_type0;
	}
	public void setAddress_components1_type0(String address_components1_type0) {
		this.address_components1_type0 = address_components1_type0;
	}
	public String getAddress_components1_type1() {
		return address_components1_type1;
	}
	public void setAddress_components1_type1(String address_components1_type1) {
		this.address_components1_type1 = address_components1_type1;
	}
	public String getFormatted_address() {
		return formatted_address;
	}
	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}
	public Double getGeometry_bounds_northeast_lat() {
		return geometry_bounds_northeast_lat;
	}
	public void setGeometry_bounds_northeast_lat(Double geometry_bounds_northeast_lat) {
		this.geometry_bounds_northeast_lat = geometry_bounds_northeast_lat;
	}
	public Double getGeometry_bounds_northeast_lng() {
		return geometry_bounds_northeast_lng;
	}
	public void setGeometry_bounds_northeast_lng(Double geometry_bounds_northeast_lng) {
		this.geometry_bounds_northeast_lng = geometry_bounds_northeast_lng;
	}
	public Double getGeometry_bounds_southwest_lat() {
		return geometry_bounds_southwest_lat;
	}
	public void setGeometry_bounds_southwest_lat(Double geometry_bounds_southwest_lat) {
		this.geometry_bounds_southwest_lat = geometry_bounds_southwest_lat;
	}
	public Double getGeometry_bounds_southwest_lng() {
		return geometry_bounds_southwest_lng;
	}
	public void setGeometry_bounds_southwest_lng(Double geometry_bounds_southwest_lng) {
		this.geometry_bounds_southwest_lng = geometry_bounds_southwest_lng;
	}
	public Double getGeometry_bounds_location_lat() {
		return geometry_bounds_location_lat;
	}
	public void setGeometry_bounds_location_lat(Double geometry_bounds_location_lat) {
		this.geometry_bounds_location_lat = geometry_bounds_location_lat;
	}
	public Double getGeometry_bounds_location_lng() {
		return geometry_bounds_location_lng;
	}
	public void setGeometry_bounds_location_lng(Double geometry_bounds_location_lng) {
		this.geometry_bounds_location_lng = geometry_bounds_location_lng;
	}
	public String getGeometry_location_type() {
		return geometry_location_type;
	}
	public void setGeometry_location_type(String geometry_location_type) {
		this.geometry_location_type = geometry_location_type;
	}
	public Double getGeometry_viewport_northeast_lat() {
		return geometry_viewport_northeast_lat;
	}
	public void setGeometry_viewport_northeast_lat(Double geometry_viewport_northeast_lat) {
		this.geometry_viewport_northeast_lat = geometry_viewport_northeast_lat;
	}
	public Double getGeometry_viewport_northeast_lng() {
		return geometry_viewport_northeast_lng;
	}
	public void setGeometry_viewport_northeast_lng(Double geometry_viewport_northeast_lng) {
		this.geometry_viewport_northeast_lng = geometry_viewport_northeast_lng;
	}
	public Double getGeometry_viewport_southwest_lat() {
		return geometry_viewport_southwest_lat;
	}
	public void setGeometry_viewport_southwest_lat(Double geometry_viewport_southwest_lat) {
		this.geometry_viewport_southwest_lat = geometry_viewport_southwest_lat;
	}
	public Double getGeometry_viewport_southwest_lng() {
		return geometry_viewport_southwest_lng;
	}
	public void setGeometry_viewport_southwest_lng(Double geometry_viewport_southwest_lng) {
		this.geometry_viewport_southwest_lng = geometry_viewport_southwest_lng;
	}
	public String getPlace_id() {
		return place_id;
	}
	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}
	public String getType0() {
		return type0;
	}
	public void setType0(String type0) {
		this.type0 = type0;
	}
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "GeocodeResponse [\n address_components0_long_name=" + address_components0_long_name
				+ "\n address_components0_short_name=" + address_components0_short_name + "\n address_components0_type0="
				+ address_components0_type0 + "\n address_components0_type1=" + address_components0_type1
				+ "\n address_components1_long_name=" + address_components1_long_name
				+ "\n address_components1_short_name=" + address_components1_short_name + "\n address_components1_type0="
				+ address_components1_type0 + "\n address_components1_type1=" + address_components1_type1
				+ "\n formatted_address=" + formatted_address + "\n geometry_bounds_northeast_lat="
				+ geometry_bounds_northeast_lat + "\n geometry_bounds_northeast_lng=" + geometry_bounds_northeast_lng
				+ "\n geometry_bounds_southwest_lat=" + geometry_bounds_southwest_lat
				+ "\n geometry_bounds_southwest_lng=" + geometry_bounds_southwest_lng + "\n geometry_bounds_location_lat="
				+ geometry_bounds_location_lat + "\n geometry_bounds_location_lng=" + geometry_bounds_location_lng
				+ "\n geometry_location_type=" + geometry_location_type + "\n geometry_viewport_northeast_lat="
				+ geometry_viewport_northeast_lat + "\n geometry_viewport_northeast_lng="
				+ geometry_viewport_northeast_lng + "\n geometry_viewport_southwest_lat="
				+ geometry_viewport_southwest_lat + "\n geometry_viewport_southwest_lng="
				+ geometry_viewport_southwest_lng + "\n place_id=" + place_id + "\n type0=" + type0 + "\n type1=" + type1
				+ "\n status=" + status + "\n]";
	}

}
