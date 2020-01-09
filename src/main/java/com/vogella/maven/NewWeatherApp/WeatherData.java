package com.vogella.maven.NewWeatherApp;

import java.util.Map;

public class WeatherData {
	
	private String summary, temperature;
	private String currently, hourly, daily;
	

    
	@SuppressWarnings("unchecked")
	private void unpackNested(Map<String,Object> keylist, String key) {
		Map<String,String> timeframe = (Map<String, String>)keylist.get(key);
        this.summary = (String)timeframe.get("summary");
        this.temperature = (String)timeframe.get("temperature");
        
    }

	
	/*Getters and setters*/
	
	public String getSummary() {
		return summary;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}


	public String getTemperature() {
		return temperature;
	}


	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}


	public String getCurrently() {
		return currently;
	}


	public void setCurrently(String currently) {
		this.currently = currently;
	}


	public String getHourly() {
		return hourly;
	}


	public void setHourly(String hourly) {
		this.hourly = hourly;
	}


	public String getDaily() {
		return daily;
	}


	public void setDaily(String daily) {
		this.daily = daily;
	}
}
