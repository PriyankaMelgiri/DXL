package UATUIAutomation.TestPages;

import org.testng.Assert;
import org.testng.annotations.Test;

import UATUIAutomation.Locators.ShirtPDPLocator;
import UATUIAutomation.Locators.Shirt_PLP_Locator;

public class ShirtPLPPageTest {
	Shirt_PLP_Locator shirt_PLP_Locator;
	ShirtPDPLocator shirtPDPLocator;
	
  @Test
  public void producNameLink() {
	  shirt_PLP_Locator=new Shirt_PLP_Locator();
	  String productName=shirt_PLP_Locator.producNamePLP.getText();
	  shirt_PLP_Locator.productNameLink.click();
	  shirtPDPLocator=new ShirtPDPLocator();
	  String PDPBreadcrumb=shirtPDPLocator.PDPBreadcrumb.getText();
	  Assert.assertEquals(productName,PDPBreadcrumb);
  }
}
