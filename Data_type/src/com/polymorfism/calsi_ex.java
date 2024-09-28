package com.polymorfism;


//**********************OVERLODING*******************

//rule of oveloading
//-same method name  sem cls or diff clas
//-same  method nm diff parameter
//same method name exacty same mehtod nm
//-----------------------------------------------------

//mehod overloading
//access modifire overloading
//return tye overloading
//constructor overloading                 he sgl overload hote pn method nam same n param diff


public class calsi_ex {
	
	
	
	public void add(int i)                  //same method name diffe parameter
	{
		
	}

	
	public void add(int i , int j)
	{
		
	}

	
	public void add(String s)
	{
		
	}

	
	public void add(int i,String s)
	{
		
	}

	public static void main(String[] args) {
		
	}
	
	public static void main(int  args) { //overliading done ..........same clas nm (main)diff param(int)
		calsi_ex cs=new calsi_ex();
		cs.add(30);
		cs.add(10, "jsdk");
	}
}
