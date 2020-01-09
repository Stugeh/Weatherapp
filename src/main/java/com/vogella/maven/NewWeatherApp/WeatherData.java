package com.vogella.maven.NewWeatherApp;

public class WeatherData {
	
	private String summary, temperature;
	private String currently, hourly, daily;
	
	public WeatherData(String summary, String Temperature) {
		
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
