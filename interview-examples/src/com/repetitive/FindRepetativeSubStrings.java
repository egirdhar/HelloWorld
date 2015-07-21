package com.repetitive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepetativeSubStrings {

	private String inputString;
	
	public static void main(String[] args) {
		FindRepetativeSubStrings findRepetativeSubStrings =new FindRepetativeSubStrings();
		findRepetativeSubStrings.getStringFromUser();
	//	System.out.println(findRepetativeSubStrings.inputString );
		System.out.println("*******");
		for ( String s : findRepetativeSubStrings.getSubStrings() )			
		System.out.println(s); 
		
	}
	
	private void getStringFromUser(){
	Scanner scanner = new Scanner(System.in);
	inputString =scanner.nextLine();
	}
	
	private String [] getSubStrings(){
		
		String [] subStrings;
		List<String> repetativeSubStrings;
		
		final String  PATTERN = "(\\w+)";
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher= pattern.matcher(inputString);
		repetativeSubStrings = new ArrayList();
		Set<String> strings = new HashSet<String>();
		while(matcher.find()){			
		String subString =	matcher.group(1)!=null ? 
					matcher.group(1):null;
				if( !strings.add(subString) )	
					repetativeSubStrings.add(subString);
				
		}
		
		subStrings= new String[repetativeSubStrings.size()];
		repetativeSubStrings.toArray(subStrings);
		strings =null;
		return subStrings;
	}
}
 