package com.methodpractice;


public class Veriable1 {
	
	int eid;//I
	static String  companyname;      //S
	String empname;   //I
	
	public void emp()//I
	{
		
		System.out.println("user difine method");
		System.out.println(eid);
		System.out.println(empname);	
		
	
	
	
	}
	
	
	
	public static void emp1() {
		
		System.out.println("static method");
		System.out.println(companyname);
		Veriable1 v1=new Veriable1();
		v1.eid=1;
		v1.empname="a";
		v1.companyname="abc";
		
	}public static void main(String[] args) {
		int v1;//L
		
	} 
}
