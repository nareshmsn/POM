package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadsPopupPage extends LeafTapsWrappers  {
	
	public static String LeadId="";

	public FindLeadsPopupPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Find Leads")){
			reportStep("This is not Find Leads Pop-up Page", "FAIL");
		}
	}
	
	public FindLeadsPopupPage enterFirstName(String FirstName){
		enterByName(prop.getProperty("FindLeadsPopUp.FirstName.Name"), FirstName);
		return this;
	}	
	
	public FindLeadsPopupPage clickFindLeadsBtn(){
		clickByXpath(prop.getProperty("FindLeadsPopup.FindLeadsBtn.Xpath"));
		return this;
	}
	
	public MergeLeadsPage clickFirstLead(){
		LeadId=getTextByXpath(prop.getProperty("FindLeadsPopup.FirstLead.Xpath"));
		System.out.println("Lead ID: "+ LeadId);
		clickByXpathNoSnap(prop.getProperty("FindLeadsPopup.FirstLead.Xpath"));
		switchToParentWindow();
		return new MergeLeadsPage(driver, test);
	}
	
	public MergeLeadsPage clickSecondLead(){
		clickByXpathNoSnap(prop.getProperty("FindLeadsPopup.SecondLead.Xpath"));
		switchToParentWindow();
		return new MergeLeadsPage(driver, test);
	}
	
	
}
