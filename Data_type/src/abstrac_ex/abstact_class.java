package abstrac_ex;

public abstract class abstact_class     //abstract class create krava lagto
{
int i;
static int j;            //abstract class mdhe veriables konteho ghya ,kseh ghya chalte

	
	public abstract void m1();      //abtract ha keyword use krava lagto
	
	public abstract void m2(); 	
	
	
	public void m3()    //abstract mrthod mahe abstract ha kryword ahi dila tr tyacha meanng asa hota ki he simple method ahe
	{
		//implimentation part
	}
}

	
 class abstact_child extends abstact_class
 {

	@Override
	public void m1() {
		
	}

	@Override
	public void m2() {
				
	}
		
	
}
