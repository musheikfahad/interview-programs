package com.javapgm;

public class Duplicates_in_Array {

	public static void main(String[] args) {
		String arr[] = {"java", "c" , "c++","python" };
		
		Boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]==arr[j]) {
					System.out.println("duplicate :" + arr[i]);
					
					flag=true;
				}
				
			}
			
		}
		if (flag==false) {
			System.out.println("no duplicates");
		}
		
		
	}
}
