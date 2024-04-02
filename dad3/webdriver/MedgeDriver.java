package com.webdriver;

//THIS PROGRAM IS REGARDING WITH MICROSOFT EDGE BROWSER

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MedgeDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//To select driver along with browser
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tops\\Desktop\\Selenium\\msedgedriver.exe");
		//SET DRIVER IN LIBRARY AND THEN COME BACK[THIS PROCESS IS DONE ONLY ONCE FOR RESPECTIVE PROJECT]
		
		//To open the blank tab or a browser only
		WebDriver driver = new EdgeDriver();
		
		//To open a website
		driver.get("https://www.baeldung.com/");
		
		
		//To put sometime before closing the tab only
		Thread.sleep(10000);
		
		//To close the opened tab
		driver.close();
		
		//To put sometime before closing the tab only		
		Thread.sleep(4000);
		
		//To close a browser
		driver.quit();
		

	}

}
