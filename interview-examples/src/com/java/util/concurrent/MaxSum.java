package com.java.util.concurrent;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MaxSum {

	public static void main(String[] args) {
		
		int [] [] matrix = new int [3][3];
		Scanner scanner =  new Scanner(System.in);
		
		for(int i=0;i<3 ;i++){
			for(int j=0;j< 3 ;j++)
			matrix[i][j]=j+2+i;
		}
		
		for(int i=0;i<3 ;i++){
			for(int j=0;j< 3 ;j++)
			System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		Result result = new  Result();
		service.execute(new Task(matrix[0],result));
		service.execute(new Task(matrix[1],result));
		service.execute(new Task(matrix[2],result));
		try {
		service.awaitTermination(3, TimeUnit.SECONDS) ; 
			 System.out.println("Result - " + result.getMax());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

class Task implements Runnable {

	private int [] row ;
	private Result result;
	
	public Task(int [] row, Result result) {
		this.row= row;
		this.result = result;
	}
	@Override
	public void run() {
		int sum =0;
		for(int i : row ){
			sum += i;
		}
		System.out.println(sum);
		result.updateMax(sum);
		
	}
	
}



class Result {
	 
	private int  Max ;

	public int getMax() {
		return Max;
	}
	
	public synchronized void updateMax(int sum ){
		if(sum <= Max) 
			return;
		Max=sum;
	}
	
	 
	 
	
}
