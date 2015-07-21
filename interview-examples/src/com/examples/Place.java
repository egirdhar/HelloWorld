package com.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Place {
	
	private String name;
	private String code;
	
	private List<Place> places;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String[] getPlaceNames(){
		String [] names = new String[places.size()];
		int i=0;
		for(Place place : places){
			names[i]=place.getName();
			i++;
		}
		return names;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}
	
	public List<Place> getPlaces() {
		return places;
	}

	public List<String > resolvePlaces(Place  place){		
	
		List<String > names = new ArrayList<String>();
		names.add(place.getName());
		for(Place subPlace : place.getPlaces()){
			resolvePlaces(subPlace);
		}
		return names;
	}
}

	