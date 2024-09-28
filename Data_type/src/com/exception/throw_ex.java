package com.exception;



public class throw_ex {
	public static void main(String[] args)throws NullPointerException {
		System.out.println("main --1  line");
		m1();
		System.out.println("main --2  line");
	}
		public static void m1()throws NullPointerException
		{
			System.out.println("m1 --1  line");
		m2();
		System.out.println("m1 --2  line");
		
		NullPointerException obj=new NullPointerException();
		throw obj;
		}
	
 public static void m2()throws NullPointerException , ArithmeticException
 {
		System.out.println("m2 --1  line");
	 String name=null;
		name.length();
		System.out.println("m2 --2  line");
	
 }
}
