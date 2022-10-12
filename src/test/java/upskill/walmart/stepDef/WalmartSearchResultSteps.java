package upskill.walmart.stepDef;

import cucumber.api.java.en.Then;
import upskill.walmart.PageActon.WalmartSearchResultActions;

public class WalmartSearchResultSteps {

	WalmartSearchResultActions WalmartSearchResultActionsObj = new WalmartSearchResultActions();
	
	
	
	
	@Then("^Item list should have only Laptops related products$")
	public void item_list_should_have_only_Laptops_related_products() throws Throwable {
		WalmartSearchResultActionsObj.VerifyLaptopItems();
	}
	
}
