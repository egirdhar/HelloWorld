package com.java.util.concurrent;

import java.io.ObjectInputStream.GetField;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadWebPage {
	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		//String url = "http://yahoo.co.in";
		String url = "http://www.yahoo.co.in";
		Future<String> future = service.submit(new Job(url));
		try {
			String result= future.get(5, TimeUnit.SECONDS);
			getURls(result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			System.out.println("could not get response in 5 seconds");
		}
		finally{
			service.shutdown();
		}
	}
	
	
	public static void getURls (String content){
		StringBuffer buffer = new StringBuffer();
		final String PATTERN =  "(.*href=\"https.*)";
		Pattern pattern =Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(content);
		while (matcher.find()){
			buffer.append(matcher.group(1));
		}
		System.out.println(buffer.toString());
	}

}



class Job implements Callable<String>{

	private String url;
	
	public Job(String url) {
		this.url =url;
	}
	
	@Override
	public String call() throws Exception {
		URL httpurl = new URL(url);
		StringBuffer buffer = new StringBuffer();
		HttpURLConnection connection =(HttpURLConnection)httpurl.openConnection();
		Scanner scanner= new Scanner(connection.getInputStream());
        while ( scanner.hasNext() ) 
        	buffer.append(scanner.next());
		return buffer.toString();
		}
	
}
