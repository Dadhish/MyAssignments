package com.webdriver;

//W.A.J.Script To use Mouse and Keyboard event using Action class
//1.	Mouse Hover Event

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ele_Mouse_event {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver mfDriver = new FirefoxDriver();
		
		mfDriver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);

		mfDriver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement home = mfDriver.findElement(By.linkText("Home"));
		
		WebElement flight = mfDriver.findElement(By.linkText("Flights"));
		
		WebElement hotel = mfDriver.findElement(By.linkText("Hotels"));
		      
		//Actions is a class
		Actions actions = new Actions(mfDriver);
		
		//Action is an interface
		Action a1 = actions
						.moveToElement(home)
						.build();
		//To implement any action,'perform()' method should apply. Otherwise,it will not be performed.
		a1.perform();		
		Thread.sleep(3000);
		
		Action a2 = actions
				.moveToElement(flight)
				.build();
		//To implement any action,'perform()' method should apply. Otherwise,it will not be performed.
		a2.perform();		
		Thread.sleep(3000);
		
		Action a3 = actions
				.moveToElement(hotel)
				.build();
		//To implement any action,'perform()' method should apply. Otherwise,it will not be performed.
		a3.perform();		
		Thread.sleep(3000);
		
		mfDriver.close();	

	}

}
