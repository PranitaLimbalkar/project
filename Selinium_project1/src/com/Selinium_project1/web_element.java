package com.Selinium_project1;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class web_element {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");   
		
	Thread.sleep(2000);

	WebElement first_nm=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		first_nm.sendKeys("Admin");
		Thread.sleep(2000);
		first_nm.clear();
		Point p=first_nm.getLocation();
		int x_value=p.x;
		int y_value=p.y;
		
		System.out.println("x:="+x_value);
		System.out.println("y:="+y_value);
		
	String str=first_nm.getTagName();
	System.out.println("tagname" +str);
		
		
		
		
	Dimension d=first_nm.getSize();
		
		int i=d.height;
		int j=d.width;
		 System.out.println("i:="+i);
		 System.out.println("j:="+j);
		 
		
		Thread.sleep(2000);
		first_nm.clear();
		
		//Thread.sleep(2000);
		//first_nm.sendKeys("kkkkkk");
		
		first_nm.clear();
		
		WebElement last_nm=driver.findElement(By.xpath("//input[@ name=\"password\"]"));
		last_nm.sendKeys("admin123");
		Thread.sleep(1000);
		last_nm.clear();
		
		Point p1=last_nm.getLocation();
		int x1_value=p.x;
		int y1_value=p.y;
		
		System.out.println("x:="+x1_value);
		System.out.println("y:="+y1_value);
		
		
		Dimension d1=last_nm.getSize();
		int a=d1.height;
		int b=d1.width;
		System.out.println("a:=" +a);
		
		System.out.println("b:=" +b);
		

		
		WebElement loging=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		//loging.submit();
		
		loging.click();

		
	//	WebElement admin=driver.findElement(By.xpath("https://opensource-demo.orangehrmlive.com/"));
		
	}

}