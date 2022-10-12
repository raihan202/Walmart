package upskill.walmart.PageActon;

import org.openqa.selenium.support.PageFactory;

import upskill.Utilities.SetupDrivers;
import upskill.walmart.PageElements.WalmartHomePageLocators;

public class WalmartHomePageActions {

	WalmartHomePageLocators WalmartHomePageLocatorsObj;
	
	public WalmartHomePageActions() {
		
		WalmartHomePageLocatorsObj =new WalmartHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, WalmartHomePageLocatorsObj);
			
	}
	
	public void SearchLaptops() throws Exception {
		Thread.sleep(5000);
		
		WalmartHomePageLocatorsObj.txtbxSearch.sendKeys("laptops");
		Thread.sleep(5000);
		WalmartHomePageLocatorsObj.btnSearchClick.click();
		
	}
	public void handelingAleart() {
		//SetupDrivers.driver.switchTo().alert().accept(); // yes/accept to popup window
		SetupDrivers.driver.switchTo().alert().dismiss(); // no/dismiss to popup window
		//SetupDrivers.driver.switchTo().alert().sendKeys("Survey,good work"); //wright in propts
		//SetupDrivers.driver.switchTo().alert().getText(); //get the text from alert
		
	}
}
