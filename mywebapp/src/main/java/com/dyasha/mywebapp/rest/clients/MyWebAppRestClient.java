package com.dyasha.mywebapp.rest.clients;

import static com.dyasha.mywebapp.rest.constants.RestClientConstants.JSON;
import static com.dyasha.mywebapp.rest.constants.RestClientConstants.XML;
import static com.dyasha.mywebapp.rest.constants.RestClientConstants.googleSericeUrlJson;
import static com.dyasha.mywebapp.rest.constants.RestClientConstants.googleSericeUrlXml;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.dyasha.mywebapp.entity.google.GeocodeResponse;
import com.dyasha.mywebapp.entity.weather.Current;

//import com.dyasha.mywebapp.entity.google.GeocodeResponse;
public class MyWebAppRestClient {
	
	public GeocodeResponse getLocationDataFromGoogleMapsAsObject(String locationVal) {
		
//		long startTime = System.currentTimeMillis();
		
		Client client = ClientBuilder.newClient();
		
		//XML takes 2 Sec & JSON takes 1 Sec
//		WebTarget webTarget = client.target(googleSericeUrlXml+locationVal);
		WebTarget webTarget = client.target(googleSericeUrlJson+locationVal);
		
		Response response = webTarget.request().get();
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}
		GeocodeResponse output = (GeocodeResponse) response.readEntity(GeocodeResponse.class);
		System.out.println(output);
		
//		System.out.println((System.currentTimeMillis()-startTime)/1000);
		
		return output;
	}//End of getLocationDetailsFromGoogleMaps()
	
	
	public Current getWhetherDataFromOpenWeatherMapAsObject(String longitude, String latitude) {
		String url="http://api.openweathermap.org/data/2.5/weather?mode=xml&lat="+latitude+"&lon="+longitude+"&appid=573aea3508e39c8d75a6d70c75d118cc";
		
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(url);
		Response response = webTarget.request().get();
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}
		Current output = (Current) response.readEntity(Current.class);
		System.out.println(output);
		return output;
	}//End of getWhetherDetailsFromOpenWeatherMap()
	
	
	
	
	public String getWhetherDetailsFromOpenWeatherMap(String longitude, String latitude) {
		String url="http://api.openweathermap.org/data/2.5/weather?mode=xml&lat="+latitude+"&lon="+longitude+"&appid=573aea3508e39c8d75a6d70c75d118cc";
		
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(url);
		Response response = webTarget.request().get();
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}
		String output = (String) response.readEntity(String.class);
		System.out.println(output);
		return output;
	}//End of getWhetherDetailsFromOpenWeatherMap()
	
	public String getIPDetailsFromFreegeoip(String ipAddress) {
		String url="http://freegeoip.net/xml/"+( (ipAddress==null)?"":ipAddress );
		
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(url);
		Response response = webTarget.request().get();
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}
		String output = (String) response.readEntity(String.class);
		System.out.println(output);
		return output;
	}//End of getWhetherDetailsFromOpenWeatherMap()
	
	public String sendSMS(String smsTxt) {
		String url="https://api.textlocal.in/send/?apikey=ZE7YdlBVbTM-AUlOQ7N8qzOZwMXeg1M0Q54i6hkcVF&numbers=919448246364,919964073144&message="+smsTxt;
		
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(url);
		Response response = webTarget.request().get();
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}
		String output = (String) response.readEntity(String.class);
		System.out.println(output);
		return output;
	}//End of getWhetherDetailsFromOpenWeatherMap()

	public String getLocationDataFromGoogleMapsAsString(String locationVal, String dataFormat) {
		
		if( !(dataFormat.equalsIgnoreCase(XML) || dataFormat.equalsIgnoreCase(JSON)) ) {
			throw new RuntimeException("Unsupported Format !!!");
		}
		
		String url = (dataFormat.equalsIgnoreCase(XML) 
					  ? googleSericeUrlXml 
					  : googleSericeUrlJson
					 )+locationVal;
		
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(url);
		Response response = webTarget.request().get();
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}
		String output = (String) response.readEntity(String.class);
		System.out.println(output);
		return output;
	}//End of getLocationDataFromGoogleMapsAsString()

}//End of Class
