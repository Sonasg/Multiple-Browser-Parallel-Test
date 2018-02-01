package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {

	@FindBy(name="q")
	WebElement search;
	
	WebDriver driver;
	
	public PageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public void search(String query)
	{
		search.sendKeys(query);
		search.submit();
	}
	
	
}
