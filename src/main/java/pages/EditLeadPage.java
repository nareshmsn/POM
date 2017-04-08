package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers  {
	
	//public static String CompanyName = "";

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not Edit Lead Page", "FAIL");
		}
	}


	public EditLeadPage editLastName(String LastName){
		enterById(prop.getProperty("EditLead.LastName.Id"), LastName);
		return this;
	}

	public ViewLeadPage clickUpdateButton(){
		clickByXpath(prop.getProperty("EditLead.UpdateButton.Xpath"));
		return new ViewLeadPage(driver, test);
	}
	
	/*public ViewLeadPage verifyCompanyName(String CompName){
		verifyTextContainsById("ViewLead.verifyverifyCompanyName.Id", CompName);
		return new ViewLeadPage(driver, test);
	}*/
	

}
