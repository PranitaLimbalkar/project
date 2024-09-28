package com.method;

public class method_example {
	public static void main(String[] args) {
		//int name;
		//long mob_no;
		//String add;
		System.out.println("main method");
		method_example obj=new method_example();
		obj.emp();
		obj.student();
		obj.add(30);
		obj.addition(10, 5);
		
	}

	public method_example() {
		// TODO Auto-generated constructor stub
		System.out.println("call method to user");
	} 
public void emp() {
	System.out.println("info emp");


	
	}
public void student()
{
	
	
	System.out.println(" student");


}
public void add(int v1) {
	System.out.println("additon");
	int a=10;
	int b=10;
	
	//int sum= a+b;
	int sum=v1+b;
	System.out.println(sum);
	System.out.println("print v1:"+v1);
	
	
}
public void addition(int n1,int n2) {
	System.out.println("addiomt of two no");
	int x=20;
	int y=5;
	int sum=x+y;
	System.out.println("print n1 & n2 additon"+sum);
	
	
}
}

