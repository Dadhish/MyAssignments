
package com_FAss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {
	//Declaration
	WebDriver driver;
	 
	    public void login(String emailid,String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");	
		
		//Initialization
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys(emailid);
		Thread.sleep(5000);

		driver.findElement(By.name("pass")).sendKeys(password);
		Thread.sleep(5000);

		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	
		driver.close();
		
	}

}
