package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FnolFinalPage {

	WebDriver driver;
	By selAdjuster = By.xpath("//*[@id=\"AdjusterCode\"]");
	By btnAccept = By.xpath("//*[@id=\"btnAccept\"]");
	By txtClaimNumber = By.xpath("/html/body/div[5]/div/div/div[2]");
	By btnDialogClose = By.xpath("/html/body/div[5]/div/div/div[3]/div/div/button");
	
	public FnolFinalPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public By getSelAdjuster() {
		return selAdjuster;
	}
	
	public By getBtnDialogClose() {
		return btnDialogClose;
				
}
	public String getClaimNumberValue() {
		return driver.findElement(txtClaimNumber).getText();
	}
	
	public void setSelAdjuster(String adjuster) {
		Select adjusters = new Select(driver.findElement(selAdjuster));
		adjusters.selectByValue(adjuster);
	}
	
	public void clickBtnAccept() {
		driver.findElement(btnAccept).click();
	}
	
	public void clickBtnDialogClose() {
		driver.findElement(btnDialogClose).click();
	}
}
