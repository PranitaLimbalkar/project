package interface_ex;

public class simple_cls {
public void HDFC()
{
	
	System.out.println("home loan:  8%");
	System.out.println("car loan:  5%");
	}


public void ICICI()
{
	
	System.out.println("home loan:  9%");
	System.out.println("car loan:  7%");
	}


public void MAHARASHTRA()
{
	
	System.out.println("home loan:  9.5%");
	System.out.println("car loan:  5.8979%");
	}



public static void main(String[] args) {
	simple_cls sc=new simple_cls();
	sc.HDFC();
	sc.ICICI();
	sc.MAHARASHTRA();
}

}


