package com.webdriver;

//W.A.J. script to use different methods to manage the windows-alerts and pop ups
//THIS PROGRAM IS FOR POP-UPs ONLY...

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPopUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver mfDriver = new FirefoxDriver();
		
		mfDriver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(3000);

		mfDriver.manage().window().maximize();
		Thread.sleep(3000);
		
		//To get the current tab address
		String main_window = mfDriver.getWindowHandle();
		System.out.println("Main window: " + main_window);
		
		mfDriver.findElement(By.partialLinkText("Click")).click();
		Thread.sleep(3000);
		
		//UPTO HERE,THE GIVEN LINK IS CLICKED AND NEW TAB WILL BE OPENED
		
		
		//To handle or manage the clicked window
		Set<String> all_windows = mfDriver.getWindowHandles();
		
		Iterator<String> i1 = all_windows.iterator();
		
		while (i1.hasNext()) {
			String child_window = (String) i1.next();
			
			System.out.println(child_window);
			
			if (!main_window.equalsIgnoreCase(child_window)) {
				mfDriver.switchTo().window(child_window);
				Thread.sleep(3000);
				
				mfDriver.findElement(By.name("emailid")).sendKeys("dd@gmail.com");
				Thread.sleep(3000);
				
				mfDriver.findElement(By.name("btnLogin")).click();
				Thread.sleep(3000);
				
				mfDriver.close();
			}			
		}
		
		Thread.sleep(3000);
		
		mfDriver.switchTo().window(main_window);
		Thread.sleep(3000);
				
		mfDriver.close();
		

	}

}
