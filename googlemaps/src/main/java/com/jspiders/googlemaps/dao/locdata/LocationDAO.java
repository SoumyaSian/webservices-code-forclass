package com.jspiders.googlemaps.dao.locdata;

import java.util.Random;

public class LocationDAO 
{
	public LocationDataDTO getLocationData(String location)
	{
		/*
		 * Assume that we're getting the data from DB
		 */
		LocationDataDTO data = new LocationDataDTO();
		data.setLocation(location);
		data.setLatitude(new Random().nextDouble());
		data.setLongitude(new Random().nextDouble());
		data.setFullAddress(location+", Some_City, Some_Country");
		return data;
	}
}
