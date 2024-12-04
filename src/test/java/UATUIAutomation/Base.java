package UATUIAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Base {
	
	public WebDriver driverObject;
	public WebDriverWait wait;
	public DriverInitiator driverInitiator; 
	public Actions action;
		
  @BeforeSuite
  @Parameters({"browser","URL"})
  public void launchsite(@Optional ("chrome") String browser,@Optional("https://uat.cofe.dxl.com/")String URL) {
	  switch(browser) {
	  case "chrome":
		  driverObject=new ChromeDriver();
		  break;
		  
	  case "FireFox":
		  driverObject=new FirefoxDriver();
	  }
	  
	  wait=new WebDriverWait(driverObject,Duration.ofSeconds(20));
	  action=new Actions(driverObject);
	  driverObject.manage().window().maximize();
	  driverObject.get(URL);
	  driverInitiator=new DriverInitiator();
	  driverInitiator.driverInitiator(driverObject, wait,action);
	  
  }
  
  @AfterSuite
  public void tearDown() {
	  driverObject.close();
  }
}
