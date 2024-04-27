package dsalgo_stepdefinition;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dsalgoPOM.GetStartedPage;
import dsalgoPOM.HomePage;
import dsalgo_commonlibraries.CommonLibraries;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoGetStartedPage extends HomePage
{
public DSalgoGetStartedPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

public GetStartedPage getStartedPage;
public WebElement dropdown;

	@Given("User is on the Get Started Page")
	public void user_is_on_the_get_started_page() {
		getStartedPage.getpageTitle();
	}

	@When("User clicks on Data Structures dropdown arrow")
	public void user_clicks_on_data_structures_dropdown_arrow() {
		getStartedPage.clickDropdown().click();
	}

	@Then("User should see the list of six options in Data Structures dropdown pane")
	public void user_should_see_the_list_of_six_options_in_data_structures_dropdown_pane() {
	    
	}

	@When("User clicks on any option")
	public void user_clicks_on_any_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see the error message {string}")
	public void user_should_see_the_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Get Started button of any Data Structures section")
	public void user_clicks_on_get_started_button_of_any_data_structures_section() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see register and login links")
	public void user_should_see_register_and_login_links() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}

