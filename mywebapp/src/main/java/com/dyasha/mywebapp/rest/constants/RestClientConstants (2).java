package com.dyasha.mywebapp.rest.constants;

public interface RestClientConstants {

	String TYPE = "XML";

	String XML = "xml";
	String JSON = "json";
	
	String GOOGLE_API_KEY = "AIzaSyA_sDGm8iaf_9qS2myW-GqZV9zj2B55ZrY";
	String GEOCODE_XML_URL = "https://maps.googleapis.com/maps/api/geocode/"+XML+"?key="+GOOGLE_API_KEY+"&address=";
	String GEOCODE_JSON_URL = "https://maps.googleapis.com/maps/api/geocode/"+JSON+"?key="+GOOGLE_API_KEY+"&address=";

	String WEATHER_DETAILS_XML_URL = "http://api.openweathermap.org/data/2.5/weather?mode="+XML;
	String WEATHER_DETAILS_JSON_URL = "http://api.openweathermap.org/data/2.5/weather?mode="+JSON;
	String WEATHER_DETAILS_APPID = "573aea3508e39c8d75a6d70c75d118cc";

	String IP_ADDRESS_URL_XML = "http://freegeoip.net/xml/";
	String IP_ADDRESS_URL_JSON = "http://freegeoip.net/json/";

}
