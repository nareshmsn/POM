package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPopupPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC005_MergeLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Merge Leads (positive)";
		testDescription="Merge Leads in Leaf Taps";
		browserName="chrome";
		dataSheetName="TC005";
		category="regression";
		authors="Suren";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName, 
			String FirstName){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedName(loggedInName)
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeadIcon()
		.enterFirstName(FirstName)
		.clickFindLeadsBtn()
		.clickFirstLead()
		.clickToLeadIcon()
		.enterFirstName(FirstName)
		.clickFindLeadsBtn()
		.clickSecondLead()
		.clickMergeButton()
		.clickFindLeadsLink()
		.enterLeadId(FindLeadsPopupPage.LeadId)
		.clickFindLeadsButton()
		.verifyNoRecordsFoundMsg();

	}

}
