package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Create Lead (positive)";
		testDescription="Create Lead in Leaf Taps";
		browserName="chrome";
		dataSheetName="TC003";
		category="regression";
		authors="Suren";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName, String compName, 
			String firstName, String lastName, String source, String MarketCampaign, String Annualrevenue, String Currency, String Phone, String email){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedName(loggedInName)
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(compName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectSource(source)
		.selectMarketingCampaign(MarketCampaign)
		.enterAnnualRevenue(Annualrevenue)
		.selectCurrency(Currency)
		.enterPhoneNumber(Phone)
		.enterEmailAddress(email)
		.clickCreateLead()
		.verifyFirstName(firstName);

	}

}
