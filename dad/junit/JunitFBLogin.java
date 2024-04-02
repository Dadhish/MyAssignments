package com.junit;

//W.a. junit program to perform test with webdriver to login process of facebook

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitFBLogin {
	
	WebDriver mfWebDriver;
	
	@Test
	public void login() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		mfWebDriver = new FirefoxDriver();
		
		mfWebDriver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		mfWebDriver.findElement(By.name("email")).sendKeys("hemal@gmail.com");
		Thread.sleep(3000);
		
		mfWebDriver.findElement(By.name("pass")).sendKeys("569");
		Thread.sleep(3000);
		
		mfWebDriver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		
		mfWebDriver.close();	
		
	}

}
