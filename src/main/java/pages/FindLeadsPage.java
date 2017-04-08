package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadsPage extends LeafTapsWrappers  {
	
	public static String FirstNameOfFirstLead="";
	public static String LeadIdOfFirstLead="";
	
	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not Find Leads Page", "FAIL");
		}
	}
	
	public FindLeadsPage enterFirstName(String firstName){
		enterByXpath(prop.getProperty("FindLeads.FirstName.Xpath"), firstName);
		return this;
	}
	
	public FindLeadsPage clickEmailTab(){
		clickByXpath(prop.getProperty("FindLeads.EmailTab.Xpath"));
		return this;
	}
	
	public FindLeadsPage clickPhoneTab(){
		clickByXpath(prop.getProperty("FindLeads.PhoneTab.Xpath"));
		return this;
	}
	
	public FindLeadsPage enterPhoneNumber(String phoneNumber){
		enterByName(prop.getProperty("FindLeads.PhoneNumberTextBox.Name"), phoneNumber);
		return this;
	}
	
	public FindLeadsPage enterEmailAddress(String emailAddress){
		enterByName(prop.getProperty("FindLeads.EmailTextBox.Name"), emailAddress);
		return this;
	}
	
	public FindLeadsPage enterLeadId(String LeadId){
		enterByName(prop.getProperty("FindLeads.LeadId.Name"), LeadId);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButton(){
		clickByXpath(prop.getProperty("FindLeads.FindLeadsButton.Xpath"));
		return this;
	}
	
	public FindLeadsPage verifyNoRecordsFoundMsg(){
		clickByXpath(prop.getProperty("FindLeads.NoRecordsMsg.Xpath"));
		return this;
	}
	
	public ViewLeadPage clickFirstLead(){
		LeadIdOfFirstLead=getTextByXpath(prop.getProperty("FindLeads.FirstLead.Xpath"));
		clickByXpath(prop.getProperty("FindLeads.FirstLead.Xpath"));
		return new ViewLeadPage(driver, test);
	}
	
	public ViewLeadPage clickFirstNameOfFirstLead() throws InterruptedException{
		Thread.sleep(3000);
		FirstNameOfFirstLead = getTextByXpath(prop.getProperty("FindLeads.FirstNameOfFirstLead.Xpath"));
		clickByXpath(prop.getProperty("FindLeads.FirstNameOfFirstLead.Xpath"));
		return new ViewLeadPage(driver, test);
	}
	
}
