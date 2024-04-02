package com.webdriver;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//W.A.J. Script To find the total hyperlink from this web page

public class Dynamic_Table_Hyperlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tops\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver mfDriver = new FirefoxDriver();
		
		mfDriver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(3000);

		mfDriver.manage().window().maximize();
		Thread.sleep(3000);
		
		//This is to find out number of columns
		List<WebElement> th = mfDriver.findElements(By.xpath("/html/body/div[1]/div[3]/div[1]/table/thead/tr/th"));
		System.out.println("No of columns: " +  th.size());
		
		
		//This is to find out number of rows
		List<WebElement> tr = mfDriver.findElements(By.xpath("/html/body/div[1]/div[3]/div[1]/table/tbody/tr"));
		System.out.println("No of rows: " +  tr.size());
		
		
		for (int i = 1; i < tr.size(); i++) {
			for (int j = 1; j < th.size(); j++) {
				//To show table data
				String table_data = mfDriver.findElement
						(By.xpath("/html/body/div[1]/div[3]/div[1]/table/tbody/tr[" + i + "]/td["+ j + "]")).getText();
				System.out.print("  |  " + table_data);
			}
			
			Thread.sleep(2000);
			System.out.println();				
		}
		
		

	}

}
