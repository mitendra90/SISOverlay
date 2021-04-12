package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver = null;
	WebElement element = null;
	By txtUsername = By.xpath("//*[@id=\"txtUserID\"]");
	By txtPassword = By.xpath("//*[@id=\"txtPassword\"]");
	By btnLogin = By.xpath("//*[@id=\"btnSubmit\"]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUsername(String username) {
		driver.findElement(txtUsername).sendKeys(username);
	}
	public void setPassword(String password) {
		driver.findElement(txtPassword).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(btnLogin).click();
	}


}
