package com.Selinium_project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sel_method {

	public static void main(String[] args) 
	{
	WebDriver obj=new EdgeDriver();
		 obj.get("https://www.flipkart.com/");
		
		 obj.manage().window().maximize();
	
		
		
		 obj.navigate().to("https://www.meesho.com/");
		obj.navigate().back();
	obj.navigate().refresh();	
		String str=obj.getTitle();
		System.out.println(str);
		obj.manage().window().minimize();

	obj.close();

	
	
	
	obj.navigate().forward();
	}
	
}
