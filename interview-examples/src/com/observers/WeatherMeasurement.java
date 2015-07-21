package com.observers;

import java.util.ArrayList;
import java.util.List;

public class WeatherMeasurement {
	
	private List<Display> displays ;
	private float temp ;
	private int pressure ;
	private int humidity ;
	
	
	
	public float getTemp() {
		return temp;
	}

	public int getPressure() {
		return pressure;
	}

	public int getHumidity() {
		return humidity;
	}

	public WeatherMeasurement() {
		
		displays = new ArrayList<Display>();
	}
	
	public void setWeather(float temp, int pressure, int humidity) { 
		this.temp= temp;
		this.humidity =humidity;
		this.pressure = pressure;
		notifyDisplays();
	}
	
	private void notifyDisplays(){
		for(Display display : displays){
			display.display();
		}
	}
	
	public void addDisplay(Display display){
		displays.add(display);
	}
	

}
