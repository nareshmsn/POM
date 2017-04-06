package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadsPage extends LeafTapsWrappers  {

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not Find Leads Page", "FAIL");
		}
	}
	
	public FindLeadsPage clickFindLeads(String data){
		enterByXpath("FindLeads.FirstName.Xpath", data);
		return this;
	}
	
	public FindLeadsPage ClickFindLeadsButton(){
		clickByXpath("FindLeads.FindLeadsButton.Xpath");
		return this;
	}
	
	public ViewLeadPage clickFirstLead(){
		clickByLink(prop.getProperty("FindLeads.FirstLead.Link"));
		return new ViewLeadPage(driver, test);
	}
	
}
