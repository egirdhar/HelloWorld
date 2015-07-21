
package com.collections;

public class Demo {

	public static void main(String[] args) {
	
		CustomQ customQ = new CustomQ(4);
	/*	System.out.println(customQ.get() );
		customQ.put("Girdhar");
		System.out.println(customQ.get() );
		customQ.put("Ramesh");
		System.out.println(customQ.get() );*/
		customQ.put("Man");
		customQ.put("saw");
		customQ.put("erer");
		customQ.put("erer");
		customQ.put("erer");
		customQ.put("erer");
		
		System.out.println(customQ.get() );
		System.out.println(customQ.get() );
		
		customQ.put("erer");
		System.out.println("add more");
		customQ.put("erer");
		System.out.println(customQ.get() );
		
	}
	
	
}
