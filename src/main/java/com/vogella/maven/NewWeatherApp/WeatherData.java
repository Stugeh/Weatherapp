package com.vogella.maven.NewWeatherApp;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.json.JSONObject;

public class WeatherData {
	
	private String dlySummary, hrlySummary, crntSummary;
	private String temperature, time, precipIntensity, precipProbability, apparentTemperature, humidity, windSpeed, windBearing, cloudCover, visibility, ozone;
	
	public WeatherData(HttpResponse<JsonNode> response) {
		JSONObject data = response.getBody().getObject();		
		JSONObject current = (JSONObject) data.get("currently");
		JSONObject hourly = (JSONObject) data.get("hourly");
		JSONObject daily = (JSONObject) data.get("daily");
		
		
		System.out.println("\n\n");
		System.out.println(current.keySet());
		System.out.println("\n\n");
		
		this.apparentTemperature = current.getString("apparentTemperature");
		this.cloudCover = current.getString("cloudCover");
		this.humidity = current.getString("humidity");
		this.ozone = current.getString("ozone");
		this.precipIntensity = current.getString("precipIntensity");
		this.precipProbability = current.getString("precipProbability");
		this.temperature = current.getString("temperature");
		this.time = current.getString("time");
		this.visibility = current.getString("visibility");
		this.windBearing = current.getString("windBearing");
		this.windSpeed = current.getString("windSpeed");
		this.dlySummary = daily.getString("summary");
		this.hrlySummary = hourly.getString("summary");
		this.crntSummary = current.getString("summary");
    }

	@Override
	public String toString() {
		return "WeatherData [dlySummary=" + dlySummary + ", hrlySummary=" + hrlySummary + ", crntSummary=" + crntSummary
				+ ", temperature=" + temperature + ", time=" + time + ", precipIntensity=" + precipIntensity
				+ ", precipProbability=" + precipProbability + ", apparentTemperature=" + apparentTemperature
				+ ", humidity=" + humidity + ", windSpeed=" + windSpeed + ", windBearing=" + windBearing
				+ ", cloudCover=" + cloudCover + ", visibility=" + visibility + ", ozone=" + ozone + "]";
	}

	
	/*Getters and setters*/
	
	
	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getPrecipIntensity() {
		return precipIntensity;
	}


	public void setPrecipIntensity(String precipIntensity) {
		this.precipIntensity = precipIntensity;
	}


	public String getPrecipProbability() {
		return precipProbability;
	}


	public void setPrecipProbability(String precipProbability) {
		this.precipProbability = precipProbability;
	}


	public String getApparentTemperature() {
		return apparentTemperature;
	}


	public void setApparentTemperature(String apparentTemperature) {
		this.apparentTemperature = apparentTemperature;
	}


	public String getHumidity() {
		return humidity;
	}


	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}


	public String getWindBearing() {
		return windBearing;
	}


	public void setWindBearing(String windBearing) {
		this.windBearing = windBearing;
	}


	public String getCloudCover() {
		return cloudCover;
	}


	public void setCloudCover(String cloudCover) {
		this.cloudCover = cloudCover;
	}


	public String getVisibility() {
		return visibility;
	}


	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}


	public String getOzone() {
		return ozone;
	}


	public void setOzone(String ozone) {
		this.ozone = ozone;
	}


	public String getDlySummary() {
		return dlySummary;
	}


	public void setDlySummary(String dlySummary) {
		this.dlySummary = dlySummary;
	}


	public String getTemperature() {
		return temperature;
	}


	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}


	public String getWindSpeed() {
		return windSpeed;
	}


	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}


	public String getHrlySummary() {
		return hrlySummary;
	}


	public void setHrlySummary(String hrlySummary) {
		this.hrlySummary = hrlySummary;
	}


	public String getCrntSummary() {
		return crntSummary;
	}


	public void setCrntSummary(String crntSummary) {
		this.crntSummary = crntSummary;
	}
}
