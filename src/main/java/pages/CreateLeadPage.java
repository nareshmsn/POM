package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers  {

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Create Lead Page", "FAIL");
		}
	}
	
	public CreateLeadPage enterCompanyName(String compName){
		enterById(prop.getProperty("CreateLead.CompanyName.Id"), compName);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String firstName){
		enterById(prop.getProperty("CreateLead.FirstName.Id"), firstName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lastName){
		enterById(prop.getProperty("CreateLead.LastName.Id"), lastName);
		return this;
	}
	
	public CreateLeadPage selectSource(String source){
		selectVisibileTextById(prop.getProperty("CreateLead.Source.Id"), source);
		return this;
	}
	
	public CreateLeadPage selectMarketingCampaign(String MarketCampaign){
		selectVisibileTextById(prop.getProperty("CreateLead.MarketingCampaign.Id"), MarketCampaign);
		return this;
	}
	
	public CreateLeadPage enterAnnualRevenue(String Annualrevenue){
		enterById(prop.getProperty("CreateLead.AnnualRevenue.Id"), Annualrevenue);
		return this;
	}
	
	public CreateLeadPage selectCurrency(String Currency){
		selectVisibileTextById(prop.getProperty("CreateLead.Currency.Id"), Currency);
		return this;
	}
	
	public CreateLeadPage enterPhoneNumber(String Phone){
		enterById(prop.getProperty("CreateLead.PhoneNumber.Id"), Phone);
		return this;
	}
	
	public CreateLeadPage enterEmailAddress(String email){
		enterById(prop.getProperty("CreateLead.EmailAddress.Id"), email);
		return this;
	}
	
	
	public ViewLeadPage clickCreateLead(){
		clickByClassName(prop.getProperty("CreateLead.CreateLead.Class"));
		return new ViewLeadPage(driver, test);
	}

}
