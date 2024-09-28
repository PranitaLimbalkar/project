package interface_ex;

public interface interface_ex {
public abstract  void maharashtra();

public abstract  void HDFC();

public abstract  void CANADA();


class chld implements interface_ex
{

	@Override
	public void maharashtra() {
		System.out.println("maharashtra");		
	}

	@Override
	public void HDFC() {
		// TODO Auto-generated method stub
		System.out.println("HDFC");
	}

	@Override
	public void CANADA() {
		// TODO Auto-generated method stub
		System.out.println("canada");
	}
}
}