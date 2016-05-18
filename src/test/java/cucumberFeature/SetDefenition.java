package cucumberFeature;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;

public class SetDefenition {
	
	WebDriver driver = null;

	@Given("^I navigate to website$")
	public void i_navigate_to_website() throws Throwable {
	    driver = new FirefoxDriver();
	    driver.navigate().to("http://learn2test.net/qa/apps/sign_up/v1/");
	}

	@When("^I click on a button RESET$")
	public void i_click_on_REST_button() throws Throwable {
		driver.findElement(By.id("id_reset_button")).click();
	}
	
	@And("^I Populated Form$")
	public void i_filling_the_form() throws Throwable {
		driver.findElement(By.id("id_fname")).clear();
		driver.findElement(By.id("id_fname")).sendKeys("John");		
		driver.findElement(By.id("id_lname")).clear();
		driver.findElement(By.id("id_lname")).sendKeys("Smith");
		driver.findElement(By.id("id_email")).clear();
		driver.findElement(By.id("id_email")).sendKeys("john@gmail.com");
		driver.findElement(By.id("id_phone")).clear();
		driver.findElement(By.id("id_phone")).sendKeys("4157896543");	
		driver.findElement(By.id("id_g_radio_01")).click();	
		driver.findElement(By.id("id_state")).sendKeys("c");		
		driver.findElement(By.id("id_checkbox")).click();
		driver.findElement(By.id("id_submit_button")).click();
	}
	
	@Then("^Verify Title Page$")
	public void not_should_be_sign_Up_page() throws Throwable {
		//Assert.assertTrue("User Sign Up page", 
		//driver.getTitle().equals("Confirmation"));
		Assert.assertTrue(driver.getTitle().contains("Confirmation"));
	    driver.quit();
	}
	
}
