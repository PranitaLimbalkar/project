package com.methodpractice;

public class constructor_ex {
public constructor_ex() {
	System.out.println("no areg");
}



private constructor_ex(int i ,int j) {
	// TODO Auto-generated method stub
System.out.println("parm constructor");
}

public static void main(String[] args) {
	 constructor_ex ex=new constructor_ex(10,10);
	 constructor_ex ex1=new constructor_ex(10,10);
	 
}
}
