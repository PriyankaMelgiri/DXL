package UATUIAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverInitiator  {

	public static WebDriver driverObject;
	public static WebDriverWait wait;
	public static Actions action;
	
	public void driverInitiator(WebDriver driverObject,WebDriverWait wait,Actions action) {
		this.driverObject=driverObject;
		this.wait=wait;
		DriverInitiator.action=action;
	}
}
