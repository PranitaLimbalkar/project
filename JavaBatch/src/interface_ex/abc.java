package interface_ex;

public interface abc {
	public abstract void ast();
	public abstract void bnd();
	public abstract void crd();
	public abstract void dth();
	public abstract void eth();
	

 class child implements abc
 {
	@Override
	public void ast() {
System.out.println("1st");		
	}

	@Override
	public void bnd() {
		System.out.println("2nd");		
		
	}

	@Override
	public void crd() {
		System.out.println("3rd");		
		
	}

	@Override
	public void dth() {
		System.out.println("4rth");		
		
	}

	@Override
	public void eth() {
		System.out.println("5th");		
		
	}
  

	
	  
  }



}

