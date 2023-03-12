package com.javapgm;

public class Max_min_inArray {

	public static void main(String[] args) {
		
		int a [] = {4,2,3,4,1,25};
		
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				
				min=a[i];
				
			}
			
		}
		System.out.println("minimum number in the array ="+min);
		
		int max = a[0];
		
		for (int temp : a) {
			if (temp>max) {
				
				max=temp;
			}
		}
		
		System.out.println("maximum number in the array =" + max);
	}

}
