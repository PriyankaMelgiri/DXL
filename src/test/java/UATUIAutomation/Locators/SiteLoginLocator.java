package UATUIAutomation.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import UATUIAutomation.Base;
import UATUIAutomation.helperClass;
import UATUIAutomation.objectRepository;

public class SiteLoginLocator extends helperClass{

//	public SiteLoginLocator(WebDriver driverObject) {
//		super();
//	
//	}

	
	public WebElement passwordProtectedSiteHeading=getElement("//h1[text()='Password protected site']","xpath");
	
	public WebElement passwordTitle=getElement("//h1[text()='Password protected site']", "xpath");
	
	public WebElement passwordField=getElement("//input[@name='password']", "xpath");
	
	public WebElement submitButton=getElement("//button[text()='Submit']", "xpath");
	

	
}
