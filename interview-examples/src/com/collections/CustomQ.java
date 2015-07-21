package com.collections;

public class CustomQ {

	private int insertPos;
	
	private String [] elements;
	
	public CustomQ(int size) {
		elements = new String [size];
	}
	
	public void put(String s){
		if(insertPos >= elements.length){
			System.out.println("Queue is full now");
		}
		else
		{
			elements[insertPos]=s;
			insertPos++;
		}
		
	}
	
	public String get(){
		if(elements[0]!=null){
			int i=0;
			String returnedEle = elements[0];
			while(i<insertPos){
				elements[i]=elements[i+1];
				i++;
			}
			insertPos--;
			return returnedEle;
		}
		else
		{
			System.out.println("No element");
			return null;
		}
	}
	
}


