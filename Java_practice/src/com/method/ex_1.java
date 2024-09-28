package com.method;

public class ex_1 {
		
	
	public void m1()
	{
		System.out.println("no arg");
		
	}

	public void m2(int a, int b)
	{
		int i=a+b;
		System.out.println("addition: " +i);
	}
	public void m1(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		ex_1 obj=new ex_1();
		obj.m1();
		obj.m2(20,10);
		obj.m1(100);
	}
}
