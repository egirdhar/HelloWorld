package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



public class Demo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Output result = new Output();
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute( new addJob(result) );
		service.execute( new addJob(result) );
		/*Thread thread =new Thread(new additionJob(result));
		thread.start();
		Thread thread2 =new Thread(new additionJob(result));
		thread2.start();*/
		
		//Thread.sleep(2000);
		System.out.println(result.getFinalSum() + " " +service.isTerminated());
		service.awaitTermination(2, TimeUnit.SECONDS);
		service.shutdown();
		System.out.println(result.getFinalSum() + " " +service.isTerminated());
	}

}


class addJob implements Runnable{

	private Output result;
	
	public addJob (Output result) {
		this.result=result;
	}
	@Override
	public void run() {
		int sum=0;
		for(int i=1;i<=10;i++)
		sum+=i;		
		result.updateSum(sum);
	}
}

class Output {
	
	int finalSum;

	public int getFinalSum() {
		return finalSum;
	}
	
	public void updateSum(int sum){
		finalSum+=sum;
	}
}
