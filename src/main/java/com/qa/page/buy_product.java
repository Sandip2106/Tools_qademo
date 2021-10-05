package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buy_product {
	
	@FindBy(xpath="//*[text()='Interactions']")
	WebElement header;
	
	@FindBy(xpath="//span[text()='Selectable']")
	WebElement selctable;
	
	
	public buy_product (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
