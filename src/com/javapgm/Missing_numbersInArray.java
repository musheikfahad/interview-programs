    package com.javapgm;
    
    public class Missing_numbersInArray {
    
    	public static void main(String[] args) {
    int a[] = {1,2,4};
    
    
    int sum1 = 0;
    for (int temp1 : a) {
    	sum1=sum1+temp1;
		
	}
    
    System.out.println(sum1);
    int sum2=0;
   for (int i = 0; i <=4; i++) {
	   
	   sum2=sum2+i;
	
}
    System.out.println(sum2);
    
    
    
    System.out.println("missing number is :"+( sum2-sum1));
    	}
    
    }
    