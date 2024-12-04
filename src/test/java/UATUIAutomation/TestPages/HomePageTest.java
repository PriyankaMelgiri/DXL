package UATUIAutomation.TestPages;

import org.testng.Assert;
import org.testng.annotations.Test;

import UATUIAutomation.Base;
import UATUIAutomation.DriverInitiator;
import UATUIAutomation.Locators.CountrySelectorPOPUP;
import UATUIAutomation.Locators.HomePageLocator;

public class HomePageTest extends DriverInitiator{
	
	HomePageLocator homePageLocator;
	CountrySelectorPOPUP countrySelectorPOPUP;
	
  @Test
  public void countrySelector() throws InterruptedException {
	 
	  homePageLocator=new HomePageLocator();
	  action.scrollToElement(homePageLocator.copyRightText);

	  homePageLocator.countrySelectorButton.click();
	  
	  countrySelectorPOPUP=new CountrySelectorPOPUP();
	  
	  countrySelectorPOPUP.proceedAsUSCustomer.click();
	  Thread.sleep(3000);
	  String selectedCountry=homePageLocator.countrySelectorButton.getText();
	  Assert.assertEquals(selectedCountry, "United States (USD)");
	  
	  action.scrollToElement(homePageLocator.shirtMegaMenu);
	  homePageLocator.shirtMegaMenu.click();
	 String currentURLPLP= driverObject.getCurrentUrl();
	 Assert.assertEquals(currentURLPLP, "https://uat.cofe.dxl.com/c/shirts");
  }
}
