package com.dyasha.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dyasha.mywebapp.entity.weather.Current;
//import com.dyasha.mywebapp.entity.google.GeocodeResponse;
import com.dyasha.mywebapp.rest.clients.MyWebAppRestClient;

public class FindLocationDetailsServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, 
						 HttpServletResponse resp) 
	throws ServletException, IOException 	{
		
		//Get the Form Data
		String locationVal = req.getParameter("location");

		MyWebAppRestClient restClient = new MyWebAppRestClient();
//		GeocodeResponse googleResp = restClient.getLocationDataFromGoogleMapsAsObject(locationVal);
//		String[] latLong = RestClientUtil.getLatLongFromGoogleResp(googleResp);
		String weatherResp = restClient.getWhetherDetailsFromOpenWeatherMap("12.9141417", "74.8559568");
		Current weatherResp2 = restClient.getWhetherDataFromOpenWeatherMapAsObject("12.9141417", "74.8559568");
		String geoipResp = restClient.getIPDetailsFromFreegeoip(null);
//		String smsResp = restClient.sendSMS("Hello+this+is+the+Message+from+REST+Service+-+Praveen+Dyamappa");
			
		req.setAttribute("result", weatherResp2+"<BR><BR>"+weatherResp+"<BR><BR>"+geoipResp);
		RequestDispatcher dispatcher = req.getRequestDispatcher("SearchResults.jsp?long="+"74.8559568"+"&lat="+"12.9141417"+"&key="+"AIzaSyCB5OEpafZZ1m9tLlSqyRTOJqJTQN-zxTQ");
		dispatcher.forward(req, resp);
		
		/*resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		out.print(googleResp);
		//out.print("*******************************************************");
//		out.print(googleResp2);
		out.print("*******************************************************");
		out.print(weatherResp);
		out.print("*******************************************************");
		out.print(geoipResp);*/
	}//End of doGet()
}//End of Class
