package com.opraters;

public class increament {

	int i=10;
	static int j=20;
	
	public static void main(String[] args) {
		increament n=new increament();
		n.i++;
		n.j++;
		
		
		increament n1= new increament();
		n1.i--;
		n1.j--;
		
		
		System.out.println(n1.i);//10
		System.out.println(n1.j);
		
		
		System.out.println(n1.i);
		System.out.println(n1.j);
	}
}
