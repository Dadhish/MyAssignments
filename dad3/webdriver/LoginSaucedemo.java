package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSaucedemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//To select driver along with browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		//To open the blank tab or a browser only
		WebDriver sldrivDriver = new FirefoxDriver();
		
		//To open a particular website
		sldrivDriver.get("https://www.saucedemo.com/");
		
		//To maximize a browser window
		sldrivDriver.manage().window().maximize();
		
		sldrivDriver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		
		sldrivDriver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		sldrivDriver.findElement(By.name("login-button")).click();
		Thread.sleep(5000);
		
		sldrivDriver.close();
		
		
		Thread.sleep(4000);
		
		sldrivDriver.quit();

	}

}
