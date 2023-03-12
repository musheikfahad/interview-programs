package com.javapgm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class Repitative {

	public static void main(String[] args) {
		String example = "api testing functional testing performance testing automation testing api testing";
		
		String[] Allwords = example.split(" "); //0 to n-1;
		int lengthofstring = Allwords.length;
		System.out.println("length of string array :" + lengthofstring);
		
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		
		for (String word : Allwords) {
			
			if (m.containsKey(word)) { // allready word exists
				
				Integer value = m.get(word);
				m.put(word, value+1);
			}
			else
			m.put(word, 1);
			
		}
		System.out.println(m);

		Set<Entry<String, Integer>> entrySet = m.entrySet();
		
		for (Entry<String, Integer> entry : entrySet) {
			
			if (entry.getValue()>1) {
				
				System.out.println(entry);
				
			}
			
		}
	}

}
