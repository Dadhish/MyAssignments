package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To select driver along with browser
		System.setProperty("webdriver.chorme.driver",
				"C:\\Users\\tops\\Desktop\\Selenium\\chrome-win64\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//To open the blank tab or a browser only
		WebDriver gcdriver = new ChromeDriver();
		
		gcdriver.get("https://www.coca-colacompany.com/");

	}

}
