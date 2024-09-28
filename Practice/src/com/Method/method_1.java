package com.Method;

public class method_1 {
	public static void main(String[] args) {
		
		
		parameter_method obj=new parameter_method();    //parameter class
		
		
		obj.addition(30);
		
		
	}
	public void addition(int v1)     //same package different class
	{
		int i=10;
		int j=10;
		int sum = v1+j+i;
		System.out.println(sum);
		
	}
	
	

}
