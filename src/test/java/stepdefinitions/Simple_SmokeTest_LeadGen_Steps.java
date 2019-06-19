package stepdefinitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.LeadGenPage;

public class Simple_SmokeTest_LeadGen_Steps {
	private static WebDriver driver;
	
	LeadGenPage leadPage;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	
	@Given("^User navigate to LeadGen in Prod$")
	public void user_navigate_to_LeadGen_in_Prod() throws Throwable {
		
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		leadPage = new LeadGenPage(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		driver.get(FileReaderManager.getInstance().getConfigReader().getLeadGenUrl());		
		
		
	}

	@When("^User enter Email$")
	public void user_enter_Email() throws Throwable {		
		
		leadPage.clear_txtbx();
		leadPage.enter_email("jonszygm+ProdEletterAuto@gmail.com");			    
		Thread.sleep(2000);
	}

	@When("^User Click on Submit button$")
	public void user_Click_on_Submit_button() throws Throwable {

		leadPage.click_submit_button();
	    Thread.sleep(2000);
	}

	@Then("^User verify that thankyou page is displayed$")
	public void user_verify_that_thankyou_page_is_displayed() throws Throwable {
		String expected_msg = "Thank you for signing up Crux";
		
		leadPage.verify_thankyou_msg(expected_msg);
	    Thread.sleep(2000);
	}
	
	@And("^User close the browser$")
	public void user_close_the_browser() throws Throwable{
		driver.close();
	}

}
