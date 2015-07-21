package com.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		System.out.println(add(5,0) );
		List<Integer> all = new ArrayList<Integer>();
		getAllResult(5, 0, all) ;
		System.out.println("------------------");
		Collections.reverse(all);
		for(Integer i : all){
			System.out.print( i + " ");
		}
	}
  
	static int add(int n, int result){
		
		if(n > 0){	
	
		result=result+n;
		n--;
		result=add(n, result);
		
		}
		
		return result;
		
		
	}
	
	
static List<Integer> getAllResult(int n, int result,List<Integer> all){
		
		if(n > 0){	
	
		result=result+n;
		n--;
		getAllResult(n, result,all);
		all.add(result);
		}
		
		
		return all;
		
	}

}



