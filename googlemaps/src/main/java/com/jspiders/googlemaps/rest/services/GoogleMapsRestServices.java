package com.jspiders.googlemaps.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.jspiders.googlemaps.dao.LocationDAO;
import com.jspiders.googlemaps.dao.LocationDataDTO;

@Path("/geocode")
public class GoogleMapsRestServices {

	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public LocationDataDTO getLocationDataInXml(@QueryParam("address") String location){
		
		LocationDAO dao = new LocationDAO();
		return dao.getLocationData(location);
		
	}//End of XML Service
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public LocationDataDTO getLocationDataInJson(@QueryParam("address") String location){
		
		LocationDAO dao = new LocationDAO();
		return dao.getLocationData(location);
		
	}//End of XML Service
	
	
	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public String getLocationDataInTxt(@QueryParam("address") String location){
		
		LocationDAO dao = new LocationDAO();
		LocationDataDTO resp = dao.getLocationData(location);
		return resp.toString();
		
	}//End of XML Service
	
	
}//End of Class
