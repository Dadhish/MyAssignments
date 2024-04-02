package com.testng;

//W.a. TestNG program to use parameterized demo with multiple parameter of Facebook login with TestNG.

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class TestNGParameter{
	  
	@Test
	@Parameters({"username","password"})
	 
	  public void f(String username,String password) throws InterruptedException {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
			
			WebDriver mofDriver;
			
			mofDriver = new FirefoxDriver();
			
			mofDriver.get("https://www.facebook.com/");
			Thread.sleep(3000);			
			
			//For Implicitly wait
			mofDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
			mofDriver.findElement(By.id("email")).sendKeys(username);
			Thread.sleep(2000);
				
			mofDriver.findElement(By.id("pass")).sendKeys(password);
			Thread.sleep(2000);
				
			mofDriver.findElement(By.name("login")).click();
			Thread.sleep(2000);
				
			mofDriver.close();
	  }

}