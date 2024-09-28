package com.Suepr1_this1_constr;

public class thisclass {
	int i;
	String s1;
	long l;
	short s;
	

	public static void main(String[] args) {
		thisclass t=new thisclass();
	thisclass t1=new thisclass(1);
		thisclass t3=new thisclass("A", 4);
		
	}
	
	
	public thisclass()
	{
		this(1);              //this ya keyword ne kontahi cunstructor call hoto....js ki ithe public thisclass(int i) ha call kelya  pn same class mdhle
		this.i=1;        // this.(dot) dot ne aapn veriable access kru shkto pn same class mdhele
		
		System.out.println("no argument cunstr.");
//		thisclass t1=new thisclass(1);
	}
	
	public thisclass(int i)
	{
		this("A", 4);
		this.s=9;
		//thisclass t2=new thisclass("A", 2);
		System.out.println("parameter cunstru");
		
		
	}
	
	public thisclass(String s,int j)
	{
		//thisclass t3=new thisclass();
		System.out.println("two param cuns");
		
	}
	
	
	
}
