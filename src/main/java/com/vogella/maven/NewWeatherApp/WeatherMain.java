package com.vogella.maven.NewWeatherApp;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;



public class WeatherMain {
	
	public static void main(String[] args) throws Exception{
		HttpResponse<kong.unirest.JsonNode> response = Unirest.get("https://api.darksky.net/forecast/847c94249ad8a47be419557c13ede9a3/65.5267,25.4233").asJson(); 		
		JDA jda = new JDABuilder(token).build();
		jda.addEventListener(new DiscordBot());
		
	}
}
