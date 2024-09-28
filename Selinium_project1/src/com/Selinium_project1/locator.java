package com.Selinium_project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locator {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	Thread.sleep(2000);
	WebElement obj=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
	obj.sendKeys("pranita");
	Thread.sleep(2000);

	//obj.clear();
	Point p=obj.getLocation();
	int x_value=p.x;
	int y_value=p.y;
	System.out.println(x_value);
	System.out.println(y_value);
	
	Dimension d=obj.getSize();
	int h=d.height;
	int w=d.width;
	
	System.out.println(h);
	System.out.println(w);
	
	
	
	Thread.sleep(2000);
	WebElement obj2=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
	obj2.sendKeys("limbalkar");

	
	WebElement address=driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
	address.sendKeys("Mumbai");
	
	
	WebElement email=driver.findElement(By.xpath("//input[@type=\"email\"]"));
	email.sendKeys("pranu@gmail.com");

	WebElement ph=driver.findElement(By.xpath("//input[@type=\"tel\"]"));
	ph.sendKeys("986");
	
	/*WebElement redio1=driver.findElement(By.xpath("//input[@value="Male"]"));
	redio1.click();
	*/
	WebElement redio2=driver.findElement(By.xpath("//input[@value=\"Male\"]"));
	redio2.click();
	
	
	WebElement ch=driver.findElement(By.xpath("//input[@id=\"checkbox1\"]"));
	ch.click();
	
	WebElement lang=driver.findElement(By.id("id=\"msdd\""));
	lang.click();

}
}
