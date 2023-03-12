package com.javapgm;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Duplicate_elements2 {
	
	
	
	//hashset
	
	public static void main(String[] args) {
		
		
		String arr[] = {"java", "c" , "c++","python" };
		
		LinkedHashSet<String> langs = new LinkedHashSet<String>();
		
//		System.out.println(langs.add("java"));
//		System.out.println(langs.add("ruby"));
//		System.out.println(langs.add("python"));
//		System.out.println(langs.add("ruby"));
//		System.out.println(langs.add("php"));
//		System.out.println(langs.add("c sharp"));
//		System.out.println(langs);
		
		
		boolean flag = false;
		
		for (String slan : arr) {
			 if (langs.add(slan)==false) {
				 
				 System.out.println("found duplicate :" +slan);
				 flag = true;
				
			}
		}
		
		if (flag==false) {
			System.out.println("no duplicates");
		}
		System.out.println(langs);
	}

}
