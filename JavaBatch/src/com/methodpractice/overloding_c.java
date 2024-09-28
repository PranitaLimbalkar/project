package com.methodpractice;

public class overloding_c {
	
	
	 public overloding_c() {
		
		System.out.println("m-1");
	}
	 public overloding_c(int i)
	{
		System.out.println("m-2");
	}
	public static void main(String[] args) {
		overloding_c v=new overloding_c();
		overloding_c v1=new overloding_c(20);
	}
}
