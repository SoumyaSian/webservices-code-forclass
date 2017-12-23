package com.dyasha.mywebapp.rest.constants;

public interface RestClientConstants {

	String XML = "xml";
	String JSON = "json";
	
	String googleAPIkey = "AIzaSyA_sDGm8iaf_9qS2myW-GqZV9zj2B55ZrY";
	
	String googleSericeUrlXml = "https://maps.googleapis.com/maps/api/geocode/"+XML+"?key="+googleAPIkey+"&address=";
	String googleSericeUrlJson = "https://maps.googleapis.com/maps/api/geocode/"+JSON+"?key="+googleAPIkey+"&address=";
	
}
