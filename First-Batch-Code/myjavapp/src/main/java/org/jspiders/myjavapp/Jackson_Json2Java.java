package org.jspiders.myjavapp;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

public class Jackson_Json2Java 
{
	public static void main(String[] args) throws Exception 
	{
		ObjectMapper mapper = new ObjectMapper();
		Company cmp = mapper.readValue(new File("jackson-company.json"), Company.class);
		System.out.println("Data From JSON is : ");
		System.out.println(cmp);
		
	}//End of Main
}//End of Class






