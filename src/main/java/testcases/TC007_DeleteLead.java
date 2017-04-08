package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC007_DeleteLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Duplicate Lead (positive)";
		testDescription="Duplicate Leads in Leaf Taps";
		browserName="chrome";
		dataSheetName="TC006";
		category="regression";
		authors="Suren";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName, 
			String phoneNumber) throws InterruptedException{

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedName(loggedInName)
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickPhoneTab()
		.enterPhoneNumber(phoneNumber)
		.clickFindLeadsButton()
		.clickFirstLead()
		.clickDeleteButton()
		.clickFindLead()
		.enterLeadId(FindLeadsPage.LeadIdOfFirstLead)
		.clickFindLeadsButton()
		.verifyNoRecordsFoundMsg();
	}

}
