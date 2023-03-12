package com.javapgm;

import java.util.Arrays;

public class Check_equality_of_arrays {

	public static void main(String[] args) {
		int a1[] = {1,2,3};
		
		
		int a2 [] = {1,2};
		
		boolean equals = Arrays.equals(a1, a2);
		System.out.println("status =" +equals);
		
		if (equals ==true) {
			System.out.println("Arrays are equals");
			
		}
		
		else {
			System.out.println("Arrays are not equals");
		}
		
	}

}
