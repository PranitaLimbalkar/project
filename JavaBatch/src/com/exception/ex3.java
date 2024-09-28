package com.exception;

public class ex3 {

	
	public static void main(String[] args) {
try {
			
			int i;
		int j;
		int result=10+10;
		System.out.println(result);

		
		int div= 10/0;
		
		
}
catch (ArithmeticException e) {
	System.out.println("catch");
	
}
catch (Exception e) {
	// TODO: handle exception
}
	}
}
