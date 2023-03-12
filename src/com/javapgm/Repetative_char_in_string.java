package com.javapgm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative_char_in_string {

	public static void main(String[] args) {
		String s = "welcomeelcore";
		char[] charArray = s.toCharArray();
		
		LinkedHashMap<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		
				
		
		
		for (char c : charArray) {
			
			if (m.containsKey(c)) {
				
				Integer value = m.get(c);
				m.put(c, value+1);
				
			}
			else {
			
		m.put(c, 1);
			}
		}
		System.out.println(m);
		
		
		
		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				
				System.out.println(entry);
				
			}
		}
	}
}
