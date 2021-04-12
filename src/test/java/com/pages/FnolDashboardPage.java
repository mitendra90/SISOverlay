package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FnolDashboardPage {
	WebDriver driver = null;
	WebElement element = null;
	By linkAddNewClaim = By.xpath("//*[@id=\"maincont_1\"]/ul/li[1]/a");
			
	public FnolDashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAddNewClaim() {
		driver.findElement(linkAddNewClaim).click();
	}
	

}
