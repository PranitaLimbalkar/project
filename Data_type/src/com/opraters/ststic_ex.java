package com.opraters;

public class ststic_ex {

	int i=5;
	  static  int j=10;
	
	public static void main(String[] args) {
		
		ststic_ex obj=new ststic_ex();
		obj.i++;   //6
		obj.j++;    //11   static


		System.out.println("i: "+obj.i);
	     System.out.println("j: "+obj.j);
	     
	     
	     ststic_ex obj1=new ststic_ex();
			obj1.i++;      //6     instance
			obj1.j++;           //11+1 =12 bcz static value kayam rahate


			System.out.println("i: "+obj1.i);
		     System.out.println("j: "+obj1.j);
		     
	     
	}
}
