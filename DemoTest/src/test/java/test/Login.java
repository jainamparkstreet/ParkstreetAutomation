package test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("user navigate to the cockpit website")
	public void user_navigate_to_the_cockpit_website() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("user validates the Home page title")
	public void user_validates_the_home_page_title() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("user enters {string} username")
	public void user_enters_username(String username) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("user enters {string} password")
	public void user_enters_password(String passowrd) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@And("user clicks on the Login button.")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions

	}
	
	
}
