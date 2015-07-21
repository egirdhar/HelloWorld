package com.kadaneAlg;

public class FindMaxSumArray {

	public static void main(String[] args) {
		
		int A[] = {-1,-1,2,-1,6};
		System.out.println(findMaxSum(A));
		
	}
	
	static int findMaxSum(int A[]){
		int max_so_far = 0;
	    int max_ending_here = 0;
	    for(int i=0;i<A.length;i++){
	    	max_ending_here = max_ending_here+A[i];
	    	if(max_ending_here< 0){
	    		max_ending_here=0;
	    	}
	    	if(max_so_far < max_ending_here){
	    		max_so_far = max_ending_here;
	    	}
	    }
	    return max_so_far;
	}
}
