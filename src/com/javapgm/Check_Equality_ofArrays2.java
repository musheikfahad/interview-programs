package com.javapgm;

public class Check_Equality_ofArrays2 {

	public static void main(String[] args) {
		int a1[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
		
		
		int a2 [] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8};
		
		
		boolean status = true;
		if (a1.length==a2.length) {
			
			
			for (int i = 0; i < a1.length; i++) {
				
				if (a1[i]!=a2[i]) {
					status=false;
					
				}
			}
//			for (int temp : a2) {
//				if (temp != temp) {
//					status=false;
//				}
//				
//			}
			
		}
		
		else {
			status=false;
		}
		
		
		if (status==true) {
			System.out.println("equal");
		}
		else 
			System.out.println("not equal");
	}

}
