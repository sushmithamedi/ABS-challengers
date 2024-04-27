package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GetStartedPage {
	 WebDriver driver;
	 By dropdown = By.xpath("//*[text()='Data Structures']");
	
    

public GetStartedPage(WebDriver driver)
{
	 this.driver=driver;
	 	 	 
}

public String getpageTitle()
{
	return driver.getTitle();	 
}
public WebElement clickDropdown()
{
	return driver.findElement(dropdown);
}

}
