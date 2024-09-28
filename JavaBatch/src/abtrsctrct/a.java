package abtrsctrct;

public abstract class a {
	public abstract void m1();
	
	public abstract void m2();

}

class child extends a
{
	@Override
	public void m1() {
System.out.println("hii");		
	}

	@Override
	public void m2() {
		System.out.println("hello");		
		
	}
}