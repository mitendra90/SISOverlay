package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrimaryDetailsPage {
	WebDriver driver = null;
	WebElement element = null;
	By txtInsuredFirstName = By.xpath("//*[@id=\"InsuredFirstName\"]");
	By txtInsuredLastName = By.xpath("//*[@id=\"InsuredLastName\"]");
	By txtInsuredStreetNo = By.xpath("//*[@id=\"Address_StreetNumber\"]");
	By txtInsuredStreetName = By.xpath("//*[@id=\"Address_StreetName\"]");
	By txtInsuredCity = By.xpath("//*[@id=\"Address_City\"]");
	By selInsuredState = By.xpath("//*[@id=\"Address_State\"]");
	By txtInsuredZipCode = By.xpath("//*[@id=\"Address_ZipCode\"]");
	By txtInsuredAltPhone = By.xpath("//*[@id=\"WorkTelephone\"]");
	By txtInsuredCellPhone = By.xpath("//*[@id=\"HomeTelephone\"]");
	By txtInsuredEmail = By.xpath("//*[@id=\"EmailId\"]");
	By txtInsuredReportCo = By.xpath("//*[@id=\"ReportedToCompanyBy\"]");
	By txtInsuredCellPhone2 = By.xpath("//*[@id=\"ReportedCompanyPhone\"]");
	By btnInsuredNext = By.xpath("//*[@id=\"rootwizard\"]/div/ul/li[2]/a");
	
	public PrimaryDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
		
	public void clearInsuredFields() {
		driver.findElement(txtInsuredFirstName).clear();
		driver.findElement(txtInsuredLastName).clear();
		driver.findElement(txtInsuredStreetNo).clear();
		driver.findElement(txtInsuredStreetName).clear();
		driver.findElement(txtInsuredCity).clear();
		//driver.findElement(selInsuredState).clear();
		driver.findElement(txtInsuredZipCode).clear();
		driver.findElement(txtInsuredAltPhone).clear();
		driver.findElement(txtInsuredCellPhone).clear();
		driver.findElement(txtInsuredEmail).clear();
		driver.findElement(txtInsuredReportCo).clear();
		driver.findElement(txtInsuredReportCo).clear();
				
	}

	public By getInsuredFirstName() {
		return txtInsuredFirstName;
	}
	
	public void setTxtInsuredFirstName(String insuredFirstName) {
		driver.findElement(txtInsuredFirstName).sendKeys(insuredFirstName);
	}

	public void setTxtInsuredLastName(String insuredLastName) {
		driver.findElement(txtInsuredLastName).sendKeys(insuredLastName);
	}

	public void setTxtInsuredStreetNo(String insuredStreetNo) {
		driver.findElement(txtInsuredStreetNo).sendKeys(insuredStreetNo);
	}

	public void setTxtInsuredStreetName(String insuredStreetName) {
		driver.findElement(txtInsuredStreetName).sendKeys(insuredStreetName);
	}

	public void setTxtInsuredCity(String insuredCity) {
		driver.findElement(txtInsuredCity).sendKeys(insuredCity);
	}

	public void setTxtInsuredState(String stateCode) {
		Select states = new Select(driver.findElement(selInsuredState));
		states.selectByValue(stateCode);
	}
	
	public void setTxtInsuredZipCode(String insuredZipCode) {
		driver.findElement(txtInsuredZipCode).sendKeys(insuredZipCode);
	}

	public void setTxtInsuredAltPhone(String insuredAltPhone) {
		driver.findElement(txtInsuredAltPhone).sendKeys(insuredAltPhone);
	}

	public void setTxtInsuredCellPhone(String insuredCellPhone) {
		driver.findElement(txtInsuredCellPhone).sendKeys(insuredCellPhone);
	}

	public void setTxtInsuredEmail(String insuredEmail) {
		driver.findElement(txtInsuredEmail).sendKeys(insuredEmail);
	}

	public void setTxtInsuredReportCo(String insuredReportCo) {
		driver.findElement(txtInsuredReportCo).sendKeys(insuredReportCo);
	}

	public void setTxtInsuredCellPhone2(String insuredCellPhone2) {
		driver.findElement(txtInsuredCellPhone2).sendKeys(insuredCellPhone2);
	}
	
	public void clickBtnInsuredNext() {
		driver.findElement(btnInsuredNext).click();
	}
	

}
