package com.hdfc.loans.personalloans;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriver1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//Drivers//MicrosoftWebDriver.exe");
  EdgeDriver i=new EdgeDriver();
  i.get("https://www.google.com");

	}

}
