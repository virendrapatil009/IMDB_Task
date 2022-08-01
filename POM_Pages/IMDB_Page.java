package com.POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IMDB_Page {
	private WebDriver driver;
	
	@FindBy(xpath="//a[text()='Release date']")
	private WebElement releaseDte;
	
	@FindBy(xpath="//span[text()='Country of origin']")
	private WebElement countryOfOrigin;
	
	public IMDB_Page(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void clickOnReleaseDte() {
		releaseDte.click();
	}
	
	public void clickOnCountryOrigin() {
		countryOfOrigin.click();
	}
}
