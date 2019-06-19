package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E_Test {
	
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String lead_gen_url = "https://leadgen.cloudsna.com/?cid=MKT353204&eid=MKT395342&encryptedSnaid=&snaid=&step=start";
		String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
		
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(lead_gen_url);
		 
		
		 
		
		
		 
//		 WebElement gmail_search = driver.findElement(By.xpath("//input[@placeholder='Search mail']"));
//		 gmail_search.sendKeys("subscribers@exct.palmbeachbroup.com");
//		 gmail_search.sendKeys(Keys.ENTER);
//		 Thread.sleep(2000);
//		 
//		 WebElement click_email_from_search_result = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
//		 click_email_from_search_result.click();
//		 Thread.sleep(2000);
//		 
//		 WebElement click_on_the_link = driver.findElement(By.partialLinkText("leadgentest.beaconstreetservices.com"));
//		 click_on_the_link.click();
//		 Thread.sleep(2000);
//		 
//		  old_window = driver.getWindowHandle();
//		 for( String winHandle: driver.getWindowHandles()) {
//			 last_window = winHandle;
//		 }
//		 
//		 driver.switchTo().window(last_window);	 
//		 Thread.sleep(2000);
		 
		 
		 
		 driver.quit();
		 
		 

	}

}
