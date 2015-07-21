package com.observers;

public class Demo {
	
	public static void main(String[] args) {
		WeatherMeasurement measurement = new WeatherMeasurement();
		TemperatureDisplay temperatureDisplay = new TemperatureDisplay(measurement);
		PressureDisplay pressureDisplay = new PressureDisplay(measurement);
		HumidityDisplay humidityDisplay = new HumidityDisplay(measurement);
		measurement.setWeather(34.45f, 45, 30);
	}

}
