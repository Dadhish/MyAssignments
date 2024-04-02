package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//W.A.J.Script for Selecting multiple items in a drop down


public class MultipleItemDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver mfDriver = new FirefoxDriver();
		
		mfDriver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(6000);
		

		
		WebElement eledropdown = mfDriver.findElement(By.name("country")); 
		
		Select sdropdownSelect = new Select(eledropdown);
		
		sdropdownSelect.selectByIndex(3);
		Thread.sleep(5000);
		
		sdropdownSelect.selectByValue("JAPAN");
		Thread.sleep(3000);
		
		sdropdownSelect.selectByVisibleText("MAURITIUS");
		Thread.sleep(4000);
		
		
		mfDriver.close();
	}

}
