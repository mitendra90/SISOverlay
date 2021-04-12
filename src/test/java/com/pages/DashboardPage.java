package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	WebDriver driver = null;
	WebElement element = null;
	By linkClaimsAdjusterInsight = By.xpath("/html/body/div[2]/div[1]/div[2]/a[2]/div/p[2]");
	By linkFnol = By.xpath("/html/body/div[2]/div[1]/div[2]/ul[2]/li[3]/a");
		
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By getLinkClaimsAdjusterInsight() {
		return linkClaimsAdjusterInsight;
	}
	
	public void clickClaimsAdjusterInsight() {
		driver.findElement(linkClaimsAdjusterInsight).click();
	}
	
	public void clickFnol() {
		driver.findElement(linkFnol).click();
	}


}
