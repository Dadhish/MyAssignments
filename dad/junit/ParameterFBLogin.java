package com.junit;

////W.a. junit program to use parameterized demo with multiple parameter of Facebook login in junit.[Program 1]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParameterFBLogin {
	
	WebDriver mfWebDriver;
	
	
	public void test(String user_id , String password ) throws InterruptedException{
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		mfWebDriver = new FirefoxDriver();
		
		mfWebDriver.get("https://www.facebook.com/");
		
		mfWebDriver.manage().window().maximize();
		Thread.sleep(2000);
	
	
		mfWebDriver.findElement(By.cssSelector("input#email")).sendKeys(user_id);
		Thread.sleep(2000);
	
		mfWebDriver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys(password);
		Thread.sleep(2000);
	
		mfWebDriver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
		Thread.sleep(10000);
	

		mfWebDriver.close();

	}

}
