package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.PageObjects.PageObjects;

public class TestSearch {

	static WebDriver driver;
	
		@Test
		@Parameters(value={"browser"})
		public void search(String browser)
		{
			if(browser.equals("Google"))
			{
				System.setProperty("webdriver.chrome.driver", ".//libs//chromedriver.exe");
				driver = new ChromeDriver();
			}
			else
			{
				System.setProperty("webdriver.ie.driver", ".//libs//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.get("https://www.google.com");
			PageObjects obj = PageFactory.initElements(driver,PageObjects.class);
			obj.search("abc");
		
	}
	
	
}
