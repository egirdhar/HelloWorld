package com.careercup;

import java.util.ArrayList;
import java.util.List;

public class Comb {
	public static void main(String[] args) {
		
		int A[] ={1,2,2,3};
		System.out.print( findAll(A) );
	}
	
	private static List< List<Integer>> findAll(int A[]){
		List<List<Integer>> resultList= new ArrayList<List<Integer>>();
		for(int i=0;i<A.length;i++){
			List<Integer> list= new ArrayList<Integer>();
			for(int j=i+1;j>A.length;j++) 
			if(A[i]==A[j]) {
			   list.add(A[i]);
			   list.add(A[i]);
			   resultList.add(list);
			}
			else{			
			list.add(A[i]);
			resultList.add(list);
			}
		}
		return resultList;
	}

}
