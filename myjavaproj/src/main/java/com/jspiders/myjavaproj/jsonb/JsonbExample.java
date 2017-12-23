package com.jspiders.myjavaproj.jsonb;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.json.bind.JsonbConfig;
//https://dzone.com/articles/jsonb-java-api-for-json-binding
//http://json-b.net/
public class JsonbExample {
	public static void main(String[] args) {
		
		JsonbConfig config = new JsonbConfig().withFormatting(Boolean.TRUE);
		
		 JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
		 arrayBuilder.add(12);
		 arrayBuilder.add(12.13);
		 arrayBuilder.add(true);
		 
		 JsonObjectBuilder builder2 = Json.createObjectBuilder()
		            .add("val1", "1111")
		            .add("val2", "2222");
		            
		JsonObjectBuilder builder = Json.createObjectBuilder()
	            .add("success", "1111")
	            .add("deletedSize", "22")
	            .addNull("isNull")
	            .add("integer", 100)
	            .add("decimal", 100.123)
	            .add("array", arrayBuilder)
	            .add("object", builder2)
	            ;
	    
	    /*if (!errors.isEmpty()) {
	        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
	        for (WriteError writeError : errors) {
	            arrayBuilder.add(writeError.toJson());
	        }
	        builder.add("errors", arrayBuilder.build());
	    }*/
	    
//	    builder.build();
		System.out.println(builder.build().toString());
		
		
	}
}
