package com.Acess_Modefire;

import com.method.method_example;

public class Method_Return_Type {
	
	public static void main(String[] args) {
		
		Method_Return_Type obj=new Method_Return_Type();
		obj.m1();
		int value =obj.m2();
	   String value1	=obj.m3();
	   boolean value2=obj.m4();
		
	}
	public void m1()    //void return type asel tr value return jat nahi
	{
		
		System.out.println("call m1 method");
		
	}
  public int m2()     //void sodun dusra return type asel tr value retun jate keyword RETURN use krav lagto
  {
	  System.out.println("call method m2");
	  return 10;
	  
	  
  }
  
  public String m3()
  {
	  System.out.println("call method m3");
	  return "viraj";
	  
	  
  }
  
  public boolean m4()
  {
	  System.out.println("call method m4");
	  return true;
	  
	  
  }
}
