package com.Program_flow;

public class program_flow_ex {

	
static int i=2;
	byte b=2;
	
	
	
	{
		
		
		System.out.println("instance class");
		
		//instance class
		
	}
	
	
	static{
		System.out.println("static class");          //static class
	}
	
	public program_flow_ex()
	{
		
		System.out.println("cunstroctor call");
		
		
	}
	public static void main(String[] args) {
		
		
		System.out.println("main method");
		
		program_flow_ex p=new program_flow_ex();
		
	}
	
}
