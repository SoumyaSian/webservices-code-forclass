package org.jspiders.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class MyRESTClientServelt extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, 
						 HttpServletResponse resp) 
	throws ServletException, IOException 
	{
		//Get the Form Data
		String locationVal = req.getParameter("location");
		String typeVal = req.getParameter("type");
		
		String contentType=null;
		String url=null;
		
		if(typeVal.equals("txt"))
		{
			contentType = MediaType.TEXT_PLAIN;
			url = "http://localhost:8080/googlemaps/rest/mapsapi/text/"+locationVal;
		
		} else if(typeVal.equals("xml")) {
			contentType = MediaType.APPLICATION_XML;
			url = "http://localhost:8080/googlemaps/rest/mapsapi/xml/"+locationVal;
		
		} else if(typeVal.equals("json")) {
			contentType = MediaType.APPLICATION_JSON;
			url = "http://localhost:8080/googlemaps/rest/mapsapi/json/"+locationVal;
		}
		
		/*
		 * Invoke the Google Maps Web Services
		 */
		//1. Build the Client
		Client client = ClientBuilder.newClient();
		
		//2. Set the Target
		WebTarget target = client.target("https://maps.googleapis.com/maps/api/geocode/xml?address="+locationVal);
		
		//3. Get the Response
		Response response = target.request(contentType).get();
		
		//4. Process the Response
		String respData = (String)response.readEntity(String.class);
		
		resp.setContentType(contentType);
		PrintWriter out = resp.getWriter();
		out.print(respData);
		
	}
}
