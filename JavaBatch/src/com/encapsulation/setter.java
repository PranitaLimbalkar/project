package com.encapsulation;

public class setter {

	public static void main(String[] args) {
		
	
	
	getter g1=new getter();
	g1.setName("pqr");

	g1.setI(10);
	
	System.out.println(g1.getName());
	System.out.println(g1.getI());

	
	
	
	getter g2=new getter();
	g2.setI(20);
	g2.setName("viraj");
	System.out.println(g2.getI());
	System.out.println(g2.getName());
}	
	}