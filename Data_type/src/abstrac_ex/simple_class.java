package abstrac_ex;

public class simple_class {
public static void main(String[] args) {
	

	ICICI b1=new ICICI();     //bank cha tr method crat nahi krta yenar ...pn mg methood creat kelyashivay tr value kshi ghenar....so child cls icici chi method creat kraychi
	b1.homeloan();
	b1.carloan();
	
maharastra m1=new maharastra();
m1.homeloan();
m1.carloan();

HDFC h1=new HDFC();
h1.homeloan();
h1.carloan();

AXIS a1=new AXIS();
a1.homeloan();
a1.carloan();
 
	
			
	//	simple_class s1=new simple_class();
	//	 abstact_class ab=new abstact_class() ;      //method creat hot nahi karn ha abstact cks ahe
	//	bank b1=new bank();	                         // //method creat hot nahi karn ha interface cks ahe
		
	}
	
	 
		
	class simple_child extends simple_class
	{
		
		
	}
}
