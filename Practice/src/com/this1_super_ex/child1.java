package com.this1_super_ex;



public class child1 extends parent
{
	int x;
	int y;
	
	public child1()
	{
		super("a", 2);
		super.i=10;
		super.j=20;
	    super.m1();
	    
	    
	    
	    
	    this.x=2;
	    this.y=4;
	    
	    System.out.println("child cls cunstructor");
	}
	public static void main(String[] args) {
		child1 ch=new child1();
		
		
		
	}

	
	
}
