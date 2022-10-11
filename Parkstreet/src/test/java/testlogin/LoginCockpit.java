package testlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCockpit {
	
	public static WebDriver driver;
	
	
	@Before
	public void setUp() {
		
		
		driver = new ChromeDriver();
		
	}
	
	
	@Given("User will navigate to the login page of Cockpit")
	public void user_will_navigate_to_the_login_page_of_cockpit() {
	    // Write code here that turns the phrase above into concrete actions
	   
		driver.get("https://stgcockpit.parkstreet.com/");
	}

	@When("user will validate the title of the login page.")
	public void user_will_validate_the_title_of_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("user enters username")
	public void user_enters_username() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("user enters password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@Then("user clicks on the Login button.")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

}
