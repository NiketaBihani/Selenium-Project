package com.hdfc.loans.personalloans;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("http://google.com");
	    c.manage().window().maximize();
	    c.findElement(By.id("lst-ib")).sendKeys("Oak Tech Solutions");
	    String a = c.findElement(By.id("lst-ib")).getAttribute("value");
	    System.out.println(a);
	}

}
