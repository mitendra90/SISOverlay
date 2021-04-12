package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InsuredVehiclePage {
	WebDriver driver = null;
	WebElement element = null;
	
	public InsuredVehiclePage(WebDriver driver) {
		this.driver = driver;
	}	
	
	// Store Insured Vehicle Info data.
	By selInsuredVehicle = By.xpath("//*[@id=\"UnitNumber\"]");
	By txtInsuredVehicleYear = By.xpath("//*[@id=\"Year\"]");
	By txtInsuredVehicleMake = By.xpath("//*[@id=\"Make\"]");
	By txtInsuredVehicleModel = By.xpath("//*[@id=\"Model\"]");
	By selInsuredVehicleColor = By.xpath("//*[@id=\"ColorValue\"]");
	By txtInsuredVehicleTagNo = By.xpath("//*[@id=\"Tag\"]");
	By btnInsuredVehicleNext = By.xpath("//*[@id=\"rootwizard\"]/div/ul/li[2]/a");
	
	public By getSelInsuredVehicle() {
		return selInsuredVehicle;
	}
	
	public By getBtnInsuredVehicleNext() {
		return btnInsuredVehicleNext;
	}
	
	// Clear Insured Vehicle info fields.
		public void clearInusredVehicleFields() {
			
//			driver.findElement(txtInsuredVehicleYear).clear();
//			driver.findElement(txtInsuredVehicleMake).clear();
//			driver.findElement(txtInsuredVehicleModel).clear();
			driver.findElement(txtInsuredVehicleTagNo).clear();
							
		}	
		
		// Set values in Insured Vehicle info fields.
		
		public void setSelInsuredVehicle(String insuredVehicle) {
			Select vehicles = new Select(driver.findElement(selInsuredVehicle));
			vehicles.selectByValue(insuredVehicle);
		}
		public void setTxtInsuredVehicleYear(String insuredVehicleYear) {
			driver.findElement(txtInsuredVehicleYear).sendKeys(insuredVehicleYear);
		}

		public void setTxtInsuredVehicleMake(String insuredVehicleMake) {
			driver.findElement(txtInsuredVehicleMake).sendKeys(insuredVehicleMake);
		}

		public void setTxtInsuredVehicleModel(String insuredVehicleModel) {
			driver.findElement(txtInsuredVehicleModel).sendKeys(insuredVehicleModel);
		}		
		
		public void setSelInsuredVehicleColor(String insuredVehicleColor) {
			Select colors = new Select(driver.findElement(selInsuredVehicleColor));
			colors.selectByValue(insuredVehicleColor);
		}
		
		
		public void setTxtInsuredVehicleTagNo(String insuredVehicleTagNo) {
			driver.findElement(txtInsuredVehicleTagNo).sendKeys(insuredVehicleTagNo);
		}
			
		public void clickBtnInsuredVehicleNext() {
			driver.findElement(btnInsuredVehicleNext).click();
		}
		
	
	// Store Insured Vehicle Owner data.
	
	By txtInsuredVehicleOwnerFirstName = By.xpath("//*[@id=\"InsuredVehicleOwnersFirstName\"]");
	By txtInsuredVehicleOwnerLastName = By.xpath("//*[@id=\"InsuredVehicleOwnersLastName\"]");
	By txtInsuredVehicleOwnerStreetNo = By.xpath("//*[@id=\"InsuredVehicleOwnersAddress_StreetNumber\"]"); 
	By txtInsuredVehicleOwnerStreetName = By.xpath("//*[@id=\"InsuredVehicleOwnersAddress_StreetName\"]");
	By txtInsuredVehicleOwnerCity = By.xpath("//*[@id=\"InsuredVehicleOwnersAddress_City\"]");
	By selInsuredVehicleOwnerState = By.xpath("//*[@id=\"InsuredVehicleOwnersAddress_State\"]");
	By txtInsuredVehicleOwnerZipCode = By.xpath("//*[@id=\"InsuredVehicleOwnersAddress_ZipCode\"]");
	By txtInsuredVehicleOwnerAltPhone = By.xpath("//*[@id=\"InsuredVehicleOwnersWorkTelephone\"]");
	By txtInsuredVehicleOwnerCellPhone = By.xpath("//*[@id=\"InsuredVehicleOwnersHomeTelephone\"]");
	By txtInsuredVehicleOwnerEmail = By.xpath("//*[@id=\"InsuredVehicleOwnersEmailId\"]");
	
     public void clearInusredVehicleOwnerFields() {
		
		driver.findElement(txtInsuredVehicleOwnerFirstName).clear();
		driver.findElement(txtInsuredVehicleOwnerLastName).clear();
		driver.findElement(txtInsuredVehicleOwnerStreetNo).clear();
		driver.findElement(txtInsuredVehicleOwnerStreetName).clear();
		driver.findElement(txtInsuredVehicleOwnerCity).clear();
		
		driver.findElement(txtInsuredVehicleOwnerZipCode).clear();
		driver.findElement(txtInsuredVehicleOwnerAltPhone).clear();
		driver.findElement(txtInsuredVehicleOwnerCellPhone).clear();
		driver.findElement(txtInsuredVehicleOwnerEmail).clear();
				
	}
     
     // Set values in Insured Vehicle Owner info fields.

     
		public void setTxtInsuredVehicleOwnerFirstName(String insuredVehicleOwnerFirstName) {
			driver.findElement(txtInsuredVehicleOwnerFirstName).sendKeys(insuredVehicleOwnerFirstName);
		}

		public void setTxtInsuredVehicleOwnerLastName(String insuredVehicleOwnerLastName) {
			driver.findElement(txtInsuredVehicleOwnerLastName).sendKeys(insuredVehicleOwnerLastName);
		}

		public void setTxtInsuredVehicleOwnerStreetNo(String insuredVehicleOwnerStreetNo) {
			driver.findElement(txtInsuredVehicleOwnerStreetNo).sendKeys(insuredVehicleOwnerStreetNo);
		}	
		
		public void setTxtInsuredVehicleOwnerStreetName(String insuredVehicleOwnerStreetName) {
			driver.findElement(txtInsuredVehicleOwnerStreetName).sendKeys(insuredVehicleOwnerStreetName);
		}
		
		public void setTxtInsuredVehicleOwnerCity(String insuredVehicleOwnerCity) {
			driver.findElement(txtInsuredVehicleOwnerCity).sendKeys(insuredVehicleOwnerCity);
		}
		
		public void setSelInsuredVehicleOwnerState(String insuredVehicleOwnerState) {
			Select states = new Select(driver.findElement(selInsuredVehicleOwnerState));
			states.selectByValue(insuredVehicleOwnerState);
		}
		
		public void setTxtInsuredVehicleOwnerZipCode(String insuredVehicleOwnerZipCode) {
			driver.findElement(txtInsuredVehicleOwnerZipCode).sendKeys(insuredVehicleOwnerZipCode);
		}
		
		public void setTxtInsuredVehicleOwnerAltPhone(String insuredVehicleOwnerAltPhone) {
			driver.findElement(txtInsuredVehicleOwnerAltPhone).sendKeys(insuredVehicleOwnerAltPhone);
		}
		
		public void setTxtInsuredVehicleOwnerCellPhone(String insuredVehicleOwnerCellPhone) {
			driver.findElement(txtInsuredVehicleOwnerCellPhone).sendKeys(insuredVehicleOwnerCellPhone);
		}
		
		public void setTxtInsuredVehicleOwnerEmail(String insuredVehicleOwnerEmail) {
			driver.findElement(txtInsuredVehicleOwnerEmail).sendKeys(insuredVehicleOwnerEmail);
		}			
		
	// Store Insured Driver info data.
	
	By txtInsuredDriverFirstName = By.xpath("//*[@id=\"DriversFirstName\"]");
	By txtInsuredDriverLastName = By.xpath("//*[@id=\"DriversLastName\"]");
	By txtInsuredDriverStreetNo = By.xpath("//*[@id=\"DriversAddress_StreetNumber\"]"); 
	By txtInsuredDriverStreetName = By.xpath("//*[@id=\"DriversAddress_StreetName\"]");
	By txtInsuredDriverCity = By.xpath("//*[@id=\"DriversAddress_City\"]");
	By selInsuredDriverState = By.xpath("//*[@id=\"DriversAddress_State\"]");
	By txtInsuredDriverZipCode = By.xpath("//*[@id=\"DriversAddress_ZipCode\"]");
	By txtInsuredDriverAltPhone = By.xpath("//*[@id=\"DriversWorkTelephone\"]");
	By txtInsuredDriverCellPhone = By.xpath("//*[@id=\"DriversHomeTelephone\"]");
	By txtInsuredDriverEmail = By.xpath("//*[@id=\"DriversEmailId\"]");
	
			
    public void clearInusredVehicleDriverFields() {
		
		driver.findElement(txtInsuredDriverFirstName).clear();
		driver.findElement(txtInsuredDriverLastName).clear();
		driver.findElement(txtInsuredDriverStreetNo).clear();
		driver.findElement(txtInsuredDriverStreetName).clear();
		driver.findElement(txtInsuredDriverCity).clear();
		driver.findElement(txtInsuredDriverZipCode).clear();
		driver.findElement(selInsuredDriverState).clear();
		driver.findElement(txtInsuredDriverAltPhone).clear();
		driver.findElement(txtInsuredDriverCellPhone).clear();
		driver.findElement(txtInsuredDriverEmail).clear();		
				
	}	
    
    // Set values in Insured Vehicle Driver fields.
    
	public void setTxtInsuredDriverFirstName(String insuredDriverFirstName) {
		driver.findElement(txtInsuredDriverFirstName).sendKeys(insuredDriverFirstName);
	}

	public void setTxtInsuredDriverLastName(String insuredDriverLastName) {
		driver.findElement(txtInsuredDriverLastName).sendKeys(insuredDriverLastName);
	}

	public void setTxtInsuredDriverStreetNo(String insuredDriverStreetNo) {
		driver.findElement(txtInsuredDriverStreetNo).sendKeys(insuredDriverStreetNo);
	}	
	
	public void setTxtInsuredDriverStreetName(String insuredDriverStreetName) {
		driver.findElement(txtInsuredDriverStreetName).sendKeys(insuredDriverStreetName);
	}
	
	public void setTxtInsuredDriverCity(String insuredDriverCity) {
		driver.findElement(txtInsuredDriverCity).sendKeys(insuredDriverCity);
	}
	
	public void setSelInsuredDriverState(String insuredDriverState) {
		Select states = new Select(driver.findElement(selInsuredDriverState));
		states.selectByValue(insuredDriverState);
	}
	
	public void setTxtInsuredDriverZipCode(String insuredDriverZipCode) {
		driver.findElement(txtInsuredDriverZipCode).sendKeys(insuredDriverZipCode);
	}
	
	public void setTxtInsuredDriverAltPhone(String insuredDriverAltPhone) {
		driver.findElement(txtInsuredDriverAltPhone).sendKeys(insuredDriverAltPhone);
	}
	
	public void setTxtInsuredDriverCellPhone(String insuredDriverCellPhone) {
		driver.findElement(txtInsuredDriverCellPhone).sendKeys(insuredDriverCellPhone);
	}
	
	public void setTxtInsuredDriverEmail(String insuredDriverEmail) {
		driver.findElement(txtInsuredDriverEmail).sendKeys(insuredDriverEmail);
	}
		
	// Store Insured Passenger locators.
	
	By btnAddInjuredParty = By.xpath("//*[@id=\"btnAddInjuryIns\"]");
	By txtInsuredPassengerFirstName = By.xpath("//*[@id=\"FirstName\"]");
	By txtInsuredPassengerLastName = By.xpath("//*[@id=\"LastName\"]");
	By txtInsuredPassengerStreetNo = By.xpath("//*[@id=\"Address_StreetNumber\"]");
	By txtInsuredPassengerStreetName = By.xpath("//*[@id=\"Address_StreetName\"]");
	By txtInsuredPassengerCity = By.xpath("//*[@id=\"Address_City\"]");
	By selInsuredPassengerState = By.xpath("//*[@id=\"Address_State\"]");
	By txtInsuredPassengerZipCode = By.xpath("//*[@id=\"Address_ZipCode\"]");
	By txtInsuredPassengerPhone = By.xpath("//*[@id=\"ContactTelephone\"]");
	By txtInsuredPassengerEmail = By.xpath("//*[@id=\"EmailId\"]");
	By btnInsuredPassengerSubmit = By.xpath("//*[@id=\"btnSubmitInjuryIns\"]");
	By btnInjuryDataSaveClose = By.xpath("/html/body/div[5]/div/div/div[3]/div/div/button");
	
	   
	// Add New Passenger
	public void clickBtnAddInjuredParty() {
		driver.findElement(btnAddInjuredParty).click();
	}
	
	// Set values in Insured Passenger fields.
	
        public By getTxtInsuredPassengerFirstName() {
        	return txtInsuredPassengerFirstName;
        }
		public void setTxtInsuredPassengerFirstName(String insuredPassengerFirstName) {
			driver.findElement(txtInsuredPassengerFirstName).sendKeys(insuredPassengerFirstName);
		}

		public void setTxtInsuredPassengerLastName(String insuredPassengerLastName) {
			driver.findElement(txtInsuredPassengerLastName).sendKeys(insuredPassengerLastName);
		}

		public void setTxtInsuredPassengerStreetNo(String insuredPassengerStreetNo) {
			driver.findElement(txtInsuredPassengerStreetNo).sendKeys(insuredPassengerStreetNo);
		}	
		
		public void setTxtInsuredPassengerStreetName(String insuredPassengerStreetName) {
			driver.findElement(txtInsuredPassengerStreetName).sendKeys(insuredPassengerStreetName);
		}
		
		public void setTxtInsuredPassengerCity(String insuredPassengerCity) {
			driver.findElement(txtInsuredPassengerCity).sendKeys(insuredPassengerCity);
		}
		
		public void setSelInsuredPassengerState(String insuredPassengerState) {
			Select states = new Select(driver.findElement(selInsuredPassengerState));
			states.selectByValue(insuredPassengerState);
		}
		
		public void setTxtInsuredPassengerZipCode(String insuredPassengerZipCode) {
			driver.findElement(txtInsuredPassengerZipCode).sendKeys(insuredPassengerZipCode);
		}
		
		public void setTxtInsuredPassengerPhone(String insuredPassengerPhone) {
			driver.findElement(txtInsuredPassengerPhone).sendKeys(insuredPassengerPhone);
		}
		
		public void setTxtInsuredPassengerEmail(String insuredPassengerEmail) {
			driver.findElement(txtInsuredPassengerEmail).sendKeys(insuredPassengerEmail);
		}
		
	    public void clickBtnInsuredPassengerSubmit() {
	    	driver.findElement(btnInsuredPassengerSubmit).click();
	    }
	    
	    public void clickBtnInjuryDataSaveClose() {
	    	driver.findElement(btnInjuryDataSaveClose).click();
	    }
	

}
