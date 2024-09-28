package com.exception;

public class ex_2 {
	
	public static void main(String[] args) {
		
		int i=10;  
		int j=0;    //10
		
		
	int	sum=i+j;
	System.out.println("sum: " +sum);
	
	
	try {
		
		System.out.println("try block");
		
		int div=i/j;                     //program terminate zalapudch o/p print nahi zal
		System.out.println("div: " +div);

		
		
	}
	catch (Exception e) {
		
		System.out.println("catch block");
		
		int multi=i*j;
		System.out.println("multi: " +multi);
		
		int subtraction=i-j;
		System.out.println("subtraction: " +subtraction);
			

	}
	
	finally {
		
		System.out.println("finally print");
		
	}
	
}

}
