package com.javapgm;

import java.awt.datatransfer.StringSelection;

public class Even_And_Odd_NUmber_From_Array {
	public static void main(String[] args) {
		
		int ar [] = {1,2,3,4,5,6,7,8,9};
		
		
		System.out.println("even numbers in an ARRAY");
		
		for (int temp : ar) {
			if (temp%2==0) {
				
				System.out.println( temp);
			}
		}
		
		
		System.out.println("odd numbers in an ARRAY");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]%2!=0) {
				
				System.out.println(ar[i]);
				
			}
		}
		
	}
}


