package abstrac_ex;

public interface bank    //ithe ckass ha keyword yet nahi
{
	
	
	public static final int i=10;        //by deafault public static final astat....final asyamule tyala value den grject ast
	
	int j=20;                      //public static final liha kinva nka lihu te by deafault final astat tyala value den bandhankarak ast
	String s ="A";
	
	
public abstract void homeloan(); //abtract ha keyword use kela tro chalto nahi kela tri chalto
	
public void carloan();       //by default abstract astat method tyala scacial keyword use nahi krava lagt	
}

class maharastra implements bank
{

	@Override
	public void homeloan() {
System.out.println("m-2");		
	}

	@Override
	public void carloan() {
System.out.println("m1");		
	}
	}

class ICICI implements bank    //jse ki extends keyword use kela jato ...tsach implements ha keyword use kela jato interface mdhe....& its a rule......
{
                                 //then tyala right click krun add to implements kraych
	@Override
	
	
	
	
	public void homeloan() {
		
		System.out.println("ICICI home loan-------8%");
		
	}

	@Override
	public void carloan() {
		System.out.println("ICICI car loan---------7%");
		
	}
}
	
	class HDFC implements bank
	{

		@Override
		public void homeloan() {
			System.out.println("HDFC car loan---------4.5%");
		}

		@Override
		public void carloan() {
			System.out.println("HDFC car loan---------7%");
						
		}
	}
		
		class AXIS implements bank
		{

			@Override
			public void homeloan() {
System.out.println("axis ---2");				
			}

			@Override
			public void carloan() {
System.out.println("axis car");				
			}
			
		}
		
		


