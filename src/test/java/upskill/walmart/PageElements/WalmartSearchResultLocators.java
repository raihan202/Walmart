package upskill.walmart.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalmartSearchResultLocators {

	@FindBy(xpath="//div/h2[contains(text(),'laptops')]")
	public WebElement txtLaptop;
	
}
