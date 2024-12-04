package UATUIAutomation.Locators;

import org.openqa.selenium.WebElement;

import UATUIAutomation.helperClass;

public class Shirt_PLP_Locator extends helperClass{

	public WebElement productNameLink=getElement("//div[contains(@id,'harbor-bay')]//p[contains(text(),'Shirt')]","xpath");
	
	public WebElement producNamePLP=getElement("//article//div//p[2]","xpath");
}
