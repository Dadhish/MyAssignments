package com.webdriver;

//W.A.J.Script To use Mouse and Keyboard event using Action class
//2.	Keyboard Event


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Event {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver mfDriver = new FirefoxDriver();
		
		mfDriver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		mfDriver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement email = mfDriver.findElement(By.name("email"));
		
		//Actions is a class
		Actions actions = new Actions(mfDriver);
		
		Action a1 = actions
				.moveToElement(email)
				.click()
				.keyDown(email, Keys.SHIFT)
				.sendKeys("tanvi")
				.keyUp(email, Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
					
		//To implement any action,'perform()' method should apply. Otherwise,it will not be performed.
		a1.perform();		
		Thread.sleep(3000);		
		
		mfDriver.close();

	}

}
