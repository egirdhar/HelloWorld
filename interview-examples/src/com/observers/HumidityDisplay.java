package com.observers;

public class HumidityDisplay extends Display {

	
	public HumidityDisplay(WeatherMeasurement measurement) {
	  this.measurement =measurement;
	  measurement.addDisplay(this);
	}
	
	@Override
	void display() {
		System.out.println("Humidity is " + measurement.getHumidity());
		
	}

}
