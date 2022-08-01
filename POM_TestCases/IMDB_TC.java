package com.POM_TestCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM_Pages.IMDB_Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IMDB_TC {
	WebDriver driver;
	WebElement releaseDte;
	WebElement countryOfOrigin;
	IMDB_Page obj=new IMDB_Page(driver);

	@Test
	public void IMDB() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.imdb.com/title/tt9389998/");
		
		for(int i=1;i<=11;i++) {
			driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		}	
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			String exRrelsDate=driver.findElement(By.xpath("(//div[@class='ipc-metadata-list-item__content-container'])[17]")).getText();
			String actRelsDate="December 17, 2021 (India)";
			Assert.assertEquals(exRrelsDate, actRelsDate);
			
			String expCntryOfOrigin="India";
			String actCntryOfOrigin=driver.findElement(By.xpath("//a[text()='India']")).getText();
			Assert.assertEquals(actCntryOfOrigin, expCntryOfOrigin);
		
		
	}
}