package com.recursion;

public class Demo {
	
	public static void main(String[] args) {
		Word word =new Word();
		String a[] =word.getWords("M");
		if(a!=null){
			for(String s : a){
				System.out.print(s + " ");
			}
		}
	}

}






 class Word {
	 
	 String a [] = {"A", "B", "C"};
	 String b [] = {"X", "Y", "Z"};
	 
	 
	 String [] getWords (String s){
		
		for(int i=0;i<a.length;i++){
			if(a[i].equals(s)){
				return a;				
			}
		}
		for(int i=0;i<b.length;i++){
			if(b[i].equals(s)){
				return b;				
			}
		}
		return null;
	 }
 }
