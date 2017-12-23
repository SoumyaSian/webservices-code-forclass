package com.dyasha.mywebapp.entity.weather.data;

import com.dyasha.mywebapp.entity.weather.json.WeatherDetailsJSON;
import com.dyasha.mywebapp.entity.weather.xml.WeatherDetailsXML;

public class WeatherDetails {
	
	private double coord_lon;
	private double coord_lat;
	private int weather_0_id;
	private String weather_0_main;
	private String weather_0_description;
	private String weather_0_icon;
	private double main_temp;
	private double main_pressure;
	private double main_humidity;
	private double main_temp_min;
	private double main_temp_max;
	private double wind_speed;
	private double wind_deg;
	private int cloud_all;
	private String sys_country;
	private String sys_sunrise;
	private long id;
	
	public WeatherDetails(){}
	
	public WeatherDetails(WeatherDetailsXML data){
		
		   this.coord_lon = data.getCity().getCoord().getLon();
		   this.coord_lat = data.getCity().getCoord().getLat();
		   this.weather_0_id = data.getWeather().getNumber();
		   this.weather_0_main = data.getPrecipitation().getMode();
		   this.weather_0_description = data.getWeather().getValue();
		   this.weather_0_icon = data.getWeather().getIcon();
		   this.main_temp = data.getTemperature().getValue();
		   this.main_pressure = data.getPressure().getValue();
		   this.main_humidity = data.getHumidity().getValue();
		   this.main_temp_min = data.getTemperature().getMin();
		   this.main_temp_max = data.getTemperature().getMax();
		   this.wind_speed = data.getWind().getSpeed().getValue();
		   this.wind_deg = data.getWind().getDirection().getValue();
		   this.cloud_all = data.getClouds().getValue();
		   this.sys_country = data.getCity().getCountry();
		   this.sys_sunrise = data.getCity().getSun().getRise().toString();
		   this.id = data.getCity().getId();
	}
	
	public WeatherDetails(WeatherDetailsJSON data){
		this.coord_lon = data.getCoord().getLon();
		   this.coord_lat = data.getCoord().getLat();
		   this.weather_0_id = data.getWeather().get(0).getId();
		   this.weather_0_main = data.getWeather().get(0).getMain();
		   this.weather_0_description = data.getWeather().get(0).getDescription();
		   this.weather_0_icon = data.getWeather().get(0).getIcon();
		   this.main_temp = data.getMain().getTemp();
		   this.main_pressure = data.getMain().getPressure();
		   this.main_humidity = data.getMain().getHumidity();
		   this.main_temp_min = data.getMain().getTempMin();
		   this.main_temp_max = data.getMain().getTempMax();
		   this.wind_speed = data.getWind().getSpeed();
		   this.wind_deg = data.getWind().getDeg();
		   this.cloud_all = data.getClouds().getAll();
		   this.sys_country = (String)data.getSys().getCountry();
		   this.sys_sunrise = data.getSys().getSunrise().toString();
		   this.id = data.getId();
	}
	
	public double getCoord_lon() {
		return coord_lon;
	}
	public void setCoord_lon(double coord_lon) {
		this.coord_lon = coord_lon;
	}
	public double getCoord_lat() {
		return coord_lat;
	}
	public void setCoord_lat(double coord_lat) {
		this.coord_lat = coord_lat;
	}
	public int getWeather_0_id() {
		return weather_0_id;
	}
	public void setWeather_0_id(int weather_0_id) {
		this.weather_0_id = weather_0_id;
	}
	public String getWeather_0_main() {
		return weather_0_main;
	}
	public void setWeather_0_main(String weather_0_main) {
		this.weather_0_main = weather_0_main;
	}
	public String getWeather_0_description() {
		return weather_0_description;
	}
	public void setWeather_0_description(String weather_0_description) {
		this.weather_0_description = weather_0_description;
	}
	public String getWeather_0_icon() {
		return weather_0_icon;
	}
	public void setWeather_0_icon(String weather_0_icon) {
		this.weather_0_icon = weather_0_icon;
	}
	
	
	public double getMain_temp() {
		return main_temp;
	}
	public void setMain_temp(double main_temp) {
		this.main_temp = main_temp;
	}
	public double getMain_pressure() {
		return main_pressure;
	}
	public void setMain_pressure(double main_pressure) {
		this.main_pressure = main_pressure;
	}
	public double getMain_humidity() {
		return main_humidity;
	}
	public void setMain_humidity(double main_humidity) {
		this.main_humidity = main_humidity;
	}
	public double getMain_temp_min() {
		return main_temp_min;
	}
	public void setMain_temp_min(double main_temp_min) {
		this.main_temp_min = main_temp_min;
	}
	public double getMain_temp_max() {
		return main_temp_max;
	}
	public void setMain_temp_max(double main_temp_max) {
		this.main_temp_max = main_temp_max;
	}
	
	public double getWind_speed() {
		return wind_speed;
	}
	public void setWind_speed(double wind_speed) {
		this.wind_speed = wind_speed;
	}
	public double getWind_deg() {
		return wind_deg;
	}
	public void setWind_deg(double wind_deg) {
		this.wind_deg = wind_deg;
	}
	
	public int getCloud_all() {
		return cloud_all;
	}
	public void setCloud_all(int cloud_all) {
		this.cloud_all = cloud_all;
	}
	
	public String getSys_country() {
		return sys_country;
	}
	public void setSys_country(String sys_country) {
		this.sys_country = sys_country;
	}
	public String getSys_sunrise() {
		return sys_sunrise;
	}
	public void setSys_sunrise(String sys_sunrise) {
		this.sys_sunrise = sys_sunrise;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "WeatherDetails [coord_lon=" + coord_lon + ", coord_lat=" + coord_lat + ", weather_0_id=" + weather_0_id
				+ ", weather_0_main=" + weather_0_main + ", weather_0_description=" + weather_0_description
				+ ", weather_0_icon=" + weather_0_icon + ", main_temp=" + main_temp + ", main_pressure=" + main_pressure
				+ ", main_humidity=" + main_humidity + ", main_temp_min=" + main_temp_min + ", main_temp_max="
				+ main_temp_max + ", wind_speed=" + wind_speed + ", wind_deg=" + wind_deg + ", cloud_all=" + cloud_all
				+ ", sys_country=" + sys_country + ", sys_sunrise=" + sys_sunrise + ", id=" + id + "]";
	}

/*	@Override
	public String toString() {
		return "WeatherDetails [\n coord_lon=" + coord_lon + "\n coord_lat=" + coord_lat + "\n weather_0_id=" + weather_0_id
				+ "\n weather_0_main=" + weather_0_main + "\n weather_0_description=" + weather_0_description
				+ "\n weather_0_icon=" + weather_0_icon + "\n main_temp=" + main_temp + "\n main_pressure=" + main_pressure
				+ "\n main_humidity=" + main_humidity + "\n main_temp_min=" + main_temp_min + "\n main_temp_max="
				+ main_temp_max + "\n wind_speed=" + wind_speed + "\n wind_deg=" + wind_deg + "\n cloud_all=" + cloud_all
				+ "\n]";
	}*/
}
