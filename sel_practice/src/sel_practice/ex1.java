package sel_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ex1 {
public static void main(String[] args) throws InterruptedException  {
	WebDriver obj=new EdgeDriver();
	obj.get("https://www.flipkart.com/");
	obj.manage().window().maximize();
	
	Thread.sleep(2000);
	
	obj.manage().window().minimize();
	
	Thread.sleep(2000);
	String str=obj.getTitle();
	
}
}
