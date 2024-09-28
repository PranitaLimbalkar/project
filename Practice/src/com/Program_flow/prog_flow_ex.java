package com.Program_flow;

public class prog_flow_ex {

     static	int i;
	int j;
	
	{
		
		
		System.out.println("instance call");
		
	}
	static {
		
		System.out.println("static call");
		
	}
	
	public prog_flow_ex() {
		
		
		
		System.out.println("constructor call");
	}
	
	
	public static void main(String[] args) {
		
		
		prog_flow_ex p=new prog_flow_ex();
		
		System.out.println("main methid");
		
	}
		
			
		
	
}
