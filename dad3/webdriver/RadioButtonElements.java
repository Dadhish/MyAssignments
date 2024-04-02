package com.webdriver;
//W.A.J. Script To perform the radio button to select one by one in loop

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver mfDriver = new FirefoxDriver();
		
		mfDriver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(3000);

		mfDriver.manage().window().maximize();
		Thread.sleep(3000);
		
		for (int i = 1; i <= 3; i++) {
			mfDriver.findElement(By.id("vfb-7-" + i)).click();	
			Thread.sleep(2000);
		}

		mfDriver.close();
	}

}
