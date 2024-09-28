package com.Method;

public class parameter_method {
	public static void main(String[] args) {
		
		
		parameter_method obj=new parameter_method();
		obj.addition(30);
		obj.addition2(50,100);
	}
	public void addition(int v1)
	{
		int i=10;
		int j=10;
		int sum = v1+j+i;
		System.out.println(sum);
		
	}
	
public void addition2(int v1,int v2)
{
int i=20;
int sum=v1+v2+i;
System.out.println(sum);
}
}
