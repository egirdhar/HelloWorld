package com.testreflections;

enum NewGrade { A (new TestB( "Excellent")) , B(new TestB("Good")) , C ( new TestB("Ok")); 

	 NewGrade(TestB b) {
		this.testB =b;
	}
	
	private TestB testB;
	
	TestB getTestB(){
		return testB;  
	}

}; 

enum Grade { A (10) , B(7) , C(3) ;

	 Grade(int strength) {
		this.strength= strength;
		
	}
	
	private int strength;

};

public class TestB extends TestA {

	
	 void sendMessage(TestB b){
		System.out.println("message from" + TestB.class.getName());
		NewGrade grade = NewGrade.A;
		TestB b = grade.getTestB();
		super.sendMessage(this);
		
	}
	 
	 public TestB() {
		// TODO Auto-generated constructor stub
	}
	 public TestB(String s) {
	     super();
		 this();	 
		 this.s=s;
		 super.sendMessage();
		
	} 
	 
	 private String s;
	 
	 String getS(){
		 return s;
	 }
}
