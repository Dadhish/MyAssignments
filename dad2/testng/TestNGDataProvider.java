package com.testng;

//W.a. TestNG program to create dataprovider.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	@DataProvider(name = "tanvi")
	public Object[][] input() {
		return new Object[][] {{"demouser","testingisfun99"},{"fev_user","testingisfun99"}};		
	}
	
	@Test(dataProvider = "tanvi")
	public void f(String username,String password) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver mofDriver;
		
		mofDriver = new FirefoxDriver();
		
		mofDriver.get("https://bstackdemo.com/signin/");
		Thread.sleep(3000);		
		
		mofDriver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
			
		mofDriver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
			
		mofDriver.findElement(By.id("login-btn")).click();
		Thread.sleep(2000);
			
		mofDriver.close();		
		
	}

}
