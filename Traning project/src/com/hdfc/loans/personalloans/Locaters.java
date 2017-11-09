package com.hdfc.loans.personalloans;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	ChromeDriver c=new ChromeDriver();
	c.get("http://eenadupellipandiri.net");
    c.manage().window().maximize();
   // c.findElement(By.linkText("Pellipandiri Branches")).click();
    c.findElement(By.partialLinkText("Branches")).click();
    List<WebElement> var = c.findElements(By.tagName("a"));
    for(int i=0;i<var.size();i++) 
    {
    	if(!var.get(i).getText().isEmpty())
    	{
    	String lst = var.get(i).getText();
    	System.out.println("List is:"+lst);
    	}
    }
}
}
 
