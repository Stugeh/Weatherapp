package com.vogella.maven.NewWeatherApp;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.json.JSONObject;

import java.time.LocalTime;;

public class WeatherData {

	private String dlySummary, hrlySummary, crntSummary;
	private String time, precipIntensity, precipProbability, humidity, windBearing, cloudCover, visibility, ozone;
	private double apparentTemperature, temperature, windSpeed;
	private LocalTime clock;

	public WeatherData(HttpResponse<JsonNode> response) {
		JSONObject data = response.getBody().getObject();
		JSONObject current = (JSONObject) data.get("currently");
		JSONObject hourly = (JSONObject) data.get("hourly");
		JSONObject daily = (JSONObject) data.get("daily");
		
		this.setClock(LocalTime.now());
		this.temperature = (current.getDouble("temperature") - 32) * 5 / 9;
		this.apparentTemperature = (current.getDouble("apparentTemperature") - 32) * 5 / 9;
		this.cloudCover = current.getString("cloudCover");
		this.humidity = current.getString("humidity");
		this.ozone = current.getString("ozone");
		this.precipIntensity = current.getString("precipIntensity");
		this.precipProbability = current.getString("precipProbability");
		this.time = current.getString("time");
		this.visibility = current.getString("visibility");
		this.windSpeed = current.getDouble("windSpeed") * 0.44704;
		this.windBearing = current.getString("windBearing");
		this.dlySummary = daily.getString("summary");
		this.hrlySummary = hourly.getString("summary");
		this.crntSummary = current.getString("summary");
	}

	@Override
	public String toString() {
		return clock + "\n\ndaily Summary=" + dlySummary + " \nhourly Summary=" + hrlySummary + " \ncurrent Summary="
				+ crntSummary + " \n\ntemperature=" + temperature + " \napparentTemperature=" + apparentTemperature
				+ " \n\nprecipIntensity=" + precipIntensity + " \nprecipProbability=" + precipProbability
				+ " \nhumidity=" + humidity + " \n\nwindSpeed=" + windSpeed + " \nwindBearing=" + windBearing
				+ " \n\ncloudCover=" + cloudCover + " \nvisibility=" + visibility + " \nozone=" + ozone;
	}

	/* Getters and setters */

	/**
	 * @return the dlySummary
	 */
	public String getDlySummary() {
		return dlySummary;
	}

	/**
	 * @param dlySummary the dlySummary to set
	 */
	public void setDlySummary(String dlySummary) {
		this.dlySummary = dlySummary;
	}

	/**
	 * @return the hrlySummary
	 */
	public String getHrlySummary() {
		return hrlySummary;
	}

	/**
	 * @param hrlySummary the hrlySummary to set
	 */
	public void setHrlySummary(String hrlySummary) {
		this.hrlySummary = hrlySummary;
	}

	/**
	 * @return the crntSummary
	 */
	public String getCrntSummary() {
		return crntSummary;
	}

	/**
	 * @param crntSummary the crntSummary to set
	 */
	public void setCrntSummary(String crntSummary) {
		this.crntSummary = crntSummary;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the precipIntensity
	 */
	public String getPrecipIntensity() {
		return precipIntensity;
	}

	/**
	 * @param precipIntensity the precipIntensity to set
	 */
	public void setPrecipIntensity(String precipIntensity) {
		this.precipIntensity = precipIntensity;
	}

	/**
	 * @return the precipProbability
	 */
	public String getPrecipProbability() {
		return precipProbability;
	}

	/**
	 * @param precipProbability the precipProbability to set
	 */
	public void setPrecipProbability(String precipProbability) {
		this.precipProbability = precipProbability;
	}

	/**
	 * @return the humidity
	 */
	public String getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	/**
	 * @return the windSpeed
	 */
	public double getWindSpeed() {
		return windSpeed;
	}

	/**
	 * @param windSpeed the windSpeed to set
	 */
	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}

	/**
	 * @return the windBearing
	 */
	public String getWindBearing() {
		return windBearing;
	}

	/**
	 * @param windBearing the windBearing to set
	 */
	public void setWindBearing(String windBearing) {
		this.windBearing = windBearing;
	}

	/**
	 * @return the cloudCover
	 */
	public String getCloudCover() {
		return cloudCover;
	}

	/**
	 * @param cloudCover the cloudCover to set
	 */
	public void setCloudCover(String cloudCover) {
		this.cloudCover = cloudCover;
	}

	/**
	 * @return the visibility
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * @param visibility the visibility to set
	 */
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	/**
	 * @return the ozone
	 */
	public String getOzone() {
		return ozone;
	}

	/**
	 * @param ozone the ozone to set
	 */
	public void setOzone(String ozone) {
		this.ozone = ozone;
	}

	/**
	 * @return the apparentTemperature
	 */
	public double getApparentTemperature() {
		return apparentTemperature;
	}

	/**
	 * @param apparentTemperature the apparentTemperature to set
	 */
	public void setApparentTemperature(double apparentTemperature) {
		this.apparentTemperature = apparentTemperature;
	}

	/**
	 * @return the temperature
	 */
	public double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public LocalTime getClock() {
		return clock;
	}

	public void setClock(LocalTime clock) {
		this.clock = clock;
	}

}
