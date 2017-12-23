//package com.google.googlemaps.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import com.google.googlemaps.dao.LocationDAO;
//import com.google.googlemaps.dao.LocationDataDTO;

@Path("/mapsapi")
public class GoogleMapsRestServices 
{
	@GET
	@Path("/text/{location}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getLocationDataInString(@PathParam("location") String location)
	{
		LocationDAO dao = new LocationDAO();
		LocationDataDTO data = dao.getLocationData(location);
		return data.toString();
	}
	
	@GET
	@Path("/xml/{location}")
	@Produces(MediaType.APPLICATION_XML)
	public LocationDataDTO getLocationDataInXml(@PathParam("location") String location)
	{
		LocationDAO dao = new LocationDAO();
		return dao.getLocationData(location);
	}
	
	@GET
	@Path("/json/{location}")
	@Produces(MediaType.APPLICATION_JSON)
	public LocationDataDTO getLocationDataInJson(@PathParam("location") String location)
	{
		LocationDAO dao = new LocationDAO();
		return dao.getLocationData(location);
	}
	
}//End of Class

