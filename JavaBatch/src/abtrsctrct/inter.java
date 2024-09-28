package abtrsctrct;

public interface inter {
	public void m3();
	public void m4();
	

}
class sub implements inter
{

	@Override
	public void m3() {
System.out.println("wel");		
	}

	@Override
	public void m4() {
		System.out.println("come");		
		
	}
}