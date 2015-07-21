package com.observers;

public class TemperatureDisplay extends Display{

	
	public TemperatureDisplay(WeatherMeasurement measurement) {
		  this.measurement =measurement;
		}
		
	
	@Override
	void display() {
		System.out.println("Temperature is " + measurement.getTemp());
		
	}

}
