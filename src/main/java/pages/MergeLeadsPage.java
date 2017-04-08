package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadsPage extends LeafTapsWrappers  {

	public MergeLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Merge Leads Page", "FAIL");
		}
	}
	
	public FindLeadsPopupPage clickFromLeadIcon(){
		clickByXpathNoSnap(prop.getProperty("MergeLead.FromLead.Xpath"));
		switchToLastWindow();
		return new FindLeadsPopupPage(driver, test);
	}
	
	public FindLeadsPopupPage clickToLeadIcon(){
		clickByXpathNoSnap(prop.getProperty("MergeLead.ToLead.Xpath"));
		switchToLastWindow();
		return new FindLeadsPopupPage(driver, test);
	}
	
	public ViewLeadPage clickMergeButton(){
		clickByLinkNoSnap(prop.getProperty("MergeLead.MergeButton.Link"));
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}
	
	public ViewLeadPage clickFirstLead(){
		clickByXpath(prop.getProperty("FindLeads.FirstLead.Xpath"));
		return new ViewLeadPage(driver, test);
	}
	
}
