package com.testng;

//W.a. TestNG program to perform test with webdriver to login process of facebook

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFBLogin {
	
	WebDriver mofDriver;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		mofDriver = new FirefoxDriver();
		
		mofDriver.get("https://www.facebook.com/");
		Thread.sleep(3000);		
	}
	
	@Test(priority = 1)
	public void enterPassword() throws InterruptedException {
		
		mofDriver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("563");
		Thread.sleep(3000);		
	}
	
	@Test(priority = 0)
	public void enterEmail() throws InterruptedException {
		
		mofDriver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("tanvi@gmail.com");
		Thread.sleep(3000);		
	}
	
	@Test(priority = 2)
	public void clickLogin() throws InterruptedException {
		
		mofDriver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
		Thread.sleep(10000);		
	}
	
	@AfterTest
	public void afterTest() {
		mofDriver.close();
	}

}
