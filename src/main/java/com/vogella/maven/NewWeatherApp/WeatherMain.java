package com.vogella.maven.NewWeatherApp;
import kong.unirest.*;

public class WeatherMain {
	
	public static void main(String[] args) throws Exception{
		
		final HttpResponse<JsonNode> response = Unirest.get("https://api.darksky.net/forecast/847c94249ad8a47be419557c13ede9a3/65.5267,25.4233").asJson(); 
			
				 //String summary = response.getBody().getObject().getString("summary");
				 //String temperature = response.getBody().getObject().getString("temperature");
				 
		//response = Unirest.toString(response);
		//System.out.printf(temperature, "C\n", summary );
		
		
		System.out.println(response.getBody().getObject().keySet());
		//System.out.println(response.getBody().getObject().get("Hourly"["Summary"]
			//	);
		
		
		
	
	}
}

