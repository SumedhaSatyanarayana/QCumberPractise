package cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("1");
	    throw new PendingException();
	}

	@When("^Title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("1");
	    throw new PendingException();
	}

	@When("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("1");
	    throw new PendingException();
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("1");
	    throw new PendingException();
	}

}
