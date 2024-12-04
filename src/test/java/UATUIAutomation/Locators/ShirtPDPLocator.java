package UATUIAutomation.Locators;

import org.openqa.selenium.WebElement;

import UATUIAutomation.helperClass;

public class ShirtPDPLocator extends helperClass{

	public WebElement PDPBreadcrumb=getElement("//ol[contains(@class,'chakra-breadcrumb__list')]//li[4]","xpath");
	
}
