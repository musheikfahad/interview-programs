package com.javapgm;    // package

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example_1 {  // curly braces decides the limit of the class

	public static void main(String[] args) {
		
		String s = "love is a stupid thing, and love is waste thing waste";
		String[] Allwords = s.split(" ");
		
		
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		
		
	for (String word : Allwords) {
		
		if (m.containsKey(word)) {
			Integer Value = m.get(word);
			m.put(word, Value+1);
		}
		else
		m.put(word, 1);
		
		
	}
	
	System.out.println(m);
	
	Set<Entry<String, Integer>> entryset   = m.entrySet();
		
	for (Entry<String, Integer> entry : entryset) {
		
		if (entry.getValue()>1) {
			
			System.out.println(entry);
			
		}
	}
		
	}
	
}


