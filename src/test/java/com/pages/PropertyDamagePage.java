package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PropertyDamagePage {
	WebDriver driver = null;
	WebElement element = null;
	
	public PropertyDamagePage (WebDriver driver) {
		this.driver = driver;
	}	
	
	// Store Property Info Locators.
	By btnAddPropertyInfo = By.xpath("//*[@id=\"btnAdd\"]");
	
	// Store Claimant Vehicle Owner Locators.
	By linkPropertyTypeVehicle = By.xpath("/html/body/div[2]/div[2]/div[5]/div/div/div[1]/div[2]/div/div/div/div[1]/div/div/div[2]/form/div[1]/div[1]/div/div/a[2]");
	By btnPropertyDamageSubmit = By.xpath("//*[@id=\"btnPostData\"]");
	By txtClaimantVehicleOwnerFirstName= By.xpath("//*[@id=\"OwnersFirstName\"]");
	By txtClaimantVehicleOwnerLastName = By.xpath("//*[@id=\"OwnersLastName\"]");
	By txtClaimantVehicleOwnerStreetNo = By.xpath("//*[@id=\"OwnerAddress_StreetNumber\"]");
	By txtClaimantVehicleOwnerStreetName = By.xpath("//*[@id=\"OwnerAddress_StreetName\"]");
	By txtClaimantVehicleOwnerCity = By.xpath("//*[@id=\"OwnerAddress_City\"]");
	By selClaimantVehicleOwnerState = By.xpath("//*[@id=\"OwnerAddress_State\"]");
	By txtClaimantVehicleOwnerZipCode = By.xpath("//*[@id=\"OwnerAddress_ZipCode\"]");
	By txtClaimantVehicleOwnerAltPhone = By.xpath("//*[@id=\"OwnerWorkPhone\"]");
	By txtClaimantVehicleOwnerCellPhone = By.xpath("//*[@id=\"OwnerHomePhone\"]");
	By txtClaimantVehicleOwnerEmail = By.xpath("//*[@id=\"OwnerEmailId\"]");
	By btnPropertyDamageSaveClose = By.xpath("/html/body/div[5]/div/div/div[3]/div/div/button");
	By btnPropertyDamageNext = By.xpath("/html/body/div[2]/div[2]/div[5]/div/div/div[1]/div[2]/div/div/ul/li[2]/a");
	
	public void clickBtnAddPropertyInfo( ) {
		driver.findElement(btnAddPropertyInfo).click();
	}
	public By getlinkPropertyTypeVehicle() {
		return linkPropertyTypeVehicle;
	}
	
	public void clickLinkPropertyTypeVehicle() {
		driver.findElement(linkPropertyTypeVehicle).click();
	}
		
	// Clear Claimant Vehicle Owner fields.
		public void clearClaimantVehicleOwnerFields() {
			
			driver.findElement(txtClaimantVehicleOwnerFirstName).clear();
			driver.findElement(txtClaimantVehicleOwnerLastName).clear();
			driver.findElement(txtClaimantVehicleOwnerStreetNo).clear();
			driver.findElement(txtClaimantVehicleOwnerStreetName).clear();
			driver.findElement(txtClaimantVehicleOwnerCity).clear();
			driver.findElement(selClaimantVehicleOwnerState).clear();
			driver.findElement(txtClaimantVehicleOwnerZipCode).clear();
			driver.findElement(txtClaimantVehicleOwnerAltPhone).clear();
			driver.findElement(txtClaimantVehicleOwnerCellPhone).clear();
			driver.findElement(txtClaimantVehicleOwnerEmail).clear();
										
		}			
		
		// Set values in Claimant Vehicle Owner fields.
		
		public void setTxtClaimantVehicleOwnerFirstName(String claimantVehicleOwnerFirstName) {
			driver.findElement(txtClaimantVehicleOwnerFirstName).sendKeys(claimantVehicleOwnerFirstName);
		}

		public void setTxtClaimantVehicleOwnerLastName(String claimantVehicleOwnerLastName) {
			driver.findElement(txtClaimantVehicleOwnerLastName).sendKeys(claimantVehicleOwnerLastName);
		}
		
		public void setTxtClaimantVehicleOwnerStreetNo(String claimantVehicleOwnerStreetNo) {
			driver.findElement(txtClaimantVehicleOwnerStreetNo).sendKeys(claimantVehicleOwnerStreetNo);
		}
		public void setTxtClaimantVehicleOwnerStreetName(String claimantVehicleOwnerStreetName) {
			driver.findElement(txtClaimantVehicleOwnerStreetName).sendKeys(claimantVehicleOwnerStreetName);
		}
		public void setTxtClaimantVehicleOwnerCity(String claimantVehicleOwnerCity) {
			driver.findElement(txtClaimantVehicleOwnerCity).sendKeys(claimantVehicleOwnerCity);
		}
		
		public void setSelClaimantVehicleOwnerState(String claimantVehicleOwnerState) {
			Select states = new Select(driver.findElement(selClaimantVehicleOwnerState));
			states.selectByValue(claimantVehicleOwnerState);
		}
		
		public void setTxtClaimantVehicleOwnerZipCode(String claimantVehicleOwnerZipCode) {
			driver.findElement(txtClaimantVehicleOwnerZipCode).sendKeys(claimantVehicleOwnerZipCode);
		}

		public void setTxtClaimantVehicleOwnerAltPhone(String claimantVehicleOwnerAltPhone) {
			driver.findElement(txtClaimantVehicleOwnerAltPhone).sendKeys(claimantVehicleOwnerAltPhone);
		}

		public void setTxtClaimantVehicleOwnerCellPhone(String claimantVehicleOwnerCellPhone) {
			driver.findElement(txtClaimantVehicleOwnerCellPhone).sendKeys(claimantVehicleOwnerCellPhone);
		}	
		
		public void setTxtClaimantVehicleOwnerEmail(String claimantVehicleOwnerEmail) {
			driver.findElement(txtClaimantVehicleOwnerEmail).sendKeys(claimantVehicleOwnerEmail);
		}
		
	// Store Claimant Vehicle info Locators.
	
	By txtClaimantVehicleYear= By.xpath("//*[@id=\"Year\"]");
	By txtClaimantVehicleMake= By.xpath("//*[@id=\"Make\"]");
	By txtClaimantVehicleModel = By.xpath("//*[@id=\"Model\"]"); 
	By selClaimantVehicleColor = By.xpath("//*[@id=\"ColorValue\"]");
	By txtClaimantVehicleTag = By.xpath("//*[@id=\"Tag\"]");
		
     public void clearClaimantVehicleFields() {
		
		driver.findElement(txtClaimantVehicleYear).clear();
		driver.findElement(txtClaimantVehicleMake).clear();
		driver.findElement(txtClaimantVehicleModel).clear();
		driver.findElement(selClaimantVehicleColor).clear();
		driver.findElement(txtClaimantVehicleTag).clear();
							
	}
     
     // Set values in Claimant Vehicle info fields.
     
		public void setTxtClaimantVehicleYear(String claimantVehicleYear) {
			driver.findElement(txtClaimantVehicleYear).sendKeys(claimantVehicleYear);
		}

		public void setTxtClaimantVehicleMake(String claimantVehicleMake) {
			driver.findElement(txtClaimantVehicleMake).sendKeys(claimantVehicleMake);
		}

		public void setTxtClaimantVehicleModel(String claimantVehicleModel) {
			driver.findElement(txtClaimantVehicleModel).sendKeys(claimantVehicleModel);
		}	
				
		public void setSelClaimantVehicleColor(String claimantVehicleColor) {
			Select colors = new Select(driver.findElement(selClaimantVehicleColor));
			colors.selectByValue(claimantVehicleColor);
		}
		
		public void setTxtClaimantVehicleTag(String claimantVehicleTag) {
			driver.findElement(txtClaimantVehicleTag).sendKeys(claimantVehicleTag);
		}
				
		
	// Store Claimant Driver locators.
	
	By txtClaimantDriverFirstName = By.xpath("//*[@id=\"ClaimantDriverFirstName\"]");
	By txtClaimantDriverLastName = By.xpath("//*[@id=\"ClaimantDriverLastName\"]");
	By txtClaimantDriverStreetNo = By.xpath("//*[@id=\"ClaimantDriverAddress_StreetNumber\"]"); 
	By txtClaimantDriverStreetName = By.xpath("//*[@id=\"ClaimantDriverAddress_StreetName\"]");
	By txtClaimantDriverCity = By.xpath("//*[@id=\"ClaimantDriverAddress_City\"]");
	By selClaimantDriverState = By.xpath("//*[@id=\"ClaimantDriverAddress_State\"]");
	By txtClaimantDriverZipCode = By.xpath("//*[@id=\"ClaimantDriverAddress_ZipCode\"]");
	By txtClaimantDriverAltPhone = By.xpath("//*[@id=\"ClaimantDriverWorkPhone\"]");
	By txtClaimantDriverCellPhone = By.xpath("//*[@id=\"ClaimantDriverHomePhone\"]");
	By txtClaimantDriverEmail = By.xpath("//*[@id=\"ClaimantDriverEmailId\"]");
	
			
    public void clearClaimantDriverFields() {
		
		driver.findElement(txtClaimantDriverFirstName).clear();
		driver.findElement(txtClaimantDriverLastName).clear();
		driver.findElement(txtClaimantDriverStreetNo).clear();
		driver.findElement(txtClaimantDriverStreetName).clear();
		driver.findElement(txtClaimantDriverCity).clear();
		driver.findElement(txtClaimantDriverZipCode).clear();
		driver.findElement(selClaimantDriverState).clear();
		driver.findElement(txtClaimantDriverAltPhone).clear();
		driver.findElement(txtClaimantDriverCellPhone).clear();
		driver.findElement(txtClaimantDriverEmail).clear();		
				
	}	
    
    // Set values in Claimant Vehicle Driver fields.
    
	public void setTxtClaimantDriverFirstName(String claimantDriverFirstName) {
		driver.findElement(txtClaimantDriverFirstName).sendKeys(claimantDriverFirstName);
	}

	public void setTxtClaimantDriverLastName(String claimantDriverLastName) {
		driver.findElement(txtClaimantDriverLastName).sendKeys(claimantDriverLastName);
	}

	public void setTxtClaimantDriverStreetNo(String claimantDriverStreetNo) {
		driver.findElement(txtClaimantDriverStreetNo).sendKeys(claimantDriverStreetNo);
	}	
	
	public void setTxtClaimantDriverStreetName(String claimantDriverStreetName) {
		driver.findElement(txtClaimantDriverStreetName).sendKeys(claimantDriverStreetName);
	}
	
	public void setTxtClaimantDriverCity(String claimantDriverCity) {
		driver.findElement(txtClaimantDriverCity).sendKeys(claimantDriverCity);
	}
	
	public void setSelClaimantDriverState(String claimantDriverState) {
		Select states = new Select(driver.findElement(selClaimantDriverState));
		states.selectByValue(claimantDriverState);
	}
	
	public void setTxtClaimantDriverZipCode(String claimantDriverZipCode) {
		driver.findElement(txtClaimantDriverZipCode).sendKeys(claimantDriverZipCode);
	}
	
	public void setTxtClaimantDriverAltPhone(String claimantDriverAltPhone) {
		driver.findElement(txtClaimantDriverAltPhone).sendKeys(claimantDriverAltPhone);
	}
	
	public void setTxtClaimantDriverCellPhone(String claimantDriverCellPhone) {
		driver.findElement(txtClaimantDriverCellPhone).sendKeys(claimantDriverCellPhone);
	}
	
	public void setTxtClaimantDriverEmail(String claimantDriverEmail) {
		driver.findElement(txtClaimantDriverEmail).sendKeys(claimantDriverEmail);
	}
	
	public void clickBtnPropertyDamageSubmit() {
		driver.findElement(btnPropertyDamageSubmit).click();
	}
	
	public void clickBtnPropertyDamageSaveClose() {
		driver.findElement(btnPropertyDamageSaveClose).click();
	}
	
	// Store Claimant Passenger locators.
	
	By btnAddInjuredParty = By.xpath("//*[@id=\"btnAddInjurydmgimg\"]");
	By selClaimantPassengerProperty = By.className("propertyId");
	By txtClaimantPassengerFirstName = By.xpath("//*[@id=\"FirstName\"]");
	By txtClaimantPassengerLastName = By.xpath("//*[@id=\"LastName\"]");
	By txtClaimantPassengerStreetNo = By.xpath("//*[@id=\"Address_StreetNumber\"]");
	By txtClaimantPassengerStreetName = By.xpath("//*[@id=\"Address_StreetName\"]");
	By txtClaimantPassengerCity = By.xpath("//*[@id=\"Address_City\"]");
	By selClaimantPassengerState = By.xpath("//*[@id=\"Address_State\"]");
	By txtClaimantPassengerZipCode = By.xpath("//*[@id=\"Address_ZipCode\"]");
	By txtClaimantPassengerPhone = By.xpath("//*[@id=\"ContactTelephone\"]");
	By txtClaimantPassengerEmail = By.xpath("//*[@id=\"EmailId\"]");
	By btnClaimantPassengerSubmit = By.xpath("//*[@id=\"btnSubmitInjurydmgins\"]");
	By btnInjuryDataSaveClose = By.xpath("/html/body/div[5]/div/div/div[3]/div/div/button");
	
	   
	// Add New Claimant Passenger.
	public void clickBtnAddInjuredParty() {
		driver.findElement(btnAddInjuredParty).click();
	}
	
	// Set values in Insured Passenger fields.
	
        public By getSelClaimantPassengerProperty() {
        	return selClaimantPassengerProperty;
        }
        
        public void setSelClaimantPassengerProperty(int index) {
			Select properties = new Select(driver.findElement(selClaimantPassengerProperty));
			//vehicles.selectByValue(claimantPassengerProperty);
			properties.selectByIndex(index);
		}
        
		public void setTxtClaimantPassengerFirstName(String claimantPassengerFirstName) {
			driver.findElement(txtClaimantPassengerFirstName).sendKeys(claimantPassengerFirstName);
		}

		public void setTxtClaimantPassengerLastName(String claimantPassengerLastName) {
			driver.findElement(txtClaimantPassengerLastName).sendKeys(claimantPassengerLastName);
		}

		public void setTxtClaimantPassengerStreetNo(String claimantPassengerStreetNo) {
			driver.findElement(txtClaimantPassengerStreetNo).sendKeys(claimantPassengerStreetNo);
		}	
		
		public void setTxtClaimantPassengerStreetName(String claimantPassengerStreetName) {
			driver.findElement(txtClaimantPassengerStreetName).sendKeys(claimantPassengerStreetName);
		}
		
		public void setTxtClaimantPassengerCity(String claimantPassengerCity) {
			driver.findElement(txtClaimantPassengerCity).sendKeys(claimantPassengerCity);
		}
		
		public void setSelClaimantPassengerState(String claimantPassengerState) {
			Select states = new Select(driver.findElement(selClaimantPassengerState));
			states.selectByValue(claimantPassengerState);
		}
		
		public void setTxtClaimantPassengerZipCode(String claimantPassengerZipCode) {
			driver.findElement(txtClaimantPassengerZipCode).sendKeys(claimantPassengerZipCode);
		}
		
		public void setTxtClaimantPassengerPhone(String claimantPassengerPhone) {
			driver.findElement(txtClaimantPassengerPhone).sendKeys(claimantPassengerPhone);
		}
		
		public void setTxtClaimantPassengerEmail(String claimantPassengerEmail) {
			driver.findElement(txtClaimantPassengerEmail).sendKeys(claimantPassengerEmail);
		}
		
	    public void clickBtnClaimantPassengerSubmit() {
	    	driver.findElement(btnClaimantPassengerSubmit).click();
	    }
	    
	    public void clickBtnInjuryDataSaveClose() {
	    	driver.findElement(btnInjuryDataSaveClose).click();
	    }
	    
	    public void clickBtnPropertyDamageNext() {
	    	driver.findElement(btnPropertyDamageNext).click();
	    }
	

}
