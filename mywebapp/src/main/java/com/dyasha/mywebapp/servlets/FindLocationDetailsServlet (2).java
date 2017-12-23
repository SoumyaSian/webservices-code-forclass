package com.dyasha.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dyasha.mywebapp.entity.google.data.GeocodeResponse;
import com.dyasha.mywebapp.entity.ip.data.InternetAddress;
import com.dyasha.mywebapp.entity.weather.data.WeatherDetails;
import com.dyasha.mywebapp.rest.clients.MyWebAppRestClient;
import com.dyasha.mywebapp.rest.constants.RestClientConstants;

public class FindLocationDetailsServlet extends HttpServlet{

	/**
	 * This will be used to passivates the Servlet in a clustered environment
	 */
	private static final long serialVersionUID = 645579891850555697L;

	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {

		//Get the Form Data
		String locationVal = req.getParameter("location");

		//To get a Google Geocode Response
		MyWebAppRestClient restClient = new MyWebAppRestClient();
		GeocodeResponse googleResp = restClient.getLocationDataFromGoogleMapsAsObject(locationVal);
		String lat = googleResp.getGeometry_bounds_location_lat()+"";
		String lng = googleResp.getGeometry_bounds_location_lng()+"";
		
		//To get a Weather Response
		WeatherDetails weatherResp = restClient.getWhetherDetailsFromOpenWeatherMap(lat,lng);
		
		InternetAddress geoipResp = restClient.getIPDetailsFromFreegeoip(null);
		//String smsResp = restClient.sendSMS("Hello+this+is+the+Message+from+REST+Service+-+Praveen+Dyamappa");

		req.setAttribute("geocodeData",googleResp);
		req.setAttribute("weatherData",weatherResp);
		req.setAttribute("geoipData",geoipResp);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("SearchResults.jsp?long="+lng+"&lat="+lat+"&key="+RestClientConstants.GOOGLE_API_KEY);
		dispatcher.forward(req, resp);
		
	}//End of doGet()
}//End of Class
