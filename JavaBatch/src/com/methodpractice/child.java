package com.methodpractice;

public class child extends parant {

	
	public void m1()
	{
		System.out.println("hiii");
	}
	
	public static void main(String[] args) {
		child c=new child();
		c.m1();
		c.m1();
		c.m1();
parant p=new child();
p.m1();
		
	}
}
