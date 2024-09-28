package com.polymorfism;
//********************OVERRIDING*******************
//*******child ********
public class HDFC {
	public void m1()           //public --> public 
	{
		
		System.out.println("parent class :8%");
	}
	

protected void m2()         //exactly same method name
	{
		
		System.out.println("parent class :8.76%");
	}

protected void m3()         //pARENT protected ----->child protected ,defalt
{
	
	System.out.println("parent class :13	.8%");
}


public int  m4() {      //RT same deu shkto pn tyasthi child cls mdhe obj crete krava lgto
	bank b1=new bank();
	return 10;
	}

public static void main(String[] args) {
	
	
	HDFC h=new HDFC();
	h.m1();
	h.m2();
	h.m3();
	h.m4();
}
}
