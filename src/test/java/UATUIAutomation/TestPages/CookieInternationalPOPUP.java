package UATUIAutomation.TestPages;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import UATUIAutomation.Base;
import UATUIAutomation.objectRepository;
import UATUIAutomation.Locators.BlueCoreLocator;
import UATUIAutomation.Locators.CookieLocator;
import UATUIAutomation.Locators.HomePageLocator;
import UATUIAutomation.Locators.InternationalPOPUPLocator;

public class CookieInternationalPOPUP extends Base {
 
	InternationalPOPUPLocator internationalPOPUPLocator;
	BlueCoreLocator blueCoreLocator;
	CookieLocator cookieLocator;
	public FluentWait<WebDriver> fwait; 
	
	@Test
	public void cookieCloseIcon() throws InterruptedException {
		cookieLocator=new CookieLocator();
		cookieLocator.cookieButton.click();
	Thread.sleep(5000);
		
		blueCoreLocator=new BlueCoreLocator();
//		Random ran=new Random();
//		Instant instant = Instant.now();
//		int nanoAdjustment = instant.getNano();
//       
//		blueCoreLocator.blueCoreEmailField.click();
//		blueCoreLocator.blueCoreEmailField.sendKeys("priyankapatil"+nanoAdjustment+"@gmail.com");
//		blueCoreLocator.blueCoreSpinItButton.click();
		
		blueCoreLocator.blueCoreCloseIcon.click();

	Thread.sleep(10000);
		internationalPOPUPLocator=new InternationalPOPUPLocator();
		internationalPOPUPLocator.internationalCloseIcon.click();
		
	}
}
