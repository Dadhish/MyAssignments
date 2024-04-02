package com.webdriver;

//THIS PROGRAM IS REGARDING WITH MOZILLA FIREFOX BROWSER

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MfireFox {
	public static void main(String[] args) throws InterruptedException {
		//To select driver along with browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		//To open the blank tab or a browser only
		WebDriver mfDriver = new FirefoxDriver();
		
		//To open a particular website
		mfDriver.get("https://www.vogella.com/tutorials/EclipseShortcuts/article.html");
		
		//To maximize a browser window
		mfDriver.manage().window().maximize();
		
		//To put sometime before closing the tab only
		Thread.sleep(4000);
		
		//To close the opened tab
		mfDriver.close();
		
		//To close a browser
		mfDriver.quit();		
		
	}

}
