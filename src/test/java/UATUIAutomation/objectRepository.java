package UATUIAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;

import UATUIAutomation.Locators.InternationalPOPUPLocator;
import UATUIAutomation.Locators.SiteLoginLocator;
import UATUIAutomation.TestPages.SiteLoginTest;


public class objectRepository{

	public SiteLoginLocator siteLoginLocator;
	 public helperClass helperclass;
	public InternationalPOPUPLocator internationalPOPUPLocator;
	 
	 public objectRepository() {
		
		
		helperclass=new helperClass();
		siteLoginLocator=new SiteLoginLocator();
		internationalPOPUPLocator=new InternationalPOPUPLocator();
		
		
	}

	
}
