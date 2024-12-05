package UATUIAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class helperClass extends DriverInitiator{
	
//	DriverInitiator driverInitiator;

// public helperClass() {
//	 driverInitiator=new DriverInitiator();
// }

	public WebElement getElement(String locator,String locatorType) {
		
		WebElement element = null;
		By Locator=null;
		switch(locatorType) {
		case "xpath":
			Locator=By.xpath(locator);
			wait.until(ExpectedConditions.or(
	                ExpectedConditions.presenceOfElementLocated(Locator),
	                ExpectedConditions.elementToBeClickable(Locator)
	            ));
		element=DriverInitiator.driverObject.findElement(Locator);
		break;
		
		case "id":
			Locator=By.id(locator);
			wait.until(ExpectedConditions.or(
	                ExpectedConditions.presenceOfElementLocated(Locator),
	                ExpectedConditions.elementToBeClickable(Locator)
	            ));
			element=DriverInitiator.driverObject.findElement(Locator);
			break;
			
		}
		return element;
	}
	
	public List<WebElement> getElements(String locator,String locatorType) {
		
		List<WebElement> element = null;
		By Locator=null;
		switch(locatorType) {
		case "xpath":
			Locator=By.xpath(locator);
			wait.until(ExpectedConditions.or(
	                ExpectedConditions.presenceOfElementLocated(Locator),
	                ExpectedConditions.elementToBeClickable(Locator)
	            ));
		element=DriverInitiator.driverObject.findElements(Locator);
		break;
		
		case "id":
			Locator=By.id(locator);
			wait.until(ExpectedConditions.or(
	                ExpectedConditions.presenceOfElementLocated(Locator),
	                ExpectedConditions.elementToBeClickable(Locator)
	            ));
			element=DriverInitiator.driverObject.findElements(Locator);
			break;
			
		}
		return element;
	}
}
