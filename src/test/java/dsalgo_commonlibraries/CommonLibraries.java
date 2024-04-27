package dsalgo_commonlibraries;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.DriverManager;

public class CommonLibraries{
	DriverManager driverManager=new DriverManager();
	     public void OpenBrowser()
	   {	
		    LoggerLoad.info("Testing on Chrome");
		   // getdriver();
		    //getdriver().manage().window().maximize();
		    //getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				}
	//public void getUrl()
	//{
		//driver.get(URL);
		//LoadUrl();
		//System.out.println("I am url"+LoadUrl());
		//try {
		//driverManager.driver.get(URL);
	   //String currURL = driverManager.driver.getCurrentUrl();
	   //System.out.println(currURL);	
	   //Assert.assertEquals(currURL,URL);
		//}
		//catch (NoSuchElementException e){
			//LoggerLoad.error(URL);
			
			//Assert.fail();
		}
	/*public WebDriver getDriver()
	{
		return driverManager.driver;
	}*/
	//}
	

