package com.threads;



public class Demo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Result result = new Result();
		Thread thread =new Thread(new additionJob(result));
		thread.start();
		Thread thread2 =new Thread(new additionJob(result));
		thread2.start();
		Thread.sleep(2000);
				
			System.out.println(result.getFinalSum());
	

}
}


class additionJob implements Runnable{

	private Result result;
	
	public additionJob(Result result) {
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

class Result {
	
	int finalSum;

	public int getFinalSum() {
		return finalSum;
	}
	
	public void updateSum(int sum){
		finalSum+=sum;
	}
}

