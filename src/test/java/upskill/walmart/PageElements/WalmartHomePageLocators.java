package upskill.walmart.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalmartHomePageLocators {

	//selenium page factory
	@FindBy(xpath="//input[@type='search']") //search text box expath
	public WebElement txtbxSearch;
	
	@FindBy(xpath="//button[@aria-label='Search icon']")
	public WebElement btnSearchClick;
	
	
}
