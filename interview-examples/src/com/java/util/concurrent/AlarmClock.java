package com.java.util.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class AlarmClock {

    public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());
		ScheduledFuture<?> future =service.scheduleAtFixedRate(new AlarmTask(), 0, 1, TimeUnit.SECONDS);
		
		service.schedule(new StopTask(future, service), 20, TimeUnit.SECONDS);
	}

}




 class AlarmTask  implements  Runnable {
	int i;
	
	public void run() {
		
	 System.out.print("beep.. beep ");
	 System.out.println(++i);
	}
}

 

 class StopTask  implements  Runnable {
	 ScheduledFuture<?> future;
	 ScheduledExecutorService service;
	
	public StopTask(ScheduledFuture<?> future, ScheduledExecutorService service) {
		this.future =future;
		this.service=service;
	}
	public void run() {	
	 future.cancel(false);	 
	 service.shutdown();
	}
}