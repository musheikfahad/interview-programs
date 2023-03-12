package com.javapgm;

import java.util.Objects;

public class FindSumofElementsinArray {

	public static void main(String[] args) {
		          
		int sum = 0;
		int array[] = {1,2,3};
	
		
		for (int i = 0; i < array.length; i++) {
			sum=sum+array[i];
			
		}
//		for (int i : array) {
//			sum = sum+i;
//		}
		
		System.out.println(sum);
		
		
		
		String words ="";
		
		String arr[] = {"love" , "hi" , "life"};
		
		for (int i = 0; i < arr.length; i++) {
			
		words=	words+arr[i];
			
		}
		
//		for (String temp : arr) {
//			 words=words+temp;
//		}
		 System.out.println(words);
		 
		 
		

	}

}
