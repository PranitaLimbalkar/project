package com.veriable;

public class stud {

	int id; 
	  String name;
static	String s="company_name";


public void m1()
{
	System.out.println(name);
	System.out.println(id);
System.out.println(s);
}

public static void m2()
{
	System.out.println(s);
	stud sd1=new stud();
	
	System.out.println(sd1.id);
	
	
}
public static void main(String[] args) {
	int k=10 ;
	stud obj=new stud();
	obj.m1();
	System.out.println(obj.id);
	System.out.println(obj.name);
	System.out.println(k);
}
}
