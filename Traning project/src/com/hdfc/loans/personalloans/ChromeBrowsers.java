package com.hdfc.loans.personalloans;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowsers {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	ChromeDriver c=new ChromeDriver();
  /*c.get("http://www.google.com");*/
    c.navigate().to("https://gmail.com");
    c.manage().window().maximize();
    c.manage().deleteAllCookies();
    c.navigate().back();
    Thread.sleep(4000);
    c.navigate().forward();
    Thread.sleep(4000);
    c.navigate().refresh();
	String a = c.getTitle();
	System.out.println("Title is:"+a);
	String b= c.getCurrentUrl();
	System.out.println("The current url is:"+b);
	c.close();
	
	}

}
