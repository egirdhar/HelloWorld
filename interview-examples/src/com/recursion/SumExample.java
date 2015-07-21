package com.recursion;

import java.beans.FeatureDescriptor;

public class SumExample {
	
	public static void main(String[] args) {
		//new  SumExample().febonii(0, 1, 15);
		System.out.println(new  SumExample().sum(1, 6, 0));
	}

   
	public void febonii (int p , int n , int total){
		if(n <= total){
			
			System.out.print(p +" ");
			System.out.println("n =" + n +" " + "p =" + p);
			int t=p;
			p =n; n=t+n;
			febonii(p, n, total);
		}

	}
	
	
	public int sum(int num, int last, int result){
		
		if(num < last){
			
			result= num+ result;
			System.out.print( result + " ");
			num ++;
			result=sum(num,last,result);
		}
		return result;
	}
}
