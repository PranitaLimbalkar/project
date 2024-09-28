package com.exception;

public class ex_4 {
	public static void main(String[] args) {
		
		int i=10;
		int j=0;
		
		String name=null;
		 try {
			 
			 System.out.println("try block");
			 int ln=name.length();      //null pointer
			 System.out.println("ln");
			 int sum=i/j;           //arithmatic exeption
			 
			 
			 
		 }
		 catch (Exception e) {
			 
			
			 e.printStackTrace();
			 
System.out.println("catch block");	
}
		 System.out.println("otu side catch block");
	}

}
