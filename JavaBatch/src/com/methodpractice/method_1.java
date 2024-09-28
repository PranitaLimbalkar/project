package com.methodpractice;

public class method_1 {
	
	
	public static void main(String[] args) {
	method_1 m=new method_1();
	m.m1();
	m.m2(10, 10);
		
	}
public void m1()
{
int	x=10;
int	y=20;
int sum=x+y;
System.out.println("method area" +sum);
}




public void m2(int i, int y)
{

int sub=i-y;
System.out.println("method area" +sub);
}


}
