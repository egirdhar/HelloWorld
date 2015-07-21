package com.testreflections;

import java.lang.reflect.Method;

public class Demo {
	
	public static void main(String[] args) {
		SimplePojo pojo = new SimplePojo("Simple", 4567);
		 Method [] methods = pojo.getClass().getMethods();
		 for(Method method : methods){
		//	 System.out.println("-" + method.getName());
			if ( method.getName().startsWith("set") ) {
			 System.out.println(method.getName());
			
			}
		 }
	}

}
