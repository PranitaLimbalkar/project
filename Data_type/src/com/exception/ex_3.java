package com.exception;

public class ex_3 {
	
	public static void main(String[] args) {
		
		String name=null;
		 try {
			 
			 System.out.println("try block");
			 int ln=name.length();
			 System.out.println("ln");
			 
		 }
		 catch (Exception e) {
			 
System.out.println("catch block");	
}
// finally is optional ghya kinva nak gheu		
	}
}
