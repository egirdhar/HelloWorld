package com.threads;

import java.util.concurrent.CountDownLatch;



public class Demo4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Result5 result = new Result5();
		CountDownLatch  startSignal = new CountDownLatch(1);
		CountDownLatch  stopSignal = new CountDownLatch(2);
		Thread thread =new Thread(new additionJob5(result,startSignal,stopSignal));
		thread.start();
		System.out.println("Lets start");
		startSignal.countDown();
		Thread thread2 =new Thread(new additionJob5(result,startSignal,stopSignal));
		thread2.start();		
		startSignal.countDown();
//		Thread.sleep(2000);
		stopSignal.await();
		stopSignal.await();
		System.out.println("done");
			System.out.println(result.getFinalSum());
	

}
}


class additionJob5 implements Runnable{

	private Result5 result;
	CountDownLatch startSignal;
	CountDownLatch stopSignal;
	
	public additionJob5(Result5 result,CountDownLatch startSignal,CountDownLatch stopSignal) {
		this.result=result;
		this.startSignal=startSignal;
		this.stopSignal=stopSignal;
	}
	@Override
	public void run() {
		try {
			startSignal.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int sum=0;
		for(int i=1;i<=10;i++)
		sum+=i;		
		
		result.updateSum(sum);
	    stopSignal.countDown();
	}
}

class Result5 {
	
	int finalSum;

	public int getFinalSum() {
		return finalSum;
	}
	
	public void updateSum(int sum){
		finalSum+=sum;
	}
}

