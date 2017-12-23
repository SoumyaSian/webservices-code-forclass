package com.dyasha.mywebapp.rest.util;

import com.dyasha.mywebapp.entity.google.GeocodeResponse;

/*import com.dyasha.mywebapp.entity.google.GeocodeResponse;
import com.dyasha.mywebapp.entity.google.GeocodeResponse.Result;
import com.dyasha.mywebapp.entity.google.GeocodeResponse.Result.Geometry;
import com.dyasha.mywebapp.entity.google.GeocodeResponse.Result.Geometry.Location*/;

public class RestClientUtil {
	
	private RestClientUtil() {}
	
	public static String[] getLatLongFromGoogleResp(GeocodeResponse googleResp) {
		 
		String[] ouput = new String[2];
		ouput[0] = googleResp.getResult().getGeometry().getLocation().getLat()+"";
		ouput[1] = googleResp.getResult().getGeometry().getLocation().getLng()+"";
		
		/*List<Result> results= googleResp.getResult().getGeometry().getLocation().getLat();
		for(Result result : results) {
			List<Geometry> geos = result.getGeometry();
			for(Geometry geo : geos) {
				List<Location> locs = geo.getLocation();
				for(Location loc : locs) {
					ouput[0]=googleResp.getResult().getGeometry().getLocation().getLat();
					ouput[1]=loc.getLng();
				}
			}
		}*/
	
		return ouput;
		
	}//End of getLatLongFromGoogleResp()
	
}//End of Class
