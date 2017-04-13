package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_EditLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Edit Lead (positive)";
		testDescription="Edit Lead in Leaf Taps";
		browserName="firefox";
		dataSheetName="TC004";
		category="regression";
		authors="Suren";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName, 
			String firstName,  String lastName){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedName(loggedInName)
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(firstName)
		.clickFindLeadsButton()
		.clickFirstLead()
		.clickEditButton()
		.editLastName(lastName)
		.clickUpdateButton()
		.verifyLastName(lastName);

	}

}
