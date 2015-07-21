package com.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class Demo3 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		Result1 result = new Result1();
		/*Thread thread =new Thread(new additionJob1(result));
		thread.start();
		Thread thread2 =new Thread(new additionJob1(result));
		thread2.start();*/
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<Integer> future1=  service.submit(new additionJob1(result));
		Future<Integer> future2 =service.submit(new additionJob1(result));
		
		Integer sum1 =null;
		Integer sum2 =null;
		
	//	Thread.sleep(2000);
		while ( sum1 ==null && sum2==null){
			sum1=future1.get();
			sum2=future2.get();
		}	
			System.out.println(result.getFinalSum());
	

}
}


class additionJob1 implements Callable<Integer>{

	private Result1 result;
	
	public additionJob1(Result1 result) {
		this.result=result;
	}
	@Override
	public Integer call() {
		int sum=0;
		for(int i=1;i<=10;i++)
		sum+=i;		
		
		result.updateSum(sum);
		return sum;
	}
}

class Result1 {
	
	int finalSum;

	public int getFinalSum() {
		return finalSum;
	}
	
	public synchronized void updateSum(int sum){
		finalSum+=sum;
	}
}

