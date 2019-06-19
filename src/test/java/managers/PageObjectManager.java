package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.LeadGenPage;

public class PageObjectManager {

	private WebDriver driver;
	
	LeadGenPage leadPage;
	
	public PageObjectManager(WebDriver driver) {	 
		 this.driver = driver;
	}
	
	public LeadGenPage getLeadGenPage(){ 
		 return (leadPage == null) ? leadPage = new LeadGenPage(driver) : leadPage; 
	}
	
}
