package com.vogella.maven.NewWeatherApp;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class DiscordBot extends ListenerAdapter{
	
		public void onGuildMessageReceived(GuildMessageReceivedEvent event){
			System.out.println("**********************GOT HERE********************************************");
			
			String messageSent = event.getMessage().getContentRaw();
			if(messageSent.equalsIgnoreCase("!weather")) {
				HttpResponse<kong.unirest.JsonNode> response = Unirest.get("https://api.darksky.net/forecast/847c94249ad8a47be419557c13ede9a3/65.5267,25.4233").asJson(); 		
				WeatherData weather = new WeatherData(response);
				event.getChannel().sendMessage(weather.toString());
			}
	}
}
