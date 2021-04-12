package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WitnessPage {

	WebDriver driver = null;
	
	public WitnessPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Store Pedestrian field locators.
	By btnAddWitness = By.xpath("//*[@id=\"btnAddPassenger\"]");
	By txtWitnessFirstName = By.xpath("//*[@id=\"FirstName\"]");
	By txtWitnessLastName = By.xpath("//*[@id=\"LastName\"]");
	By txtWitnessStreetNo = By.xpath("//*[@id=\"Address_StreetNumber\"]");
	By txtWitnessStreetName = By.xpath("//*[@id=\"Address_StreetName\"]");
	By txtWitnessCity = By.xpath("//*[@id=\"Address_City\"]");
	By selWitnessState = By.xpath("//*[@id=\"Address_State\"]");
	By txtWitnessZipCode = By.xpath("//*[@id=\"Address_ZipCode\"]");
	By txtWitnessPhone = By.xpath("//*[@id=\"ContactTelephone\"]");
	By txtWitnessEmail = By.xpath("//*[@id=\"EmailId\"]");
	By btnWitnessSubmit = By.xpath("//*[@id=\"btnSubmitPassenger\"]");
	By btnWitnessDataSaveClose = By.xpath("/html/body/div[5]/div/div/div[3]/div/div/button");
	By btnWitnessFinalSubmit = By.xpath("//*[@id=\"btnSubmit\"]");
	
	
	public void clickBtnAddWitness() {
		driver.findElement(btnAddWitness).click();
	}
	
	// Get First Name field.
	public By getTxtWitnessFirstName() {
		return txtWitnessFirstName;
	}
	
	// Clear Pedestrian fields.
	
	public void clearPedestrianFields() {
		driver.findElement(txtWitnessFirstName).clear();
		driver.findElement(txtWitnessLastName).clear();
		driver.findElement(txtWitnessStreetNo).clear();
		driver.findElement(txtWitnessStreetName).clear();
		driver.findElement(txtWitnessCity).clear();
		driver.findElement(txtWitnessZipCode).clear();
		driver.findElement(txtWitnessPhone).clear();
		driver.findElement(txtWitnessEmail).clear();
	}

	// Methods to Set values in Pedestrian info fields.
	
	public void setTxtWitnessFirstName(String witnessFirstName) {
		driver.findElement(txtWitnessFirstName).sendKeys(witnessFirstName);
	}

	public void setTxtWitnessLastName(String witnessLastName) {
		driver.findElement(txtWitnessLastName).sendKeys(witnessLastName);
	}

	public void setTxtWitnessStreetNo(String witnessStreetNo) {
		driver.findElement(txtWitnessStreetNo).sendKeys(witnessStreetNo);
	}	
	
	public void setTxtWitnessStreetName(String witnessStreetName) {
		driver.findElement(txtWitnessStreetName).sendKeys(witnessStreetName);
	}
	
	public void setTxtWitnessCity(String witnessCity) {
		driver.findElement(txtWitnessCity).sendKeys(witnessCity);
	}
	
	public void setSelWitnessState(String witnessState) {
		Select states = new Select(driver.findElement(selWitnessState));
		states.selectByValue(witnessState);
	}
	
	public void setTxtWitnessZipCode(String witnessZipCode) {
		driver.findElement(txtWitnessZipCode).sendKeys(witnessZipCode);
	}
	
	public void setTxtWitnessPhone(String witnessPhone) {
		driver.findElement(txtWitnessPhone).sendKeys(witnessPhone);
	}
	
	public void setTxtWitnessEmail(String witnessEmail) {
		driver.findElement(txtWitnessEmail).sendKeys(witnessEmail);
	}
	
	// Click method to submit and move on next page.
	
	public void clickBtnWitnessSubmit() {
		driver.findElement(btnWitnessSubmit).click();
	}
	
	public void clickBtnWitnessDataSaveClose() {
		driver.findElement(btnWitnessDataSaveClose).click();
	}
	
	public void clickBtnWitnessNext() {
		driver.findElement(btnWitnessFinalSubmit).click();
	}

}
