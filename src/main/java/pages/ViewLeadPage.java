package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers  {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Lead Page", "FAIL");
		}
	}

	public ViewLeadPage verifyFirstName(String FirstName){
		verifyTextById(prop.getProperty("ViewLead.FirstName.Id"), FirstName);
		return this;
	}
	
	public ViewLeadPage verifyFirstNameOfFirstLead(String FirstNameOfFirstLead){
		verifyTextById(prop.getProperty("ViewLead.FirstName.Id"), FindLeadsPage.FirstNameOfFirstLead);
		return this;
	}

	public ViewLeadPage verifyLastName(String LastName){		
		verifyTextById(prop.getProperty("ViewLead.verifyLastName.Id"), LastName);
		return this;
	}	
	
	public DuplicateLeadPage clickDuplicateLeadBtn(){
		clickByLink(prop.getProperty("ViewLead.DuplicateLead.Link"));
		return new DuplicateLeadPage(driver, test);
	}

	
	public EditLeadPage clickEditButton(){
		clickByLink(prop.getProperty("ViewLead.EditButton.Link"));
		return new EditLeadPage(driver, test);
	}
	
	public MyLeadsPage clickDeleteButton(){
		clickByLink(prop.getProperty("ViewLead.DeleteLead.Link"));
		return new MyLeadsPage(driver, test);
	}	
	
	public FindLeadsPage clickFindLeadsLink(){
		clickByLink(prop.getProperty("ViewLead.FindLeads.Link"));
		return new FindLeadsPage(driver, test);
	}
	
	


}
