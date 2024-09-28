package com.exception;

public class ex_5 {
	public static void main(String[] args) {
		int i=10;  
		int j=0;    //j=100
		
		
		try {
		
		int div=i/j;                     //program terminate zalapudch o/p print nahi zal
		System.out.println("div: " +div);
		
		String name=null;

		}
		catch (Exception e) {
			j=100;
			 String name="admin";
			System.out.println("j=: " +j);
			System.out.println("name=: " +name);
		}
		
	}

}
