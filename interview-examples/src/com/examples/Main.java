package com.examples;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Place country= new Place();
		country.setName("India");
		
		Place state1= new Place();
		state1.setName("Maharashtra");
		
		Place state2= new Place();
		state2.setName("Gujrat");
		
		Place city1= new Place();
		city1.setName("Bombay");
		
		Place city2= new Place();
		city2.setName("Pune");
		
		Place city3= new Place();
		city3.setName("Ahmedabad");
		
		Place city4= new Place();
		city4.setName("Baroda");
		
		List<Place> state1_cities =new ArrayList<Place>();
		state1_cities.add(city1); 
		state1_cities.add(city2);
		
		state1.setPlaces(state1_cities);
		
		List<Place> state2_cities =new ArrayList<Place>();
		state2_cities.add(city3); 
		state2_cities.add(city4);
		
		state2.setPlaces(state2_cities);
		
		List<Place> country_states =new ArrayList<Place>();
		country_states.add(state1); 
		country_states.add(state2);		
		country.setPlaces(country_states);		
		
	/*	for( String name : country.resolvePlaces(country) ){
			System.out.println(name);
		}
	*/
		getInfo(country);
	
		
	}
	
	public static void getInfo (Place country){
	
		if (country.getPlaces() ==null ) 
			return;
		for(Place state : country.getPlaces()){
			System.out.println(state.getName());
			getInfo(state);
		}
	}
}
