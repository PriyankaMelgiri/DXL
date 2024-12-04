package UATUIAutomation.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import UATUIAutomation.Base;
import UATUIAutomation.DriverInitiator;
import UATUIAutomation.objectRepository;
import UATUIAutomation.Locators.SiteLoginLocator;

public class SiteLoginTest extends Base {

	
	SiteLoginLocator siteLoginLocator;
	
	@Test(priority=1)
	public void siteLogin() {
		siteLoginLocator=new SiteLoginLocator();
		if(siteLoginLocator.passwordProtectedSiteHeading.isDisplayed()) {
			siteLoginLocator.passwordField.click();
			siteLoginLocator.passwordField.sendKeys("DXLG#dotcom24");
			siteLoginLocator.submitButton.click();
		}	
	}
	
	
	
}