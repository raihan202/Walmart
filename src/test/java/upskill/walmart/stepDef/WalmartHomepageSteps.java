package upskill.walmart.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.walmart.PageActon.WalmartHomePageActions;

public class WalmartHomepageSteps {
	
	WalmartHomePageActions WalmartHomePageActionsObj =new WalmartHomePageActions(); 
	
	
	@Given("^Open Walmart Homepage$")
	public void open_Walmart_Homepage() throws Throwable {
		
	}

	@When("^Search for Laptops$")
	public void search_for_Laptops() throws Throwable {
		WalmartHomePageActionsObj.SearchLaptops();
	}


}



