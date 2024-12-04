package UATUIAutomation.Locators;

import org.openqa.selenium.WebElement;

import UATUIAutomation.helperClass;

public class BlueCoreLocator extends helperClass{
	
	//public WebElement blueCoreWindowCloseIcon=getElement("//div[@id='bluecoreConfirmationScreen']//button[text()='×']","xpath");
	
	public WebElement blueCoreEmailField=getElement("bluecoreEmailCaptureEmail","id");
	
	public WebElement blueCoreSpinItButton=getElement("bluecoreEmailCaptureSubmit","id");
	
	public WebElement blueCoreCloseIcon=getElement("//button[text()='×']","xpath");
	
}
