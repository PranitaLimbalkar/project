package com.Veriable;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Veriable {
	
	int empname;         //I
	int empid;             //I obj sobt change hote eg id 1,id2...
	static String companyname;      //ststic becouse static keyward are use
	
	
	
	static int i;      //static value dili tri chalte nahi dile tri chalte
	int j;            //instance  value dili tri chalte nahi dile tri chalte
	
	
	
	public static void main(String[] args) {
		
		int k=100; //local
		 
		int m;   //local if veriable are not use then vlalu not mendetary
		
		System.out.println(k);       //if local veriable are use then value is mendetary
		System.out.println(i);        //sttic veriabl direct access hote static method mdhe 
		
		Veriable obj=new Veriable();
		
		System.out.println(obj.j);
		
		
	}
	public void m1()        //  instance method cqn direct acess static veriable
	{
		System.out.println(i);
		System.out.println(j);    //instance method mdhe instance veriable direct access
		
	}

}
