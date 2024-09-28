package com.Selinium_project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class web_element_ex {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	
	WebElement emp_nm=driver.findElement(By.xpath("//lable[@ Employee Name]"));
	
}
}
