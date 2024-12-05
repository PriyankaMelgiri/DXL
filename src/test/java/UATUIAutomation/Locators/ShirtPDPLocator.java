package UATUIAutomation.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;

import UATUIAutomation.helperClass;

public class ShirtPDPLocator extends helperClass{

	public WebElement PDPBreadcrumb=getElement("//ol[contains(@class,'chakra-breadcrumb__list')]//li[4]","xpath");

	public List<WebElement> productSize=getElements("//p[@aria-label='Size']//parent::div//following-sibling::div//div","xpath");
	
}
