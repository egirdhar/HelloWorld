package com.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapSortedByValuesExamples {

	public static void main(String[] args) {
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('C', 3);
		map.put('A', 2);
		map.put('B', 1);
		//sorted by keys -default one
		System.out.println(map);
		//sorted by values
		Set<Entry<Character, Integer>> entries= entriesSortedByValues(map);
		System.out.println(entries);
		for( Map.Entry<Character, Integer> entry : entries ){
			System.out.println(entry.getKey());
		}
	}
	
	static <K,V extends Comparable<? super V>>
	SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
	    SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
	        new Comparator<Map.Entry<K,V>>() {
	            @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
	              /*  int res = e1.getValue().compareTo(e2.getValue());
	                return res != 0 ? res : 1;*/
	            	  return e1.getValue().compareTo(e2.getValue());
		      
	            }
	        }
	    );
	    sortedEntries.addAll(map.entrySet());
	    return sortedEntries;
	}		

}