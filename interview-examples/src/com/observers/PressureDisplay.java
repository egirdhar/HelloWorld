package com.observers;

public class PressureDisplay extends Display {

	public PressureDisplay(WeatherMeasurement measurement) {
		  this.measurement =measurement;
		  measurement.addDisplay(this);
		}
		
	@Override
	void display() {
		System.out.println("Pressure  is " + measurement.getPressure());
		
	}

}
