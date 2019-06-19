package stepdefinitions;

import contexts.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	TestContext testContext;
	 
	 public Hooks(TestContext context) {
	 testContext = context;
	 }
	 
	 @Before
	 public void BeforeSteps() {
	 /*What all you can perform here
	 Starting a webdriver [though we dont need to do it as we have done it in TestContext]
	 Setting up DB connections
	 Setting up test data
	 Setting up browser cookies
	 Navigating to certain page
	 or anything before the test
	 */
	 }
	 
	 @After
	 public void AfterSteps() {
		 testContext.getWebDriverManager().quitDriver();;
	 }

}
