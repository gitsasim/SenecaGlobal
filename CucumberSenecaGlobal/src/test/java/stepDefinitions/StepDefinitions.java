package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitions {
	
	public static WebDriver driver;
	
	@Given("^user is navigated to google Page$")
	public void user_is_navigated_to_google_Page() throws Throwable {
	    
	    System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Selenium\\Drivers\\chromedriver_win32_new\\chromedriver.exe");	
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");	
				
	}

	@When("^user clicks on I am Feeling Lucky button$")
	public void user_clicks_on_I_am_Feeling_Lucky_button() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.RNmpXc")).submit();
	}
	

	@Then("^user is navigated to doodles page$")
	public void user_is_navigated_to_doodles_page() throws Throwable {
	    
		String actualTitle = driver.getTitle();
	    String expectedTitle = "Google Doodles";
	    Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Then("^user gets the title/hyperlink/div tag of the first doodle thumbnail$")
	public void user_gets_the_title_hyperlink_div_tag_of_the_first_doodle_thumbnail() throws Throwable {
	    
		Thread.sleep(2000);
		driver.findElement(By.id("latest-title"));
	}

	@Then("^user prints the result$")
	public void user_prints_the_result() throws Throwable {
	    driver.quit();
	}
	
	
	@Given("^user is navigated to facebook page$")
	public void user_is_navigated_to_facebook_page() throws Throwable {
		
	    System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Selenium\\Drivers\\chromedriver_win32_new\\chromedriver.exe");	
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");	
	}

	@When("^user clicks on Create New Account link$")
	public void user_clicks_on_Create_New_Account_link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#u_0_2_SJ"));
	}

	@When("^user complete the steps$")
	public void user_complete_the_steps() throws Throwable {

		driver.findElement(By.name("firstname")).sendKeys("Sasim");
	}

	@Then("^user clicks on Sign Up button$")
	public void user_clicks_on_Sign_Up_button() throws Throwable {
		
		driver.findElement(By.id("u_f_s_P8"));
		driver.quit();
	}
	
	
}
