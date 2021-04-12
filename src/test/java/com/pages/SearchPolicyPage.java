package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPolicyPage {
	WebDriver driver = null;
	WebElement element = null;
	By txtLastName = By.xpath("//*[@id=\"lastName\"]");
	By btnFind = By.xpath("//*[@id=\"btnPolicySearch\"]");
	By linkLoadDetails = By.xpath("//*[@id=\"tblPolicies\"]/tbody/tr[1]/td[8]");
	By btnStartNewClaim = By.xpath("//*[@id=\"btnRegisterClaim\"]");
		
	public SearchPolicyPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By getButtonStartNewClaim() {
		return btnStartNewClaim;
	}
	public void setLastName(String LastName) {
		driver.findElement(txtLastName).sendKeys(LastName);
	}
	
	public void clickFind() {
		driver.findElement(btnFind).click();
	}
	
	public void clickLoadDetails() {
		driver.findElement(linkLoadDetails).click();
	}
	
	public void clickStartNewClaim() {
		driver.findElement(btnStartNewClaim).click();
	}


}
