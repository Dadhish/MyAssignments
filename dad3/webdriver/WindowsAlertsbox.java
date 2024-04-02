package com.webdriver;

//W.A.J. script to use different methods to manage the windows-alerts and pop ups.
//THIS PROGRAM IS FOR WINDOWS ALERT ONLY...

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsAlertsbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver mfDriver = new FirefoxDriver();
		
		mfDriver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(6000);

		
		mfDriver.manage().window().maximize();
		Thread.sleep(3000);
		
		mfDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("897456");
		Thread.sleep(3000);
		
		//To reset the the value [if require]
		//	mfDriver.findElement(By.name("res")).click();
		//	Thread.sleep(3000);
		
		mfDriver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		
		//To move on alert box activity
		Alert alertwindowAlert = mfDriver.switchTo().alert();
		
		//To get sentence from an alert box
//		System.out.println(alertwindowAlert.getText());
		
		//NOW,PERFORM THE DESIRED ACTIVITY...HERE,TWO ACTIVITIES WILL HAPPEN.
				//1]CANCEL BUTTON AND 2]OK BUTTON(Select any desired one)
		
		//To click on 'Cancel' button
//		alertwindowAlert.dismiss();
		
		//To click on 'OK' button
		alertwindowAlert.accept();
		Thread.sleep(3000);
		
		Alert alertanotherwindowAlert = mfDriver.switchTo().alert();		
		
		System.out.println(alertanotherwindowAlert.getText());
		
		alertanotherwindowAlert.accept();
		Thread.sleep(4000);
		
		mfDriver.close();
	}

}
