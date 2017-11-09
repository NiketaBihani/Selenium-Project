package com.hdfc.loans.personalloans;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//FFDriver//geckodriver.exe");
  FirefoxDriver ff=new FirefoxDriver();
  ff.get("https://www.google.com");

	}

}
