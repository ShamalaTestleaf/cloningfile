package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}	

	public CreateLeadPage clickCreateLead() throws InterruptedException {
		clickByLink(prop.getProperty("CRMHomePage.CreateLead.Link"));
		Thread.sleep(5000);
		return new CreateLeadPage();
	}

	public MyLeadsPage clickLeadsTab() {
		clickByLink(prop.getProperty("CRMHomePage.Leads.Tab"));
		return new MyLeadsPage();
	}

	}
















