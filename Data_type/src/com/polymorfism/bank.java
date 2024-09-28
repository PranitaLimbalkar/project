package com.polymorfism;


//********************OVERRIDING*******************


/*RULE
1)-PARENT -child relation cmplsy
2)method name exaclty same
3)parameter exacty same 

	-----access modifire------
	
	1-public--->pubic
	2)protected-->public protected
	3)default-->public,protected,default
	
	------------------------------------------
	1) main ()is not overriding
	2)private ,static,final is not overriding
	private-access within cls
	static-static copy hote pn tyamdhe print nahi karu shkt is called "method hiding" .
	final- fix value aste..... 
	final overrid kraychi asel te mathod nm chng krava lagto
	
	
constructor override no                 he sgl overload hote pn method nam same n param diff
*/



public class bank extends HDFC         //parent -child relation exactly same nm as well as compolsary
{
	public void m1()         //exactly same method name
	{
		
		System.out.println("parent class :8%");
	}

	public void m2()         //pARENT public ----->child protected
	{
		
		System.out.println("parent class :8%");
	}
	
	protected void m3()         //pARENT protected ----->child protected ,defalt
	{
		
		System.out.println("parent class :8%");
	}
	
	
	public int  m4()
	{
		return 10;
		
	}
	
	
	
	
	

	
		public static void main(String[] args) {
			
			
			//System.out.println("*");
		}
	
}
