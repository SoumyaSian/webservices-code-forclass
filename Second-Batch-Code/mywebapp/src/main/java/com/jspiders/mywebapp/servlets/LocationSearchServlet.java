package com.jspiders.mywebapp.servlets;

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

public class LocationSearchServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, 
						 HttpServletResponse resp) 
	throws ServletException, IOException {
		
		//Get the Form Data
		String locVal = req.getParameter("loc");
		String formatVal = req.getParameter("format");
		
		String contentType=null;
		//String url="http://localhost:8080/googlemaps/api/geocode/";
		String url="https://maps.googleapis.com/maps/api/geocode/";
		
		if(formatVal.equals("xml")) {
			contentType = MediaType.APPLICATION_XML;
			url = url+"xml?address="+locVal;
			
		}else if(formatVal.equals("json")) {
			contentType = MediaType.APPLICATION_JSON;
			url = url+"json?address="+locVal;
			
		}else if(formatVal.equals("text")) {
			contentType = MediaType.TEXT_PLAIN;
			url = url+"text?address="+locVal;
		}
		
		/*
		 * Invoke the Google Maps Web Services
		 */
		//1. Build the Client
		Client client = ClientBuilder.newClient();
		
		//2. Set the Target
		WebTarget target = client.target(url);
		
		//3. Get the Response
		Response response = target.request(contentType).get();
		
		//4. Process the Response
		String respData = (String)response.readEntity(String.class);
		
		/*
		 * Send the above response to Browser
		 */
		resp.setContentType(contentType);
		PrintWriter out = resp.getWriter();
		out.print(respData);
		
	}//End of doGet()
}//End of Class








