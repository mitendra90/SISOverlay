package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PedestrianPage {

	WebDriver driver = null;
	
	public PedestrianPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Store Pedestrian field locators.
	By btnAddInjuredParty = By.xpath("//*[@id=\"btnAddInjury\"]");
	By txtPedestrianFirstName = By.xpath("//*[@id=\"FirstName\"]");
	By txtPedestrianLastName = By.xpath("//*[@id=\"LastName\"]");
	By txtPedestrianStreetNo = By.xpath("//*[@id=\"Address_StreetNumber\"]");
	By txtPedestrianStreetName = By.xpath("//*[@id=\"Address_StreetName\"]");
	By txtPedestrianCity = By.xpath("//*[@id=\"Address_City\"]");
	By selPedestrianState = By.xpath("//*[@id=\"Address_State\"]");
	By txtPedestrianZipCode = By.xpath("//*[@id=\"Address_ZipCode\"]");
	By txtPedestrianPhone = By.xpath("//*[@id=\"ContactTelephone\"]");
	By txtPedestrianEmail = By.xpath("//*[@id=\"EmailId\"]");
	By btnPedestrianSubmit = By.xpath("//*[@id=\"btnSubmitInjury\"]");
	By btnPedestrianDataSaveClose = By.xpath("/html/body/div[5]/div/div/div[3]/div/div/button");
	By btnPedestrianNext = By.xpath("//*[@id=\"rootwizard\"]/div/ul/li[2]/a");
	
	
	public void clickBtnAddInjuredParty() {
		driver.findElement(btnAddInjuredParty).click();
	}
	
	// Get First Name field.
	public By getTxtPedestrianFirstName() {
		return txtPedestrianFirstName;
	}
	
	// Clear Pedestrian fields.
	
	public void clearPedestrianFields() {
		driver.findElement(txtPedestrianFirstName).clear();
		driver.findElement(txtPedestrianLastName).clear();
		driver.findElement(txtPedestrianStreetNo).clear();
		driver.findElement(txtPedestrianStreetName).clear();
		driver.findElement(txtPedestrianCity).clear();
		driver.findElement(txtPedestrianZipCode).clear();
		driver.findElement(txtPedestrianPhone).clear();
		driver.findElement(txtPedestrianEmail).clear();
	}

	// Methods to Set values in Pedestrian info fields.
	
	public void setTxtPedestrianFirstName(String pedestrianFirstName) {
		driver.findElement(txtPedestrianFirstName).sendKeys(pedestrianFirstName);
	}

	public void setTxtPedestrianLastName(String pedestrianLastName) {
		driver.findElement(txtPedestrianLastName).sendKeys(pedestrianLastName);
	}

	public void setTxtPedestrianStreetNo(String pedestrianStreetNo) {
		driver.findElement(txtPedestrianStreetNo).sendKeys(pedestrianStreetNo);
	}	
	
	public void setTxtPedestrianStreetName(String pedestrianStreetName) {
		driver.findElement(txtPedestrianStreetName).sendKeys(pedestrianStreetName);
	}
	
	public void setTxtPedestrianCity(String pedestrianCity) {
		driver.findElement(txtPedestrianCity).sendKeys(pedestrianCity);
	}
	
	public void setSelPedestrianState(String pedestrianState) {
		Select states = new Select(driver.findElement(selPedestrianState));
		states.selectByValue(pedestrianState);
	}
	
	public void setTxtPedestrianZipCode(String pedestrianZipCode) {
		driver.findElement(txtPedestrianZipCode).sendKeys(pedestrianZipCode);
	}
	
	public void setTxtPedestrianPhone(String pedestrianPhone) {
		driver.findElement(txtPedestrianPhone).sendKeys(pedestrianPhone);
	}
	
	public void setTxtPedestrianEmail(String pedestrianEmail) {
		driver.findElement(txtPedestrianEmail).sendKeys(pedestrianEmail);
	}
	
	// Click method to submit and move on next page.
	
	public void clickBtnPedestrianSubmit() {
		driver.findElement(btnPedestrianSubmit).click();
	}
	
	public void clickBtnPedestrianDataSaveClose() {
		driver.findElement(btnPedestrianDataSaveClose).click();
	}
	
	public void clickBtnPedestrianNext() {
		driver.findElement(btnPedestrianNext).click();
	}

}
