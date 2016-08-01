package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLead extends OpentapsWrappers{

	public ViewLead() {
		if(!verifyTitle("View Lead | opentaps CRM"))
			Reporter.reportStep("This is not View Lead Page", "FAIL");
	}	

	public ViewLead verifyViewLeadUserName(String data) {
		verifyTextContainsByXpath(prop.getProperty("Viewlead.UserName.Xpath"), data);
		return this;
	}














}
