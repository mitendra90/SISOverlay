import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.*;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		
		// Test on Firefox/Chrome browser.
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		// Create explicit wait object with 120 seconds.
		WebDriverWait wait = new WebDriverWait(driver,120);
		
		//Open Url
		driver.get("https://ihservicesqua.insurancehouse.com/ClaimsInsight/Login");
		

		// Login the application.
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername("vchambers");
		loginPage.setPassword("abc");
		loginPage.clickLogin();

		// Click on Claims Adjuster link and Fnol on Dashboard page.
		DashboardPage dashboardPage = new DashboardPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.getLinkClaimsAdjusterInsight()));
		driver.manage().window().maximize();
		dashboardPage.clickClaimsAdjusterInsight();
		dashboardPage.clickFnol();
		
		// Click on Add New Claim link on FNOL Dashboard page.
		FnolDashboardPage fnolDashboardPage = new FnolDashboardPage(driver);
		fnolDashboardPage.clickAddNewClaim();
		
		// Search policy and Start New claim against it.
		SearchPolicyPage searchPolicyPage = new SearchPolicyPage(driver);
		searchPolicyPage.setLastName("BAAB");
		searchPolicyPage.clickFind();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		searchPolicyPage.clickLoadDetails();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(searchPolicyPage.getButtonStartNewClaim()));
		searchPolicyPage.clickStartNewClaim();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Fill details of Insured
		PrimaryDetailsPage primaryDetailsPage = new PrimaryDetailsPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(primaryDetailsPage.getInsuredFirstName()));
		primaryDetailsPage.clearInsuredFields();
		primaryDetailsPage.setTxtInsuredFirstName("Insured");
		primaryDetailsPage.setTxtInsuredLastName("Test");
		primaryDetailsPage.setTxtInsuredStreetNo("Insured Street Number");	
		primaryDetailsPage.setTxtInsuredStreetName("Insured Street Name");
		primaryDetailsPage.setTxtInsuredCity("Insured City");
		primaryDetailsPage.setTxtInsuredState("GA");
		primaryDetailsPage.setTxtInsuredZipCode("11111");
		primaryDetailsPage.setTxtInsuredAltPhone("1111111111");
		primaryDetailsPage.setTxtInsuredCellPhone("2222222222");
		primaryDetailsPage.setTxtInsuredEmail("test@insured.com");
		primaryDetailsPage.setTxtInsuredReportCo("Report Co.");
		primaryDetailsPage.setTxtInsuredCellPhone2("3333333333");
		primaryDetailsPage.clickBtnInsuredNext();
		
		// Fill details of Loss location.
		LossLocationPage lossLocationPage = new LossLocationPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(lossLocationPage.getLossLocationStreetNo()));
		lossLocationPage.clearLossLocationFields();
		lossLocationPage.setTxtLossLocationStreetNo("LL Street No");
		lossLocationPage.setTxtLossLocationStreetName("LL Street Name");
		lossLocationPage.setTxtLossLocationCity("LL City");
		lossLocationPage.setSelLossLocationState("GA");
		lossLocationPage.setTxtLossLocationZipCode("22222");
		lossLocationPage.setTxtLossLocationPoliceDepartmentName("LL Police Dept");
		lossLocationPage.setSelLossLocationAccidentCode("315");
		lossLocationPage.clickBtnlossLocationNext();
		
		// Fill details of Insured Vehicle Info.
				InsuredVehiclePage insuredVehiclePage = new InsuredVehiclePage(driver);
				wait.until(ExpectedConditions.elementToBeClickable(insuredVehiclePage.getSelInsuredVehicle()));
				insuredVehiclePage.clearInusredVehicleFields();
				insuredVehiclePage.setSelInsuredVehicle("0");
				insuredVehiclePage.setTxtInsuredVehicleYear("2001");
				insuredVehiclePage.setTxtInsuredVehicleMake("Honda");
				insuredVehiclePage.setTxtInsuredVehicleModel("City");
				insuredVehiclePage.setSelInsuredVehicleColor("1");
				insuredVehiclePage.setTxtInsuredVehicleTagNo("Tag 1");

				// Fill details of Insured Vehicle Owner Info.
				insuredVehiclePage.setTxtInsuredVehicleOwnerFirstName("Vehicle Owner");
				insuredVehiclePage.setTxtInsuredVehicleOwnerLastName("Insured");
				insuredVehiclePage.setTxtInsuredVehicleOwnerStreetNo("IVO Street No");
				insuredVehiclePage.setTxtInsuredVehicleOwnerStreetName("IVO Street Name");
				insuredVehiclePage.setTxtInsuredVehicleOwnerCity("IVO City");
				insuredVehiclePage.setSelInsuredVehicleOwnerState("GA");
				insuredVehiclePage.setTxtInsuredVehicleOwnerZipCode("33333");
				insuredVehiclePage.setTxtInsuredVehicleOwnerAltPhone("4444444444");
				insuredVehiclePage.setTxtInsuredVehicleOwnerCellPhone("5555555555");
				insuredVehiclePage.setTxtInsuredVehicleOwnerAltPhone("6666666666");
				insuredVehiclePage.setTxtInsuredVehicleOwnerEmail("vehicleowner@insured.com");
				
				// Fill details of Insured Driver info.
				insuredVehiclePage.setTxtInsuredDriverFirstName("Driver");
				insuredVehiclePage.setTxtInsuredDriverLastName("Insured");
				insuredVehiclePage.setTxtInsuredDriverStreetNo("ID Street No");
				insuredVehiclePage.setTxtInsuredDriverStreetName("ID Street Name");
				insuredVehiclePage.setTxtInsuredDriverCity("ID City");
				insuredVehiclePage.setSelInsuredDriverState("GA");
				insuredVehiclePage.setTxtInsuredDriverZipCode("44444");
				insuredVehiclePage.setTxtInsuredDriverAltPhone("7777777777");
				insuredVehiclePage.setTxtInsuredDriverCellPhone("8888888888");
				insuredVehiclePage.setTxtInsuredDriverEmail("driver@insured.com");
				
				// Fill Insured Passenger info.
				insuredVehiclePage.clickBtnAddInjuredParty();
				wait.until(ExpectedConditions.elementToBeClickable(insuredVehiclePage.getTxtInsuredPassengerFirstName()));
				insuredVehiclePage.setTxtInsuredPassengerFirstName("Passenger");
				insuredVehiclePage.setTxtInsuredPassengerLastName("Insured");
				insuredVehiclePage.setTxtInsuredPassengerStreetNo("IP Street No");
				insuredVehiclePage.setTxtInsuredPassengerStreetName("IP Street Name");
				insuredVehiclePage.setTxtInsuredPassengerCity("IP City");
				insuredVehiclePage.setSelInsuredPassengerState("GA");
				insuredVehiclePage.setTxtInsuredPassengerZipCode("55555");
				insuredVehiclePage.setTxtInsuredPassengerPhone("9999999999");
				insuredVehiclePage.setTxtInsuredPassengerEmail("passenger@insured.com");
				insuredVehiclePage.clickBtnInsuredPassengerSubmit();
				insuredVehiclePage.clickBtnInjuryDataSaveClose();
				
				// Click on Next button.
				wait.until(ExpectedConditions.elementToBeClickable(insuredVehiclePage.getBtnInsuredVehicleNext()));
				insuredVehiclePage.clickBtnInsuredVehicleNext();

				// Fill details in Claimant vehicle owner.
				PropertyDamagePage propertyDamagePage = new PropertyDamagePage(driver);
				propertyDamagePage.clickBtnAddPropertyInfo();
				wait.until(ExpectedConditions.elementToBeClickable(propertyDamagePage.getlinkPropertyTypeVehicle()));
				propertyDamagePage.clickLinkPropertyTypeVehicle();
				propertyDamagePage.setTxtClaimantVehicleOwnerFirstName("Vehicle Owner");
				propertyDamagePage.setTxtClaimantVehicleOwnerLastName("Claimant");
				propertyDamagePage.setTxtClaimantVehicleOwnerStreetNo("CVO Street No");
				propertyDamagePage.setTxtClaimantVehicleOwnerStreetName("CVo Street Name");
				propertyDamagePage.setTxtClaimantVehicleOwnerCity("CVO City");
				propertyDamagePage.setSelClaimantVehicleOwnerState("GA");
				propertyDamagePage.setTxtClaimantVehicleOwnerZipCode("66666");
				propertyDamagePage.setTxtClaimantVehicleOwnerAltPhone("1010101010");
				propertyDamagePage.setTxtClaimantVehicleOwnerCellPhone("1111111111");
				propertyDamagePage.setTxtClaimantVehicleOwnerEmail("vehicleowner@claimant.com");
				
				// Fill details in Claimant Vehicle info.
				propertyDamagePage.setTxtClaimantVehicleYear("2002");
				propertyDamagePage.setTxtClaimantVehicleMake("Honda");
				propertyDamagePage.setTxtClaimantVehicleModel("Jazz");
				propertyDamagePage.setSelClaimantVehicleColor("8");
				propertyDamagePage.setTxtClaimantVehicleTag("Tag 2");
				
				// Fill details in Claimant Driver info.
				
				propertyDamagePage.setTxtClaimantDriverFirstName("Driver");
				propertyDamagePage.setTxtClaimantDriverLastName("Claimant");
				propertyDamagePage.setTxtClaimantDriverStreetNo("CD Street No");
				propertyDamagePage.setTxtClaimantDriverStreetName("CD Street Name");
				propertyDamagePage.setTxtClaimantDriverCity("CD City");
				propertyDamagePage.setSelClaimantDriverState("GA");
				propertyDamagePage.setTxtClaimantDriverZipCode("77777");
				propertyDamagePage.setTxtClaimantDriverAltPhone("1212121212");
				propertyDamagePage.setTxtClaimantDriverCellPhone("1313131313");
				propertyDamagePage.setTxtClaimantDriverEmail("driver@claimant.com");
				propertyDamagePage.clickBtnPropertyDamageSubmit();
				propertyDamagePage.clickBtnPropertyDamageSaveClose();
			
				// Fill details in Claimant Passenger.
				propertyDamagePage.clickBtnAddInjuredParty();				
				wait.until(ExpectedConditions.elementToBeClickable(propertyDamagePage.getSelClaimantPassengerProperty()));
				propertyDamagePage.setSelClaimantPassengerProperty(1);
				propertyDamagePage.setTxtClaimantPassengerFirstName("Passenger");
				propertyDamagePage.setTxtClaimantPassengerLastName("Claimant");
				propertyDamagePage.setTxtClaimantPassengerStreetNo("CP Strt No");
				propertyDamagePage.setTxtClaimantPassengerStreetName("CP Street Name");
				propertyDamagePage.setTxtClaimantPassengerCity("CP City");
				propertyDamagePage.setSelClaimantPassengerState("GA");
				propertyDamagePage.setTxtClaimantPassengerZipCode("88888");
				propertyDamagePage.setTxtClaimantPassengerPhone("1414141414");
				propertyDamagePage.setTxtClaimantPassengerEmail("passenger@claimant.com");
				propertyDamagePage.clickBtnClaimantPassengerSubmit();
				propertyDamagePage.clickBtnInjuryDataSaveClose();
				propertyDamagePage.clickBtnPropertyDamageNext();
				
				// Fill details for Pedestrian.
				PedestrianPage pedestrianPage = new PedestrianPage(driver);
				pedestrianPage.clickBtnAddInjuredParty();				
				wait.until(ExpectedConditions.elementToBeClickable(pedestrianPage.getTxtPedestrianFirstName()));
				pedestrianPage.setTxtPedestrianFirstName("Pedestrian");
				pedestrianPage.setTxtPedestrianLastName("Test");
				pedestrianPage.setTxtPedestrianStreetNo("Pd Strt No");
				pedestrianPage.setTxtPedestrianStreetName("Pd Street Name");
				pedestrianPage.setTxtPedestrianCity("Pd City");
				pedestrianPage.setSelPedestrianState("GA");
				pedestrianPage.setTxtPedestrianZipCode("99999");
				pedestrianPage.setTxtPedestrianPhone("1515151515");
				pedestrianPage.setTxtPedestrianEmail("test@pedestrian.com");
				pedestrianPage.clickBtnPedestrianSubmit();
				pedestrianPage.clickBtnPedestrianDataSaveClose();
				pedestrianPage.clickBtnPedestrianNext();

				// Fill details of Witness.
				
				// Fill details for Pedestrian.
                WitnessPage witnessPage = new WitnessPage(driver);
                witnessPage.clickBtnAddWitness();				
				wait.until(ExpectedConditions.elementToBeClickable(witnessPage.getTxtWitnessFirstName()));
				witnessPage.setTxtWitnessFirstName("Witness");
				witnessPage.setTxtWitnessLastName("Test");
				witnessPage.setTxtWitnessStreetNo("W Strt No");
				witnessPage.setTxtWitnessStreetName("W Street Name");
				witnessPage.setTxtWitnessCity("W City");
				witnessPage.setSelWitnessState("GA");
				witnessPage.setTxtWitnessZipCode("10101");
				witnessPage.setTxtWitnessPhone("1616161616");
				witnessPage.setTxtWitnessEmail("test@witness.com");
				witnessPage.clickBtnWitnessSubmit();
				witnessPage.clickBtnWitnessDataSaveClose();
				witnessPage.clickBtnWitnessNext();
				
				// Select Adjuster and click accept to submit the claim.
				
				FnolFinalPage fnolFinalPage = new FnolFinalPage(driver);
				wait.until(ExpectedConditions.elementToBeClickable(fnolFinalPage.getSelAdjuster()));
				fnolFinalPage.setSelAdjuster("LW1");
				fnolFinalPage.clickBtnAccept();
				wait.until(ExpectedConditions.elementToBeClickable(fnolFinalPage.getBtnDialogClose()));
				String claimNumber = fnolFinalPage.getClaimNumberValue();
				System.out.println(claimNumber);
				fnolFinalPage.clickBtnDialogClose();
		
	}
}
