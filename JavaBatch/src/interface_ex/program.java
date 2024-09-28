package interface_ex;

public interface program {

	
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	
	class ex implements program{

		@Override
		public void m1() {
System.out.println("m1");			
		}

		@Override
		public void m2() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void m3() {
			// TODO Auto-generated method stub
			
		}
}
}