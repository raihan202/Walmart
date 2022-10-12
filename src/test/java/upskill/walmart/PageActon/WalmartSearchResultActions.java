package upskill.walmart.PageActon;

import org.openqa.selenium.support.PageFactory;

import upskill.Utilities.SetupDrivers;
import upskill.walmart.PageElements.WalmartSearchResultLocators;

public class WalmartSearchResultActions {

	WalmartSearchResultLocators WalmartSearchResultLocatorsObj; //make constractor globeli
	
	public WalmartSearchResultActions() {
		WalmartSearchResultLocatorsObj = new WalmartSearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, WalmartSearchResultLocatorsObj); //initialize page factory
		
	}
	
	public void VerifyLaptopItems() {
		WalmartSearchResultLocatorsObj.txtLaptop.isDisplayed();
	}
	
	
	
	
}
