package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSets {

	public static void main(String[] args) {
		
		// hashset is unordered and unsorted 
		/*Set<String> strings = new HashSet<String>();
		strings.add("DBC");		
		strings.add("BBC");
		strings.add("CBC");
		for(String string : strings){
			System.out.println(string);
		}*/
		// LinkedHashSet is ordered and unsorted 
		/*Set<String> strings = new LinkedHashSet<String>();
		strings.add("DBC");		
		strings.add("BBC");
		strings.add("CBC");
		for(String string : strings){
			System.out.println(string);
		}*/
		
		// TreeSet is unordered and sorted 
		Set<String> strings = new TreeSet<String>();
		strings.add("DBC");		
		strings.add("BBC");
		strings.add("CBC");
		for(String string : strings){
			System.out.println(string);
		}
	}
}
