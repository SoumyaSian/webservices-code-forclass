package org.jspiders.myjavapp;

import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class JaxbUnMarshaller 
{
	public static void main(String[] args) 
	{
		try 
		{
			JAXBContext jaxbContext 
				= JAXBContext.newInstance(Company.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Company data = (Company)unmarshaller.unmarshal(new FileReader("company.xml"));
			
			System.out.println("Data In XML ..."+data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
