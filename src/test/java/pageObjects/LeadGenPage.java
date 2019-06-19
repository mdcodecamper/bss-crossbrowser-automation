package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import managers.FileReaderManager;

public class LeadGenPage {

	WebDriver driver;
	
	public LeadGenPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// WebElement Lists
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter your email here']") 
	 private WebElement txtbx_Email;
	
	@FindBy(how = How.XPATH, using = "//button[@type='button']") 
	 private WebElement btn_submit;
	
	@FindBy(how = How.CSS, using = "site-manager:nth-child(1) div:nth-child(1) asset-manager:nth-child(1) div:nth-child(1) > p:nth-child(1)") 
	 private WebElement txt_thankyou_msg;
	
	
	
	// Action Methods
	
	public void navigate_to_leadGenPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getLeadGenUrl());
	}
	
	public void clear_txtbx() {
		txtbx_Email.clear();
	}
	
	public void enter_email(String email) {
		txtbx_Email.sendKeys(email);
	}
	
	public void click_submit_button() {
		btn_submit.click();
	}
	
	public void verify_thankyou_msg(String expectedMsg) {
		String actualMsg = txt_thankyou_msg.getText();
		Assert.assertEquals(expectedMsg, actualMsg);
	}
	
}
