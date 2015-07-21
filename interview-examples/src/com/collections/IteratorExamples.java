package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IteratorExamples {
	private static Logger logger= Logger.getLogger(IteratorExamples.class.getName());
	
	public static void main(String[] args) {
		Collection<String> collection = new LinkedList<String>();
		
		collection.add("Arom");
		collection.add("candy");
		collection.add("eith");
		
		Iterator<String> iterator= collection.iterator();
		while(iterator.hasNext()){
			logger.log(Level.INFO, String.format("%s%c", iterator.next(), ' ' ));
		}
		System.out.println();
		List<String> list = (List<String>)collection;
		String s = "david";
		ListIterator<String> listIterator =list.listIterator();
		while(listIterator.hasNext()){
			if (listIterator.next().equals("candy")){
				listIterator.add(s);
				break;
			}
		}
		System.out.println(list);
		// test the code for listIterator
		listIterator =list.listIterator();
		while(listIterator.hasNext()){			
			if(listIterator.next().equals(s)){
				//listIterator.previous();
				listIterator.previous();
				listIterator.remove();
				break;
			}
		}
		System.out.println(list);
	 
        System.out.println("----------------------------------------------");
        
    	Set<String> set = new LinkedHashSet<String>();
    	set.add("Arom");
    	set.add("candy");
    	set.add("eith");
    	System.out.println(set);
    	Set<String> set2 = new HashSet<String>();
    	set2.add("Arom");
    	set2.add("candy");
    	set2.add("eith");
    	System.out.println(set2);
 }
}
