package com.cunstructor;

public class parametr_cunstructor {
	int i;
	float f;
	
	
	
	
	
	
	public parametr_cunstructor(int i ,float f)
	{
		System.out.println("parameter cunstructor");
		
	}
	
	public parametr_cunstructor()
	{
		
		System.out.println("defoult cunstroctor");
		
		
	}
	
	public parametr_cunstructor(String s)
	{
		s="abc";
		System.out.println(s);
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		parametr_cunstructor p=new parametr_cunstructor(2,3.14f);
		parametr_cunstructor p1=new parametr_cunstructor();
		parametr_cunstructor p2= new parametr_cunstructor("abc");
		
		//System.out.println(i);
	}

}
