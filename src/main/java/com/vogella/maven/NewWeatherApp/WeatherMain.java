package com.vogella.maven.NewWeatherApp;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class WeatherMain {
	
	public static void main(String[] args) throws Exception{
		@SuppressWarnings("unused")
		HttpResponse<kong.unirest.JsonNode> response = Unirest.get("https://api.darksky.net/forecast/847c94249ad8a47be419557c13ede9a3/65.5267,25.4233").asJson(); 		
		WeatherData weather = new WeatherData(response);
		System.out.println(weather);

		
		
				
				
		//WeatherData currently = new WeatherData(response, "currently");
				 
				 
		//response = Unirest.toString(response);
		//System.out.printf(temperature, "C\n", summary );
		
		
		System.out.println(response.getBody().getObject().keySet());
		//System.out.println(response.getBody().getObject().get("Hourly"["Summary"]
			//	);
		
		
		
	
	}
}

