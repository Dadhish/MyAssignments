package com.webdriver;

//Demo Websites To Practice selenium Webdriver


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VariousWebsiteURL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver websiteDriver = new FirefoxDriver();
		
		websiteDriver.get("https://phptravels.com/demo");
		
		//To maximize browser window
		websiteDriver.manage().window().maximize();
		Thread.sleep(5000);
		
		websiteDriver.get("https://thedemosite.co.uk/");
		
		Thread.sleep(5000);
		
		websiteDriver.get("https://demo.guru99.com/test/newtours/");
		
		Thread.sleep(5000);
		
		websiteDriver.close();

	}

}
