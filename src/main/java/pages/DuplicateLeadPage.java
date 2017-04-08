package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DuplicateLeadPage extends LeafTapsWrappers  {
	
	//public static String CompanyName = "";

	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Duplicate Lead | opentaps CRM")){
			reportStep("This is not Delete Lead Page", "FAIL");
		}
	}


	public ViewLeadPage clickCreateLeadButton(){
		clickByXpath(prop.getProperty("DuplicateLead.CreateLead.Xpath"));
		return new ViewLeadPage(driver, test);
	}	

}
