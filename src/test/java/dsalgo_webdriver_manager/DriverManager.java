package dsalgo_webdriver_manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dsalgoPOM.HomePage;
import dsalgo_utilities.LoggerLoad;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\globaldata.properties");
	    prop.load(fis);
	    String browserName = prop.getProperty("browser");
	    
	    if(browserName.equalsIgnoreCase("chrome"))
	    {
	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
	    }
	    else if(browserName.equalsIgnoreCase("firefox"))
	    {
	    	driver = new FirefoxDriver();
	    }
	    else if(browserName.equalsIgnoreCase("Edge"))
	    {
	    	driver = new EdgeDriver();
	    }
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    return driver;
	}
	
	public HomePage LaunchApplication() throws IOException
	{
		driver = initializeDriver();
		HomePage homepage=new HomePage(driver);
		homepage.goTo();
		return homepage;
	}

	}
