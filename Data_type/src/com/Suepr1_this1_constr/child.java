package com.Suepr1_this1_constr;


public class child extends parent {
	
	
	int x;
	int y;
	public child() 
	{
		//super();  //parant cls cunstuctor calling...pn no arg vala
		super("A" , 2);    // parent cunstr cll zala...pn parameter vala "super" ha key word 2rya class access kraycha asto teva use lrata 
		super.i=10;
		super.j=20;          //he veriables parent class che ahet 
		super.parentmethod();     //parent class chi method access keliy
		
		
		
		this.x=40;
		this.y=50;    //valeu given is mendetery ahe bcz he same  class acess krto
		
		
		System.out.println("child cls cunstructor");
	}
	
	
public static void main(String[] args) {
	
	child c1=new child() ;
	//super.i=10;    //tstic method mdhe super kinva this veriable create hot nahi.....
		
	
}

	
}

