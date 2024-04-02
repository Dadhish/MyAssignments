package com.webdriver;

//W.A.J.Script for Locating links by linkText() and partialLinkText()....

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextAndPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver mfDriver = new FirefoxDriver();
		
		mfDriver.get("https://phptravels.com/demo");
		Thread.sleep(3000);
		
		//This is for Linktext locator
		mfDriver.findElement(By.linkText("Demo"));
		Thread.sleep(3000);
		
		
		//This is for Partiallinktext locator
		mfDriver.findElement(By.partialLinkText("Prod")).click();
		Thread.sleep(3000);		
		
		mfDriver.findElement(By.partialLinkText("Integr")).click();
//		Thread.sleep(2000);
		
	}

}
