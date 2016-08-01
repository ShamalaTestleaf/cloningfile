package pages;

import org.testng.Reporter;

import wrappers.OpentapsWrappers;

public class MergeLeadPage extends OpentapsWrappers{

	public MergeLeadPage() {
		//if(!verifyTitle("Merge Leads | opentaps CRM"))
		//Reporter.reportStep("This is not Merge Lead Home Page", "FAIL");
	}	

	public MergeFindLeadsPage clickFromLead() throws InterruptedException {
		clickByXpath(prop.getProperty("MergeLead.FromLead.Xpath"));
		Thread.sleep(11000);
		childWindows();
		return new MergeFindLeadsPage();
	}

	public MergeFindLeadsPage clickToLead() throws InterruptedException {
		clickByXpath(prop.getProperty("MergeLead.ToLead.Xpath"));
		Thread.sleep(10000);
		childWindows();
		return new MergeFindLeadsPage();
	}
	
	public MergeLeadPage clickMergeButton () throws InterruptedException{
		childWindows();
		clickByClassName(prop.getProperty("MergeLead.MergeButton.Class"));
		Thread.sleep(10000);
		return this;
	}
}
