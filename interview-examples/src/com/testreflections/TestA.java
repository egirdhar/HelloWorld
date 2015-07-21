package com.testreflections;

public class TestA {

	
	 static void sendMessage(TestA a){
		System.out.println("message from" + TestA.class.getName());
	}
}
