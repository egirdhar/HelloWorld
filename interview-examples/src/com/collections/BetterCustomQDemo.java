package com.collections;

public class BetterCustomQDemo {

	public static void main(String[] args) {
	
		MyQueue<String> myQueue= new MyQueue<String>();
		//System.out.println(myQueue.get() );
		myQueue.put("Girdhar");
		myQueue.put("Ramesh");
		myQueue.put("Manohar");
		System.out.println("whats there ");
		myQueue.show();
		System.out.println("Take 2 elements");
		System.out.println(myQueue.get() );
		System.out.println(myQueue.get() );
		System.out.println("whats there now ");
		myQueue.show();
		System.out.println("take one more ");
		System.out.println(myQueue.get() );
		System.out.println("take one more if any ");
		System.out.println(myQueue.get() );
}
	
}


class Node<T> {
	
	private T Data;
	Node<T> next;
	
	public Node(T Data) {
		this.Data=Data;
	}
	
	public T getData(){
		return Data;
		
	}
	
}

 class MyQueue<T>{
	 
	 private Node<T> head;
	 
	 public MyQueue() {
		// TODO Auto-generated constructor stub
	}
	 
	 public T get(){
	   
		 if(head==null){
		   System.out.println("no data");
	    return null;
	 }
	   T returnedData=head.getData();
	   head =head.next;
		 return returnedData;
	 }
	 
	 public void put(T Data){
        if(head==null){
        	head = new Node<T>(Data);
        	return;
        }
	     Node<T> newNode = new Node<T>(Data); 
	      Node<T> tmp=head;
	      while(tmp.next !=null)
	    	  tmp=tmp.next;
	      tmp.next=newNode;
	 }
	 
	 public void show(){
		 Node<T> temp =head;
		 
		 while(temp!=null){
			 System.out.println(temp.getData());
			  temp=temp.next;
		 }
	 }
 }



