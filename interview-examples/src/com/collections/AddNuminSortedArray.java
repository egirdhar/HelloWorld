package com.collections;

import java.util.Arrays;
import java.util.Collections;

public class AddNuminSortedArray {

	public static void main(String[] args) {
		Integer [] orginalArr= new Integer [5];
		int  i =6;
		orginalArr[0]=4;
		orginalArr[1]=5;
		orginalArr[2]=7;
		orginalArr[3]=8;
		orginalArr[4]=i;
		
		Collections.sort(Arrays.asList(orginalArr));
		
		for(int x : orginalArr){
			System.out.print(x + " ");
		}
		
	}
}
