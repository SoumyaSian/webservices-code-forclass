package org.jspiders.myjavapp;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.jspiders.pojo.GenerateGoogleResponseData;
import org.jspiders.pojo.GeocodeResponse;

public class Jackson_Java2Json 
{
	public static void main(String[] args) throws Exception 
	{
		//Company ref = GenerateData.generate();
		GeocodeResponse ref = GenerateGoogleResponseData.generateData();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("jackson-google-maps.json"), ref);
		String json = mapper.defaultPrettyPrintingWriter().writeValueAsString(ref);
		System.out.println(json);
	}//End of Main
}//End of Class






