package tests;

import hooks.PreHooks;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC003_CreateLead extends PreHooks{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create a new Lead with mandatory fields";
		nodes = "Leads";		
		category="Smoke";
		authors="Babu";
	}

	@Test()
	public void createLead(){

		String firstName = 
		homePage
		.clickCRMSFA()		
		.clickLeadLink()		
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName();
		
		createLeadPage
		.enterLastName()
		.enterEmail()
		.clickCreateLeadSubmit()
		.verifyFirstName(firstName);

	}
}
