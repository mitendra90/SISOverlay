package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LossLocationPage {
	WebDriver driver = null;
	WebElement element = null;
	
	By txtLossLocationStreetNo = By.xpath("//*[@id=\"AccidentLocation_AccidentStreetNumber\"]");
	By txtLossLocationStreetName = By.xpath("//*[@id=\"AccidentLocation_AccidentStreetName\"]");
	By txtLossLocationCity = By.xpath("//*[@id=\"AccidentLocation_City\"]");
	By selLossLocationState = By.xpath("//*[@id=\"AccidentLocation_State\"]");
	By txtLossLocationZipCode = By.xpath("//*[@id=\"AccidentLocation_ZipCode\"]");
	By txtLossLocationPoliceDepartmentName = By.xpath("//*[@id=\"PoliceDepartment\"]");
	By btnLossLocationNext = By.xpath("//*[@id=\"rootwizard\"]/div/ul/li[2]/a");
	By selLossLocationAccidentCode = By.xpath("//*[@id=\"AccidentCode\"]");
	
	public LossLocationPage(WebDriver driver) {
		this.driver = driver;
	}
		
	public void clearLossLocationFields() {
		
		driver.findElement(txtLossLocationStreetNo).clear();
		driver.findElement(txtLossLocationStreetName).clear();
		driver.findElement(txtLossLocationCity).clear();
		//driver.findElement(selInsuredState).clear();
		driver.findElement(txtLossLocationZipCode).clear();
		driver.findElement(txtLossLocationPoliceDepartmentName).clear();
		
				
	}

	public By getLossLocationStreetNo() {
		return txtLossLocationStreetNo;
	}
	
	public void setTxtLossLocationStreetNo(String lossLocationStreetNo) {
		driver.findElement(txtLossLocationStreetNo).sendKeys(lossLocationStreetNo);
	}

	public void setTxtLossLocationStreetName(String lossLocationStreetName) {
		driver.findElement(txtLossLocationStreetName).sendKeys(lossLocationStreetName);
	}

	public void setTxtLossLocationCity(String lossLocationCity) {
		driver.findElement(txtLossLocationCity).sendKeys(lossLocationCity);
	}

	public void setSelLossLocationState(String lossLocationStateCode) {
		Select states = new Select(driver.findElement(selLossLocationState));
		states.selectByValue(lossLocationStateCode);
	}
	
	public void setTxtLossLocationZipCode(String lossLocationZipCode) {
		driver.findElement(txtLossLocationZipCode).sendKeys(lossLocationZipCode);
	}

	public void setTxtLossLocationPoliceDepartmentName(String lossLocationPoliceDepartmentName) {
		driver.findElement(txtLossLocationPoliceDepartmentName).sendKeys(lossLocationPoliceDepartmentName);
	}
	
	public void setSelLossLocationAccidentCode(String lossLocationAccidentCode) {
		Select states = new Select(driver.findElement(selLossLocationAccidentCode));
		states.selectByValue(lossLocationAccidentCode);
	}

		
	public void clickBtnlossLocationNext() {
		driver.findElement(btnLossLocationNext).click();
	}
	

}
