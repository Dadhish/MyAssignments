package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver mfDriver = new FirefoxDriver();
		
		mfDriver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		mfDriver.manage().window().maximize();
		Thread.sleep(3000);

		
		mfDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/div/img")).getText();
		System.out.println("");
		Thread.sleep(3000);
		
		mfDriver.close();
		
	}

}
