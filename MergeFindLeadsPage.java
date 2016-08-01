package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeFindLeadsPage extends OpentapsWrappers{

	public MergeFindLeadsPage() {
		//if(!verifyTitle("Find Leads"))
			//Reporter.reportStep("This is not Find Leads Home Page", "FAIL");
	}	

	public MergeFindLeadsPage enterfirstName(String data) {
		childWindows();
		enterByName(prop.getProperty("MergeLead.FindLeads.FirstName.name"), data);
		return this;
	}
	
		public MergeFindLeadsPage clickFindLeads() throws InterruptedException {
		clickByClassName(prop.getProperty("MergeLead.FindLeads.FindLeads.class"));
		Thread.sleep(6000);
		return this;
		}
		public MergeLeadPage clickLeadLink() throws InterruptedException {
			clickByXpath(prop.getProperty("MergeLead.FindLeads.Link.Xpath"));
			Thread.sleep(6000);
			//childWindows();
			return new MergeLeadPage();
		}
	

}
