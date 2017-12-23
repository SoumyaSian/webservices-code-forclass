package com.dyasha.mywebapp.rest.clients;

import static com.dyasha.mywebapp.rest.constants.RestClientConstants.*;

import java.time.Duration;
import java.time.Instant;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.dyasha.mywebapp.entity.google.data.GeocodeResponse;
import com.dyasha.mywebapp.entity.google.json.GeocodeResponseJSON;
import com.dyasha.mywebapp.entity.google.xml.GeocodeResponseXML;
import com.dyasha.mywebapp.entity.ip.data.InternetAddress;
import com.dyasha.mywebapp.entity.ip.json.InternetAddressJSON;
import com.dyasha.mywebapp.entity.ip.xml.InternetAddressXML;
import com.dyasha.mywebapp.entity.weather.data.WeatherDetails;
import com.dyasha.mywebapp.entity.weather.json.WeatherDetailsJSON;
import com.dyasha.mywebapp.entity.weather.xml.WeatherDetailsXML;
import com.dyasha.mywebapp.rest.constants.RestClientConstants;

public class MyWebAppRestClient {

	public GeocodeResponse getLocationDataFromGoogleMapsAsObject(String locationVal) {

		//To calculate the time taken
		Instant start = null;
		Instant end = null;
		Duration duration = null;

		Client client = ClientBuilder.newClient();
		Response response = null;
		WebTarget webTarget = null;
		GeocodeResponse geocode = null;

		if(RestClientConstants.TYPE.equals("XML")){
			webTarget = client.target(GEOCODE_XML_URL+locationVal);
			response = webTarget.request().get();
			start = Instant.now();
			geocode = new GeocodeResponse(response.readEntity(GeocodeResponseXML.class));
			end = Instant.now();
			duration = Duration.between(start, end);
			System.out.println("Time Taken For XML Parsing(Geocode): "+duration.toMillis()+" millis");
		}else if(RestClientConstants.TYPE.equals("JSON")){
			webTarget = client.target(GEOCODE_JSON_URL+locationVal);
			response = webTarget.request().get();
			start = Instant.now();
			geocode = new GeocodeResponse(response.readEntity(GeocodeResponseJSON.class));
			end = Instant.now();
			duration = Duration.between(start, end);
			System.out.println("Time Taken For JSON Parsing(Geocode): "+duration.toMillis()+" millis");
		}

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}
		System.out.println(geocode);
		return geocode;
	}//End of getLocationDetailsFromGoogleMaps

	public WeatherDetails getWhetherDetailsFromOpenWeatherMap(String longitude, String latitude) {

		//To calculate the time taken
		Instant start = null;
		Instant end = null;
		Duration duration = null;

		Client client = ClientBuilder.newClient();
		WebTarget webTarget = null;
		Response response = null;
		WeatherDetails output = null;
		if(TYPE.equals("XML")){

			String url=WEATHER_DETAILS_XML_URL+"&lat="+latitude+"&lon="+longitude+"&appid="+WEATHER_DETAILS_APPID;
			webTarget = client.target(url);
			response = webTarget.request().get();
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
			start = Instant.now();
			output = new WeatherDetails((WeatherDetailsXML) response.readEntity(WeatherDetailsXML.class));
			end = Instant.now();
			duration = Duration.between(start, end);
			System.out.println("Time Taken For XML Parsing(Weather): "+duration.toMillis()+" millis");

		}else if(TYPE.equals("JSON")){
			String url=WEATHER_DETAILS_JSON_URL+"&lat="+latitude+"&lon="+longitude+"&appid="+WEATHER_DETAILS_APPID;

			webTarget = client.target(url);
			response = webTarget.request().get();
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
			start = Instant.now();
			output = new WeatherDetails((WeatherDetailsJSON) response.readEntity(WeatherDetailsJSON.class));
			end = Instant.now();
			duration = Duration.between(start,end);
			System.out.println("Time Taken For JSON Parsing(Weather): "+duration.toMillis()+" millis");

		}
		System.out.println(output);
		return output;
	}//End of getWhetherDetailsFromOpenWeatherMap()


	public InternetAddress getIPDetailsFromFreegeoip(String ipAddress) {
		

		InternetAddress output = null;

		
		Instant start = null;
		Instant end = null;
		Duration duration = null;

		Client client = ClientBuilder.newClient();
		WebTarget webTarget = null;
		Response response = null;
		if(TYPE.equals("XML")){ 
			String url=IP_ADDRESS_URL_XML+( (ipAddress==null)?"":ipAddress );
			client = ClientBuilder.newClient();
			webTarget = client.target(url);
			response = webTarget.request().get();
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
			start = Instant.now();
			output = new InternetAddress((InternetAddressXML) response.readEntity(InternetAddressXML.class));
			end = Instant.now();
			duration = Duration.between(start, end);
			System.out.println("Time taken for InternetAddress XML Parsing: "+duration.toMillis());
		}else if(TYPE.equals("JSON")){
			String url=IP_ADDRESS_URL_JSON+( (ipAddress==null)?"":ipAddress );
			client = ClientBuilder.newClient();
			webTarget = client.target(url);
			response = webTarget.request().get();
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
			start = Instant.now();
			output = new InternetAddress((InternetAddressJSON) response.readEntity(InternetAddressJSON.class));
			end = Instant.now();
			duration = Duration.between(start, end);
			System.out.println("Time taken for InternetAddress JSON Parsing: "+duration.toMillis());
		}
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

}//End of Class
