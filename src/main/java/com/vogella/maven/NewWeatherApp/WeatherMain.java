package com.vogella.maven.NewWeatherApp;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class WeatherMain {
	
	public static void main(String[] args) throws Exception{
		@SuppressWarnings("unused")
		HttpResponse<kong.unirest.JsonNode> response = Unirest.get("https://api.darksky.net/forecast/847c94249ad8a47be419557c13ede9a3/65.5267,25.4233").asJson(); 		
		WeatherData weather = new WeatherData(response);
		System.out.println(weather);
	    JFrame f = new JFrame("A JFrame");
	    f.setSize(250, 250);
	    f.setLocation(300,200);
	    final JTextArea textArea = new JTextArea(10, 40);
	    f.getContentPane().add(BorderLayout.CENTER, textArea);
	    final JButton button = new JButton("Click Me");
	    f.getContentPane().add(BorderLayout.SOUTH, button);
	    button.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            textArea.append("Button was clicked\n");

	        }
	    });

	    f.setVisible(true);

	  }

	}
