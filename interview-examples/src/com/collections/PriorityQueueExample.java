package com.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author Girdhar
 * Priority Queue gives always smallest while we remove
 */
public class PriorityQueueExample {

	public static void main(String[] args) {
	
		/*		PriorityQueue<Integer> queue= new PriorityQueue<Integer>();
		queue.add(5);
		queue.add(3);
		queue.add(2);
		System.out.println(queue.remove());		
*/
		Student s1 = new Student(4, "Mike");
		Student s2 = new Student(7, "Maneesh");
		Student s3 = new Student(2, "Silivu");
		
		PriorityQueue<Student> queue= new PriorityQueue<Student>();
		queue.add(s1);
		queue.add(s2);
		queue.add(s3);
		
		/*System.out.println(queue.remove().name);
		System.out.println(queue.remove().name);
		*/Iterator<Student> iterator=queue.iterator();
		System.out.println("********************");
		System.out.println("Iterate the PQ");
		while(iterator.hasNext()){
			System.out.println(queue.iterator().next().name);
		}
			
	
	}	
}

class Student implements Comparable<Student> {
	int id;
	String name;
	

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student otherStudent) {
		
		return new Integer(this.id).compareTo(new Integer(otherStudent.id));
	}
}	
	
	

