package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers  {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not Edit Lead Page", "FAIL");
		}
	}


	public EditLeadPage clickFindLead(String data){
		enterById("EditLead.AnnualRevenue.Id", data);
		return this;
	}

	public ViewLeadPage clickUpdateButton(){
		clickByXpath("EditLead.UpdateButton.Xpath");
		return new ViewLeadPage(driver, test);


	}

}
