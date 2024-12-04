package UATUIAutomation.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UATUIAutomation.helperClass;

public class HomePageLocator extends helperClass{

	public WebElement copyRightText=getElement("//p[contains(text(),'All Rights Reserved.')]","xpath");
	
	public WebElement countrySelectorButton=getElement("//p[@class='chakra-text css-0']","xpath");
	
	public WebElement shirtMegaMenu=getElement("//a[text()='SHIRTS']","xpath");
	
//	public WebElement blueCoreWindowCloseIcon=getElement("//div[@id='bluecoreConfirmationScreen']//button[text()='×']","xpath");
	
	
//	public By copyrightText=By.xpath("//p[contains(text(),'All Rights Reserved.')]");
	
}
