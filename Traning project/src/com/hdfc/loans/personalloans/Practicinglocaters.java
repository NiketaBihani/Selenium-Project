package com.hdfc.loans.personalloans;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicinglocaters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.makemytrip.com");
		c.manage().window().maximize();
		c.findElement(By.id("header_tab_holidays")).click();
		Thread.sleep(10000);
		List<WebElement> var = c.findElements(By.tagName("a"));
		for(int i=0;i <var.size();i++)
		{
			String s = var.get(i).getText();
			System.out.println(s);
		
		}
		
	}

}
